package com.example.modulebxhdoidua.ChangDua;

import com.example.modulebxhdoidua.DoiDua.DoiDua;
import com.example.modulebxhdoidua.DoiDua.DoiDuaService;
import com.example.modulebxhdoidua.DoiDuaTayDua.DoiDuaTayDua;
import com.example.modulebxhdoidua.GiaiDau.GiaiDau;
import com.example.modulebxhdoidua.GiaiDau.GiaiDauService;
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
@RequestMapping("bang-xep-hang-chang-dua")
public class ChangDuaController {

    @Autowired
    DoiDuaService doiDuaService;
    @Autowired
    GiaiDauService giaiDauService;

    @Autowired
    KetQuaService ketQuaService;

    @GetMapping("/{id}")
    public String bxhChangDua(Model model, HttpSession session, @PathVariable("id") Integer id, RedirectAttributes ra) {
        if(session.getAttribute("username") == null) {
            ra.addFlashAttribute("requireLogin", "Vui lòng đăng nhập để xem bảng xếp hạng chặng đua");
            return "redirect:/auth/login";
        } else {
            session.setAttribute("doiDuaId", id);
            Optional<DoiDua> doiDua = doiDuaService.getDoiDuaById(id);
            Set<DoiDuaTayDua> listDDTD = doiDua.get().getListDoiDuaTayDua();
            Integer namToChuc = (Integer) session.getAttribute("namToChuc");
            Optional<GiaiDau> giaiDau = giaiDauService.getByNamToChuc(namToChuc);
            Set<ChangDua> listChangDua = giaiDau.get().getListChangDua();
            List<ChangDuaDto> listChangDuaDto = new ArrayList<>();
            for(ChangDua changDua: listChangDua) {
                Integer tongDiem = 0;
                Integer tongThoiGian = 0;
                for(DoiDuaTayDua doiDuaTayDua: listDDTD) {
                    tongDiem += ketQuaService.getDiemByDoiDuaTayDuaAndChangDua(doiDuaTayDua.getId(), changDua.getId());
                    tongThoiGian += ketQuaService.getThoiGianByDoiDuaTayDuaAndChangDua(doiDuaTayDua.getId(), changDua.getId());
                }
                listChangDuaDto.add(new ChangDuaDto(changDua.getId(), changDua.getTen(), tongDiem, tongThoiGian));
            }
            Collections.sort(listChangDuaDto, new Comparator<ChangDuaDto>() {
                @Override
                public int compare(ChangDuaDto o1, ChangDuaDto o2) {
                    return o2.getTongDiem() - o1.getTongDiem();
                }
            });
            model.addAttribute("listChangDuaDto",listChangDuaDto);
            model.addAttribute("namToChuc", namToChuc);
            model.addAttribute("tenDoiDua", doiDua.get().getTen());
            return "bangxephangchangdua";
        }
    }

}
