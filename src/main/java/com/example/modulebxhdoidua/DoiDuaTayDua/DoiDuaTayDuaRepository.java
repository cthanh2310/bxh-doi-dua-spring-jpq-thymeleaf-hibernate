package com.example.modulebxhdoidua.DoiDuaTayDua;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DoiDuaTayDuaRepository extends CrudRepository<DoiDuaTayDua, Integer> {
    public Optional<List<DoiDuaTayDua>> findByDoiDua(Integer id);
}
