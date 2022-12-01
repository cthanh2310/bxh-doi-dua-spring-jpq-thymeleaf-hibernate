package com.example.modulebxhdoidua.TayDua;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TayDuaRepository extends CrudRepository<TayDua, Integer> {

    public Optional<TayDua> findById(Integer id);
}
