package com.example.modulebxhdoidua.DoiDua;

import com.example.modulebxhdoidua.DoiDuaTayDua.DoiDuaTayDua;
import com.example.modulebxhdoidua.GiaiDau.GiaiDau;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoiDuaService {
    @Autowired DoiDuaRepository doiDuaRepository;

    public Optional<DoiDua> getDoiDuaById(Integer id) {
        return doiDuaRepository.findById(id);
    }

}
