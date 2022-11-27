package com.example.modulebxhdoidua.GiaiDau;

import com.example.modulebxhdoidua.ChangDua.ChangDua;
import com.example.modulebxhdoidua.DoiDua.DoiDua;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tblgiaidau")
public class GiaiDau {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nam_to_chuc")
    private Integer namToChuc;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "giaiDau",fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    Set<ChangDua> listChangDua;

    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "giaiDau", fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
    Set<DoiDua> listDoiDua;

    @Override
    public String toString() {
        return "GiaiDau{" +
                "id=" + id +
                ", namToChuc=" + namToChuc +
                ", listChangDua=" + listChangDua +
                ", listDoiDua=" + listDoiDua +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNamToChuc() {
        return namToChuc;
    }

    public void setNamToChuc(Integer namToChuc) {
        this.namToChuc = namToChuc;
    }

    public Set<ChangDua> getListChangDua() {
        return listChangDua;
    }

    public void setListChangDua(Set<ChangDua> listChangDua) {
        this.listChangDua = listChangDua;
    }

    public Set<DoiDua> getListDoiDua() {
        for(DoiDua doiDua :listDoiDua) {
            System.out.println(doiDua);
            System.out.println("vao get list");
        };
        return listDoiDua;
    }

    public void setListDoiDua(Set<DoiDua> listDoiDua) {
        this.listDoiDua = listDoiDua;
    }
}
