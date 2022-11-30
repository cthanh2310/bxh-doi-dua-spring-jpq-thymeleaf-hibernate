package com.example.modulebxhdoidua.ChangDua;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("bang-xep-hang-chang-dua")
public class ChangDuaController {

    @GetMapping("/{id}")
    public String bxhChangDua(HttpSession session,@PathVariable("id") Integer id, RedirectAttributes ra) {
        if(session.getAttribute("username") == null) {
            ra.addFlashAttribute("requireLogin", "Vui lòng đăng nhập để xem bảng xếp hạng chặng đua");
            return "redirect:/auth/login";
        } else {
            System.out.println(id);
            return "bangxephangchangdua";
        }
    }

}
