package com.example.modulebxhdoidua.BanToChuc;

import com.example.modulebxhdoidua.ThanhVien.ThanhVien;

import javax.persistence.*;

@Entity
@Table(name = "tblbantochuc")
public class BanToChuc {
    @Id
    @Column(name = "tbl_thanh_vien_id")
    private Integer id;

    @Column(name = "ten", nullable = false)
    String ten;
    @Column(name = "mo_ta", nullable = false)
    String moTa;

    @OneToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @MapsId
    @JoinColumn(name = "tbl_thanh_vien_id")
    private ThanhVien thanhVien;
}
