package com.example.modulebxhdoidua;

import com.example.modulebxhdoidua.ChangDua.ChangDua;
import com.example.modulebxhdoidua.DoiDua.DoiDua;
import com.example.modulebxhdoidua.GiaiDau.GiaiDau;
import com.example.modulebxhdoidua.GiaiDau.GiaiDauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Controller
public class MainController {
    @Autowired private GiaiDauService giaiDauService;

    @GetMapping("")
    public String homePage(HttpSession session, RedirectAttributes ra) {
        if(session.getAttribute("username") == null) {
            ra.addFlashAttribute("requireLogin", "Vui lòng đăng nhập để xem bảng xếp hạng!");
            return "redirect:/auth/login";
        } else {
            return "index";
        }
    }

    @GetMapping("/chon-thong-ke")
    public String bangXepHangPage(HttpSession session, RedirectAttributes ra, Model model) {
        if(session.getAttribute("username") == null) {
            ra.addFlashAttribute("requireLogin", "Vui lòng đăng nhập để xem bảng xếp hạng!");
            return "redirect:/auth/login";
        } else {
            Iterable<GiaiDau> listGiaiDau = giaiDauService.getAll();
            model.addAttribute("listGiaiDau", listGiaiDau);
            return "chonthongke";
        }
    }
}
