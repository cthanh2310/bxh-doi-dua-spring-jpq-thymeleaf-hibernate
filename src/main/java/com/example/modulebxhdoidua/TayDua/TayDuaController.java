package com.example.modulebxhdoidua.TayDua;

import com.example.modulebxhdoidua.ChangDua.ChangDua;
import com.example.modulebxhdoidua.ChangDua.ChangDuaService;
import com.example.modulebxhdoidua.DoiDua.DoiDua;
import com.example.modulebxhdoidua.DoiDua.DoiDuaService;
import com.example.modulebxhdoidua.DoiDuaTayDua.DoiDuaTayDua;
import com.example.modulebxhdoidua.KetQua.KetQua;
import com.example.modulebxhdoidua.KetQua.KetQuaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
@RequestMapping("bang-xep-hang-tay-dua")
public class TayDuaController {
    @Autowired TayDuaService tayDuaService;
    @Autowired
    ChangDuaService changDuaService;

    @Autowired
    DoiDuaService doiDuaService;

    @Autowired
    KetQuaService ketQuaService;

    @GetMapping("/{id}")
    public String bxhTayDua(@PathVariable("id") Integer id, HttpSession session, RedirectAttributes ra, Model model) {
        if(session.getAttribute("username") == null) {
            ra.addFlashAttribute("requireLogin", "Vui lòng đăng nhập để xem bảng xếp hạng tay đua!");
            return "redirect:/auth/login";
        }
        Optional<ChangDua> changDua = changDuaService.getChangDuaById(id);
        Integer doiDuaId = (Integer) session.getAttribute("doiDuaId");
        Optional<DoiDua> doiDua = doiDuaService.getDoiDuaById(doiDuaId);
        Set<DoiDuaTayDua> listDoiDuaTayDua = doiDua.get().getListDoiDuaTayDua();

        List<TayDuaDto> listTayDuaDto = new ArrayList<>();
        for(DoiDuaTayDua doiDuaTayDua: listDoiDuaTayDua) {
            System.out.println(doiDuaTayDua.getId());
            System.out.println(changDua.get().getId());
            Optional<KetQua> ketQua = ketQuaService.findByDoiDuaTayDuaAndChangDua(doiDuaTayDua.getId(), changDua.get().getId());
            System.out.println(ketQua);
            listTayDuaDto.add(new TayDuaDto(doiDuaTayDua.getTayDua().getId(), doiDuaTayDua.getTayDua().getThanhVien().getHoTen(), ketQua.get().getChangDua().getTen(), ketQua.get().getThoiGianVeDich(), ketQua.get().getThuHang(), ketQua.get().getDiem()));
        }
        Collections.sort(listTayDuaDto, new Comparator<TayDuaDto>() {
            @Override
            public int compare(TayDuaDto o1, TayDuaDto o2) {
                return o2.diem - o1.diem;
            }
        });
        Integer namToChuc = (Integer) session.getAttribute("namToChuc");
        model.addAttribute("namToChuc", namToChuc);
        model.addAttribute("listTayDuaDto", listTayDuaDto);
        model.addAttribute("changDuaId", id);
        for(TayDuaDto tayDuaDto: listTayDuaDto) {
            System.out.println(tayDuaDto);
        }
        return "bangxephangtaydua";

    }

}
