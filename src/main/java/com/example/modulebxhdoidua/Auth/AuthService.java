package com.example.modulebxhdoidua.Auth;

import com.example.modulebxhdoidua.ThanhVien.ThanhVien;
import com.example.modulebxhdoidua.ThanhVien.ThanhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpSession;
import java.util.Optional;

@Service
public class AuthService {
    @Autowired
    private ThanhVienRepository thanhVienRepo;

    public boolean authLogin(String username, String password) {
        Optional<ThanhVien> tv = thanhVienRepo.findByUsername(username);
        if(tv.isPresent() && tv.get().getPassword().equals(password)) {
            return true;
        }
        return false;
    }
}
