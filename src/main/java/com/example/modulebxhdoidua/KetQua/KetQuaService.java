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

    public Long sumDiem(Integer doiDuaTayDua) {
        return ketQuaRepository.sumDiem(doiDuaTayDua);
    }
}
