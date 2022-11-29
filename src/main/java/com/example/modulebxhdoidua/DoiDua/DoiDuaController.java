package com.example.modulebxhdoidua.DoiDua;

import com.example.modulebxhdoidua.GiaiDau.GiaiDau;
import com.example.modulebxhdoidua.GiaiDau.GiaiDauService;
import com.example.modulebxhdoidua.Response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    @PostMapping("")
    public String bxhDoiDuaPost(@RequestBody ThongKeDto body, HttpSession session) {
        Integer namToChuc = body.getGiaiDau();
        Optional<GiaiDau> giaiDau = giaiDauService.getByNamToChuc(namToChuc);
        Set<DoiDua> listDoiDua = giaiDau.get().getListDoiDua();
        session.setAttribute("listDoiDua", listDoiDua);
        return "bangxephangdoidua";
    }

    @GetMapping("")
    public String bxhDoiDua(HttpSession session, RedirectAttributes ra) {
        if(session.getAttribute("username") == null) {
            ra.addFlashAttribute("requireLogin", "Vui lòng đăng nhập để xem bảng xếp hạng!");
            return "redirect:/auth/login";
        } else {
            Set<DoiDua> listDoiDua = (Set<DoiDua>) session.getAttribute("listDoiDua");
            for(DoiDua doiDua: listDoiDua) {
                System.out.println(doiDua);
            }
            return "bangxephangdoidua";
        }
    }

}
