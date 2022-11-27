package com.example.modulebxhdoidua.ChangDua;

import com.example.modulebxhdoidua.GiaiDau.GiaiDau;
import com.example.modulebxhdoidua.KetQua.KetQua;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tblchangdua")
public class ChangDua {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "ten", nullable = false)
    String ten;

    @Column(name = "so_vong_dua", nullable = false)
    Integer soVongDua;

    @Column(name = "thoi_gian", nullable = false)
    Date thoiGian;

    @Column(name = "mo_ta", nullable = false)
    String moTa;

    @Column(name = "dia_diem")
    String diaDiem;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "tbl_giai_dau_id")
    GiaiDau giaiDau;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "changDua", fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
    List<KetQua> listKetQua;
}
