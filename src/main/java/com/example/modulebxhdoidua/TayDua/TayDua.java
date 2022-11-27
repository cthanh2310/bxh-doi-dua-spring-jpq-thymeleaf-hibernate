package com.example.modulebxhdoidua.TayDua;

import com.example.modulebxhdoidua.DoiDuaTayDua.DoiDuaTayDua;
import com.example.modulebxhdoidua.ThanhVien.ThanhVien;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbltaydua")
public class TayDua {
    @Id
    @Column(name = "tbl_thanh_vien_id")
    Integer id;

    @Column(name = "quoc_tich", nullable = false)
    String quocTich;
    @Column(name = "tieu_su", nullable = false)
    String tieuSu;

    @OneToOne
    @MapsId
    @JoinColumn(name = "tbl_thanh_vien_id")
    ThanhVien thanhVien;

    @OneToMany(mappedBy = "tayDua", fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
    List<DoiDuaTayDua> listDoiDuaTayDua;
}
