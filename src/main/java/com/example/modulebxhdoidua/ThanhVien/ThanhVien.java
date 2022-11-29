package com.example.modulebxhdoidua.ThanhVien;

import com.example.modulebxhdoidua.BanToChuc.BanToChuc;
import com.example.modulebxhdoidua.TayDua.TayDua;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tblthanhvien")
public class ThanhVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username", nullable = false)
    String username;

    @Column(name = "password", nullable = false)
    String password;

    @Column(name = "ngay_sinh", nullable = false)
    Date ngaySinh;

    @Column(name = "email", nullable = false)
    String email;

    @Column(name = "sdt")
    String sdt;

    @Column(name = "ghi_chu")
    String ghiChu;

    @Column(name = "ho_ten")
    String hoTen;

    @Column(name = "dia_chi")
    String diaChi;

    @OneToOne(mappedBy = "thanhVien", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private TayDua tayDua;

    @OneToOne(mappedBy = "thanhVien", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private BanToChuc banToChuc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public TayDua getTayDua() {
        return tayDua;
    }

    public void setTayDua(TayDua tayDua) {
        this.tayDua = tayDua;
    }

    public BanToChuc getBanToChuc() {
        return banToChuc;
    }

    public void setBanToChuc(BanToChuc banToChuc) {
        this.banToChuc = banToChuc;
    }

    @Override
    public String toString() {
        return "ThanhVien{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", email='" + email + '\'' +
                ", sdt='" + sdt + '\'' +
                ", ghiChu='" + ghiChu + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", tayDua=" + tayDua
                +
//                ", banToChuc=" + banToChuc +
                '}';
    }
}
