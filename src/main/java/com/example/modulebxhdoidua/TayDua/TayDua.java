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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public String getTieuSu() {
        return tieuSu;
    }

    public void setTieuSu(String tieuSu) {
        this.tieuSu = tieuSu;
    }

    public ThanhVien getThanhVien() {
        return thanhVien;
    }

    public void setThanhVien(ThanhVien thanhVien) {
        this.thanhVien = thanhVien;
    }

    public List<DoiDuaTayDua> getListDoiDuaTayDua() {
        return listDoiDuaTayDua;
    }

    public void setListDoiDuaTayDua(List<DoiDuaTayDua> listDoiDuaTayDua) {
        this.listDoiDuaTayDua = listDoiDuaTayDua;
    }

    @Override
    public String toString() {
        return "TayDua{" +
                "id=" + id +
                ", quocTich='" + quocTich + '\'' +
                ", tieuSu='" + tieuSu + '\'' +
                ", thanhVien=" + thanhVien +
                ", listDoiDuaTayDua=" + listDoiDuaTayDua +
                '}';
    }
}
