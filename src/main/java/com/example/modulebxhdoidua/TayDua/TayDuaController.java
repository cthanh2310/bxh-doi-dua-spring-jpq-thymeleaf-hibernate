package com.example.modulebxhdoidua.TayDua;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller
@RequestMapping("bang-xep-hang-tay-dua")
public class TayDuaController {
    @Autowired TayDuaService tayDuaService;

    @GetMapping("/{id}")
    public String bxhTayDua(@PathVariable("id") Integer id, HttpSession session, RedirectAttributes ra) {
        if(session.getAttribute("username") == null) {
            ra.addFlashAttribute("requireLogin", "Vui lòng đăng nhập để xem bảng xếp hạng tay đua!");
            return "redirect:/auth/login";
        }
//            System.out.println(id);
        System.out.println("vao day" + id);
        return "bangxephangtaydua";

    }

}
