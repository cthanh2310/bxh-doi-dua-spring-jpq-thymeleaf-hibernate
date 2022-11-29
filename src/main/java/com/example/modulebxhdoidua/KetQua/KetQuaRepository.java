package com.example.modulebxhdoidua.KetQua;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface KetQuaRepository extends CrudRepository<KetQua, Integer> {
        public Optional<Set<KetQua>> findByDoiDuaTayDua(Integer id);

        @Query(value = "SELECT sum(diem) FROM KetQua where doiDuaTayDua.id = ?1")
        public Long sumDiem(Integer doiDuaTayDua);

}
