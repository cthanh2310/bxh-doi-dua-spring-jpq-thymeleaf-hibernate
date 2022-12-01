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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getThoiDiem() {
        return thoiDiem;
    }

    public void setThoiDiem(Date thoiDiem) {
        this.thoiDiem = thoiDiem;
    }

    public TayDua getTayDua() {
        return tayDua;
    }

    public void setTayDua(TayDua tayDua) {
        this.tayDua = tayDua;
    }

    public DoiDua getDoiDua() {
        return doiDua;
    }

    public void setDoiDua(DoiDua doiDua) {
        this.doiDua = doiDua;
    }

    public List<KetQua> getListKetQua() {
        return listKetQua;
    }

    public void setListKetQua(List<KetQua> listKetQua) {
        this.listKetQua = listKetQua;
    }

    @Override
    public String toString() {
        return "DoiDuaTayDua{" +
                "id=" + id +
                ", thoiDiem=" + thoiDiem +
                ", doiDua=" + doiDua +
                ", tayDua=" + tayDua +
//                ", listKetQua=" + listKetQua +
                '}';
    }
}
