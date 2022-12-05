package com.example.modulebxhdoidua;


import com.example.modulebxhdoidua.Auth.AuthService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class AuthServiceTests {
    @Autowired
    AuthService authService;
    @Test
    void testLoginSuccessShouldReturnTrue() {
        String username = "thanhpc";
        String password = "thanhpc";
        boolean isLogin = authService.authLogin(username, password);
        Assertions.assertEquals(isLogin, true);
    }
    @Test
    void testLoginFailureShouldReturnFalse() {
        String username = "thanhpcx";
        String password = "thanhpc";
        boolean isLogin = authService.authLogin(username, password);
        Assertions.assertEquals(isLogin, false);
    }
}
