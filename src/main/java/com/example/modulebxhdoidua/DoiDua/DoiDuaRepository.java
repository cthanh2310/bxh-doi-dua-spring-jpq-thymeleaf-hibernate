package com.example.modulebxhdoidua.DoiDua;

import com.example.modulebxhdoidua.DoiDuaTayDua.DoiDuaTayDua;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DoiDuaRepository extends CrudRepository<DoiDua, Integer> {
    public Optional<DoiDua> findById(Integer id);
}
