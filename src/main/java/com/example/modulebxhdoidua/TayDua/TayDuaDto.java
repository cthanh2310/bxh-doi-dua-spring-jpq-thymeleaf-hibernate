package com.example.modulebxhdoidua.TayDua;

public class TayDuaDto {
    private Integer id;
    String tenTayDua;
    String tenChang;
    Integer thoiGianVeDich;
    Integer thuHang;
    Integer diem;

    public TayDuaDto(Integer id, String tenTayDua, String tenChang, Integer thoiGianVeDich, Integer thuHang, Integer diem) {
        this.id = id;
        this.tenTayDua = tenTayDua;
        this.tenChang = tenChang;
        this.thoiGianVeDich = thoiGianVeDich;
        this.thuHang = thuHang;
        this.diem = diem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenTayDua() {
        return tenTayDua;
    }

    public void setTenTayDua(String tenTayDua) {
        this.tenTayDua = tenTayDua;
    }

    public String getTenChang() {
        return tenChang;
    }

    public void setTenChang(String tenChang) {
        this.tenChang = tenChang;
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

    @Override
    public String toString() {
        return "TayDuaDto{" +
                "id=" + id +
                ", tenTayDua='" + tenTayDua + '\'' +
                ", tenChang='" + tenChang + '\'' +
                ", thoiGianVeDich=" + thoiGianVeDich +
                ", thuHang=" + thuHang +
                ", diem=" + diem +
                '}';
    }
}
