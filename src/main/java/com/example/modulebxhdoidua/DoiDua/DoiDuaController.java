package com.example.modulebxhdoidua.DoiDua;

import com.example.modulebxhdoidua.DoiDuaTayDua.DoiDuaTayDua;
import com.example.modulebxhdoidua.DoiDuaTayDua.DoiDuaTayDuaService;
import com.example.modulebxhdoidua.GiaiDau.GiaiDau;
import com.example.modulebxhdoidua.GiaiDau.GiaiDauService;
import com.example.modulebxhdoidua.KetQua.KetQua;
import com.example.modulebxhdoidua.KetQua.KetQuaService;
import com.example.modulebxhdoidua.ThongKe.ThongKeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.Optional;
import java.util.Set;

@Controller
@RequestMapping("bang-xep-hang-doi-dua")
public class DoiDuaController {
    @Autowired GiaiDauService giaiDauService;
    @Autowired DoiDuaService doiDuaService;
    @Autowired
    DoiDuaTayDuaService doiDuaTayDuaService;
    @Autowired
    KetQuaService ketQuaService;

    @PostMapping("")
    public String bxhDoiDuaPost(@RequestBody ThongKeDto body, HttpSession session) {
        Integer namToChuc = body.getGiaiDau();
        Optional<GiaiDau> giaiDau = giaiDauService.getByNamToChuc(namToChuc);
        Set<DoiDua> listDoiDua = giaiDau.get().getListDoiDua();
        session.setAttribute("listDoiDua", listDoiDua);
        return "bangxephangdoidua";
    }

    @GetMapping("")
    public String bxhDoiDua(HttpSession session, RedirectAttributes ra, Model model) {
        if(session.getAttribute("username") == null) {
            ra.addFlashAttribute("requireLogin", "Vui lòng đăng nhập để xem bảng xếp hạng!");
            return "redirect:/auth/login";
        } else {
            Optional<DoiDua> doiDua = doiDuaService.getById(1);
            System.out.println(doiDua.get().getListDoiDuaTayDua());
            Long sumDiem = ketQuaService.sumDiem(1);
            System.out.println("sumDiem" + sumDiem);
            return "bangxephangdoidua";
        }
    }

}
