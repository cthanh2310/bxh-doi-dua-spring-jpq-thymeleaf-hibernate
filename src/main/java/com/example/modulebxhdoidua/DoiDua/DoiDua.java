package com.example.modulebxhdoidua.DoiDua;

import com.example.modulebxhdoidua.DoiDuaTayDua.DoiDuaTayDua;
import com.example.modulebxhdoidua.GiaiDau.GiaiDau;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tbldoidua")
public class DoiDua {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ten", nullable = false)
    String ten;

    @Column(name = "hang", nullable = false)
    String hang;

    @Column(name = "mo_ta", nullable = false)
    String moTa;

    @ManyToOne
    @JoinColumn(name = "tbl_giai_dau_id")
    GiaiDau giaiDau;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "doiDua", fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
    List<DoiDuaTayDua> listDoiDuaTayDua;

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

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public GiaiDau getGiaiDau() {
        return giaiDau;
    }

    public void setGiaiDau(GiaiDau giaiDau) {
        this.giaiDau = giaiDau;
    }

    public List<DoiDuaTayDua> getListDoiDuaTayDua() {
        return listDoiDuaTayDua;
    }

    public void setListDoiDuaTayDua(List<DoiDuaTayDua> listDoiDuaTayDua) {
        this.listDoiDuaTayDua = listDoiDuaTayDua;
    }

    @Override
    public String toString() {
        return "DoiDua{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", hang='" + hang + '\'' +
                ", moTa='" + moTa + '\'' +
                ", giaiDau=" + giaiDau +
                '}';
    }
}
