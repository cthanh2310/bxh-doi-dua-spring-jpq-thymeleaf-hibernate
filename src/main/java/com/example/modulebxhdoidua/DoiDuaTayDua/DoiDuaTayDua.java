package com.example.modulebxhdoidua.DoiDuaTayDua;

import com.example.modulebxhdoidua.DoiDua.DoiDua;
import com.example.modulebxhdoidua.KetQua.KetQua;
import com.example.modulebxhdoidua.TayDua.TayDua;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tbldoiduataydua")
public class DoiDuaTayDua {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "thoi_diem", nullable = false)
    Date thoiDiem;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "tbl_thanh_vien_id")
    TayDua tayDua;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "tbl_doi_dua_id")
    DoiDua doiDua;

    @OneToMany(mappedBy = "doiDuaTayDua", fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
    List<KetQua> listKetQua;
}
