package com.example.modulebxhdoidua.KetQua;

import com.example.modulebxhdoidua.ChangDua.ChangDua;
import com.example.modulebxhdoidua.DoiDuaTayDua.DoiDuaTayDua;

import javax.persistence.*;

@Entity
@Table(name = "tblketqua")
public class KetQua {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "thoi_gian_ve_dich", nullable = false)
    Integer thoiGianVeDich;

    @Column(name = "thu_hang", nullable = false)
    Integer thuHang;

    @Column(name = "diem", nullable = false)
    Integer diem;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "tbl_doi_dua_tay_dua_id")
    DoiDuaTayDua doiDuaTayDua;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "tbl_chang_dua_id")
    ChangDua changDua;
}
