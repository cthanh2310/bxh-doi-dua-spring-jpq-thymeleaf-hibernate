package com.example.modulebxhdoidua.GiaiDau;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface GiaiDauRepository extends CrudRepository<GiaiDau, Integer> {
    public Optional<GiaiDau> findByNamToChuc(Integer namToChuc);
}
