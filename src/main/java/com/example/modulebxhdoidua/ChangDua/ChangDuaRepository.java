package com.example.modulebxhdoidua.ChangDua;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ChangDuaRepository extends CrudRepository<ChangDua, Integer> {

    public Optional<ChangDua> findById(Integer id);
}
