package com.example.modulebxhdoidua.GiaiDau;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class GiaiDauService {
    @Autowired GiaiDauRepository giaiDauRepository;

    public Iterable<GiaiDau> getAll() {
        return giaiDauRepository.findAll();
    }

    public Optional<GiaiDau> getByNamToChuc(Integer namToChuc) {
        return giaiDauRepository.findByNamToChuc(namToChuc);
    }

}
