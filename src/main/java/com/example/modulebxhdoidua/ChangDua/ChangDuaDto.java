package com.example.modulebxhdoidua.ChangDua;

public class ChangDuaDto {
    private Integer id;
    String ten;
    Integer tongDiem;
    Integer tongThoiGian;

    public ChangDuaDto(Integer id, String ten, Integer tongDiem, Integer tongThoiGian) {
        this.id = id;
        this.ten = ten;
        this.tongDiem = tongDiem;
        this.tongThoiGian = tongThoiGian;
    }

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
}
