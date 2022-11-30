package com.example.modulebxhdoidua.KetQua;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class KetQuaService {

    @Autowired KetQuaRepository ketQuaRepository;
    public Optional<Set<KetQua>> getByDoiDuaTayDua(Integer id) {
        return ketQuaRepository.findByDoiDuaTayDua(id);
    }

    public Integer sumDiem(Integer doiDuaTayDua) {
        return ketQuaRepository.sumDiem(doiDuaTayDua);
    }
    public Integer sumThoiGian(Integer doiDuaTayDua) {
        return ketQuaRepository.sumThoiGian(doiDuaTayDua);
    }

    public Integer getDiemByDoiDuaTayDuaAndChangDua(Integer doiDuaTayDua, Integer changDua) {
        return ketQuaRepository.getDiemByDoiDuaTayDuaAndChangDua(doiDuaTayDua, changDua);
    }
    public Integer getThoiGianByDoiDuaTayDuaAndChangDua(Integer doiDuaTayDua, Integer changDua) {
        return ketQuaRepository.getThoiGianByDoiDuaTayDuaAndChangDua(doiDuaTayDua, changDua);
    }
}
