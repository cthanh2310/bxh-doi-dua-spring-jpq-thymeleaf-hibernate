package com.example.modulebxhdoidua;

import com.example.modulebxhdoidua.ChangDua.ChangDua;
import com.example.modulebxhdoidua.ChangDua.ChangDuaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class ChangDuaServiceTests {
    @Autowired
    ChangDuaService changDuaService;

    @Test
    void getChangDuaByIdShouldSuccess() {
        Optional<ChangDua> changDua = changDuaService.getChangDuaById(1);
        System.out.println(changDua);
        Assertions.assertTrue(changDua.get().getTen().equals("Hà Giang – Hà Tĩnh"));
    }
    @Test
    void getChangDuaByIdShouldFailure() {
        Optional<ChangDua> changDua = changDuaService.getChangDuaById(122);
        Assertions.assertTrue(changDua.isPresent() == false);
    }
}
