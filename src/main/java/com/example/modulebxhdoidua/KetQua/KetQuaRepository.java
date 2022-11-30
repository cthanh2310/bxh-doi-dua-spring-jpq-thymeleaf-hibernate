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
        public Integer sumDiem(Integer doiDuaTayDua);

        @Query(value = "SELECT sum(thoiGianVeDich) FROM KetQua where doiDuaTayDua.id = ?1")
        public Integer sumThoiGian(Integer doiDuaTayDua);

        @Query(value = "SELECT diem FROM KetQua where doiDuaTayDua.id = ?1 and changDua.id = ?2")
        public Integer getDiemByDoiDuaTayDuaAndChangDua(Integer doiDuaTayDua, Integer changDua);

        @Query(value = "SELECT thoiGianVeDich FROM KetQua where doiDuaTayDua.id = ?1 and changDua.id = ?2")
        public Integer getThoiGianByDoiDuaTayDuaAndChangDua(Integer doiDuaTayDua, Integer changDua);
}
