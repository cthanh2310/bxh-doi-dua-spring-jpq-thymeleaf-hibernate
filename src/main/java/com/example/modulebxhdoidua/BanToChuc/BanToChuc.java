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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public ThanhVien getThanhVien() {
        return thanhVien;
    }

    public void setThanhVien(ThanhVien thanhVien) {
        this.thanhVien = thanhVien;
    }

    @Override
    public String toString() {
        return "BanToChuc{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", moTa='" + moTa + '\'' +
                ", thanhVien=" + thanhVien +
                '}';
    }
}
