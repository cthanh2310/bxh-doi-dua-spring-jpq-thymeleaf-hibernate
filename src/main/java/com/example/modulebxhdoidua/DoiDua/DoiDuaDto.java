package com.example.modulebxhdoidua.DoiDua;

import com.example.modulebxhdoidua.DoiDuaTayDua.DoiDuaTayDua;
import com.example.modulebxhdoidua.GiaiDau.GiaiDau;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Set;

public class DoiDuaDto {
    private Integer id;

    String ten;

    String hang;

    Integer tongDiem;

    Integer tongThoiGian;

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

    public Integer getTongDiem() {
        return tongDiem;
    }

    public void setTongDiem(Integer tongDiem) {
        this.tongDiem = tongDiem;
    }

    public Integer getTongThoiGian() {
        return tongThoiGian;
    }

    public void setTongThoiGian(Integer tongThoiGian) {
        this.tongThoiGian = tongThoiGian;
    }

    public DoiDuaDto(Integer id, String ten, String hang, Integer tongDiem, Integer tongThoiGian) {
        this.id = id;
        this.ten = ten;
        this.hang = hang;
        this.tongDiem = tongDiem;
        this.tongThoiGian = tongThoiGian;
    }

    @Override
    public String toString() {
        return "DoiDuaDto{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", hang='" + hang + '\'' +
                ", tongDiem=" + tongDiem +
                ", tongThoiGian=" + tongThoiGian +
                '}';
    }
}
