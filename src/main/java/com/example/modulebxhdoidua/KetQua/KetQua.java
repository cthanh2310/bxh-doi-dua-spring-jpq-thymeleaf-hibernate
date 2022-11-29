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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getThoiGianVeDich() {
        return thoiGianVeDich;
    }

    public void setThoiGianVeDich(Integer thoiGianVeDich) {
        this.thoiGianVeDich = thoiGianVeDich;
    }

    public Integer getThuHang() {
        return thuHang;
    }

    public void setThuHang(Integer thuHang) {
        this.thuHang = thuHang;
    }

    public Integer getDiem() {
        return diem;
    }

    public void setDiem(Integer diem) {
        this.diem = diem;
    }

    public DoiDuaTayDua getDoiDuaTayDua() {
        return doiDuaTayDua;
    }

    public void setDoiDuaTayDua(DoiDuaTayDua doiDuaTayDua) {
        this.doiDuaTayDua = doiDuaTayDua;
    }

    public ChangDua getChangDua() {
        return changDua;
    }

    public void setChangDua(ChangDua changDua) {
        this.changDua = changDua;
    }

    @Override
    public String toString() {
        return "KetQua{" +
                "id=" + id +
                ", thoiGianVeDich=" + thoiGianVeDich +
                ", thuHang=" + thuHang +
                ", diem=" + diem +
//                ", doiDuaTayDua=" + doiDuaTayDua +
//                ", changDua=" + changDua +
                '}';
    }
}
