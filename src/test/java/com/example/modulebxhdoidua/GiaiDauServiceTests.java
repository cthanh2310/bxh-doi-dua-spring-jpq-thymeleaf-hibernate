package com.example.modulebxhdoidua;

import com.example.modulebxhdoidua.ChangDua.ChangDua;
import com.example.modulebxhdoidua.GiaiDau.GiaiDau;
import com.example.modulebxhdoidua.GiaiDau.GiaiDauService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
import java.util.Set;
import java.util.stream.StreamSupport;

@SpringBootTest
public class GiaiDauServiceTests {
    @Autowired
    GiaiDauService giaiDauService;

    @Test
    void getAllGiaiDauShouldSuccess() {
        Iterable<GiaiDau> listGiaiDau = giaiDauService.getAll();
        Assertions.assertNotNull(listGiaiDau);
        for(GiaiDau giaiDau: listGiaiDau) {
            System.out.println(giaiDau);
        }
    }

    @Test
    void getGiaiDauByNamToChucShouldSuccess() {
        Optional<GiaiDau> giaiDau = giaiDauService.getByNamToChuc(2022);
        Assertions.assertTrue(giaiDau.isPresent());
    }
    @Test
    void getGiaiDauByNamToChucShouldFailure() {
        Optional<GiaiDau> giaiDau = giaiDauService.getByNamToChuc(2023);
        Assertions.assertFalse(giaiDau.isPresent());
    }
}
