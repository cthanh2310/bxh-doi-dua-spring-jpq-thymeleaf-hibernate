package com.example.modulebxhdoidua;

import com.example.modulebxhdoidua.KetQua.KetQua;
import com.example.modulebxhdoidua.KetQua.KetQuaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class KetQuaServiceTests {
    @Autowired
    KetQuaService ketQuaService;

    @Test
    void sumDiemShouldReturnIntegerNumberGreaterThanZero() {
        Integer ddtdId = 1;
        Integer sumDiem = ketQuaService.sumDiem(ddtdId);
        System.out.println(sumDiem);
        Assertions.assertTrue(sumDiem > 0);
    }

    @Test
    void sumThoiGianShouldReturnIntegerNumberGreaterThanZero() {
        Integer ddtdId = 1;
        Integer sumThoiGian = ketQuaService.sumThoiGian(ddtdId);
        System.out.println(sumThoiGian);
        Assertions.assertTrue(sumThoiGian > 0);
    }

    @Test
    void getDiemByDoiDuaTayDuaAndChangDuaShouldSuccess() {
        Integer ddtd = 1;
        Integer changDua = 1;
        Integer diem = ketQuaService.getDiemByDoiDuaTayDuaAndChangDua(ddtd, changDua);
        System.out.println(diem);
        Assertions.assertTrue(diem > 0);
    }

    @Test
    void getDiemByDoiDuaTayDuaAndChangDuaShouldFailure() {
        Integer ddtd = 10;
        Integer changDua = 122;
        Integer diem = ketQuaService.getDiemByDoiDuaTayDuaAndChangDua(ddtd, changDua);
        Assertions.assertTrue(diem == null);
    }

    @Test
    void getThoiGianByDoiDuaTayDuaAndChangDuaShouldSuccess() {
        Integer ddtd = 1;
        Integer changDua = 1;
        Integer tg = ketQuaService.getThoiGianByDoiDuaTayDuaAndChangDua(ddtd, changDua);
        System.out.println(tg);
        Assertions.assertTrue(tg > 0);
    }

    @Test
    void getThoiGianByDoiDuaTayDuaAndChangDuaShouldFailure() {
        Integer ddtd = 10;
        Integer changDua = 122;
        Integer tg = ketQuaService.getThoiGianByDoiDuaTayDuaAndChangDua(ddtd, changDua);
        Assertions.assertTrue(tg == null);
    }

    @Test
    void findKQByDoiDuaTayDuaAndChangDuaShouldSuccess() {
        Integer ddtd = 1;
        Integer changDua = 1;
        Optional<KetQua> ketQua = ketQuaService.findByDoiDuaTayDuaAndChangDua(ddtd, changDua);
        System.out.println(ketQua);
        Assertions.assertTrue(ketQua.isPresent());
    }

    @Test
    void findKQByDoiDuaTayDuaAndChangDuaShouldFailure() {
        Integer ddtd = 10;
        Integer changDua = 122;
        Optional<KetQua> ketQua = ketQuaService.findByDoiDuaTayDuaAndChangDua(ddtd, changDua);
        Assertions.assertFalse(ketQua.isPresent());
    }
}
