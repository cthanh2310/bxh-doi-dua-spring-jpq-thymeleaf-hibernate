package com.example.modulebxhdoidua.DoiDuaTayDua;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoiDuaTayDuaService {
    @Autowired DoiDuaTayDuaRepository doiDuaTayDuaRepository;

    public Optional<List<DoiDuaTayDua>> getByDoiDuaID(Integer id) {
        return doiDuaTayDuaRepository.findByDoiDua(id);
    }

}
