package com.example.modulebxhdoidua.DoiDua;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("bang-xep-hang-doi-dua")
public class DoiDuaController {
    @PostMapping("")
    public String bxhDoiDuaPost(@RequestBody ThongKeDto body) {
        System.out.println(body.getLoaiTK());
        System.out.println(body.getGiaiDau());
        return "redirect:/bang-xep-hang-doi-dua";
    }

    @GetMapping("")
    public String bxhDoiDua(HttpSession session, RedirectAttributes ra) {
        if(session.getAttribute("username") == null) {
            ra.addFlashAttribute("requireLogin", "Vui lòng đăng nhập để xem bảng xếp hạng!");
            return "redirect:/auth/login";
        } else {
            System.out.println("vao get");
            return "bangxephangdoidua";
        }
    }

}
