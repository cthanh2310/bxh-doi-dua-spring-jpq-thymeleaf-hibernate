package com.example.modulebxhdoidua;

import com.example.modulebxhdoidua.ChangDua.ChangDua;
import com.example.modulebxhdoidua.DoiDua.DoiDua;
import com.example.modulebxhdoidua.DoiDua.DoiDuaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class DoiDuaServiceTests {
    @Autowired
    DoiDuaService doiDuaService;

    @Test
    void getdoiDuaByIdShouldSuccess() {
        Optional<DoiDua> doiDua = doiDuaService.getDoiDuaById(1);
        System.out.println(doiDua);
        Assertions.assertTrue(doiDua.get().getTen().equals("Honda-hd1"));
    }
    @Test
    void getdoiDuaByIdShouldFailure() {
        Optional<DoiDua> doiDua = doiDuaService.getDoiDuaById(122);
        Assertions.assertTrue(doiDua.isPresent() == false);
    }

}
