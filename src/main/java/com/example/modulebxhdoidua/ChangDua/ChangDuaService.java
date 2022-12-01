package com.example.modulebxhdoidua.ChangDua;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ChangDuaService {
    @Autowired ChangDuaRepository changDuaRepository;

    public Optional<ChangDua> getChangDuaById(Integer id) {
        return changDuaRepository.findById(id);
    }

}
