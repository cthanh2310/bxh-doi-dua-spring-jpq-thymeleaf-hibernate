package com.example.modulebxhdoidua.TayDua;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TayDuaService {
    @Autowired TayDuaRepository tayDuaRepository;

     public Optional<TayDua> getTayDua(Integer id) {
        return tayDuaRepository.findById(id);
    }

}
