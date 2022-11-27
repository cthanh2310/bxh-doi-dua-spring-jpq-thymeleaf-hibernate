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

    public Integer getSoVongDua() {
        return soVongDua;
    }

    public void setSoVongDua(Integer soVongDua) {
        this.soVongDua = soVongDua;
    }

    public Date getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Date thoiGian) {
        this.thoiGian = thoiGian;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }

    public GiaiDau getGiaiDau() {
        return giaiDau;
    }

    public void setGiaiDau(GiaiDau giaiDau) {
        this.giaiDau = giaiDau;
    }

    public List<KetQua> getListKetQua() {
        return listKetQua;
    }

    public void setListKetQua(List<KetQua> listKetQua) {
        this.listKetQua = listKetQua;
    }

    @Override
    public String toString() {
        return "ChangDua{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", soVongDua=" + soVongDua +
                ", thoiGian=" + thoiGian +
                ", moTa='" + moTa + '\'' +
                ", diaDiem='" + diaDiem + '\'' +
                ", giaiDau=" + giaiDau +
                ", listKetQua=" + listKetQua +
                '}';
    }
}
