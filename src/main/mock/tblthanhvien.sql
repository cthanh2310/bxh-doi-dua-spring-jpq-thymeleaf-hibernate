create table tblthanhvien
(
    id        int auto_increment
        primary key,
    dia_chi   varchar(255) null,
    email     varchar(255) not null,
    ghi_chu   varchar(255) null,
    ho_ten    varchar(255) null,
    ngay_sinh datetime(6)  not null,
    password  varchar(255) not null,
    sdt       varchar(255) null,
    username  varchar(255) not null
);

INSERT INTO bxhdoidua.tblthanhvien (id, dia_chi, email, ghi_chu, ho_ten, ngay_sinh, password, sdt, username) VALUES (1, 'Hà Tĩnh', 'thanhpham.23102000@gmail.com', 'Phạm Công Thành', 'Phạm Công Thành', '2000-10-23 16:28:59', 'thanhpc', '0986249793', 'thanhpc');
INSERT INTO bxhdoidua.tblthanhvien (id, dia_chi, email, ghi_chu, ho_ten, ngay_sinh, password, sdt, username) VALUES (2, 'Hà Nội', 'hnoiv@gmail.com', 'Phạm Công Bình', 'Phạm Công Bình', '2001-11-27 16:30:16', 'binhpc', '0999846793', 'binhpc');
INSERT INTO bxhdoidua.tblthanhvien (id, dia_chi, email, ghi_chu, ho_ten, ngay_sinh, password, sdt, username) VALUES (3, 'Nghệ An', 'btc2022@gmail.com', 'Đinh Nhật Lệ', 'Đinh Thị Nhật Lệ', '1987-11-27 16:31:30', 'nhatledn', '0866497796', 'nhatledn');
