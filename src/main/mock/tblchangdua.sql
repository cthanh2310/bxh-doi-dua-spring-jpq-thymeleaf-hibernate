create table tblchangdua
(
    id              int auto_increment
        primary key,
    dia_diem        varchar(255) null,
    mo_ta           varchar(255) not null,
    so_vong_dua     int          not null,
    ten             varchar(255) not null,
    thoi_gian       datetime(6)  not null,
    tbl_giai_dau_id int          null,
    constraint FKv4xudce6c37j3shlma3yy1cy
        foreign key (tbl_giai_dau_id) references tblgiaidau (id)
);

INSERT INTO bxhdoidua.tblchangdua (id, dia_diem, mo_ta, so_vong_dua, ten, thoi_gian, tbl_giai_dau_id) VALUES (1, 'Hà Giang – Hà Tĩnh', 'Đường gồ ghề', 2, 'Hà Giang – Hà Tĩnh', '2022-11-27 16:21:14', 3);
INSERT INTO bxhdoidua.tblchangdua (id, dia_diem, mo_ta, so_vong_dua, ten, thoi_gian, tbl_giai_dau_id) VALUES (2, 'Hà Tĩnh – Đà Nẵng', 'Nhiều cây xanh', 3, 'Hà Tĩnh – Đà Nẵng', '2022-07-27 16:21:46', 3);
INSERT INTO bxhdoidua.tblchangdua (id, dia_diem, mo_ta, so_vong_dua, ten, thoi_gian, tbl_giai_dau_id) VALUES (3, 'Đà Nẵng – Cà Mau', 'Thoáng mát', 2, 'Đà Nẵng – Cà Mau', '2022-05-04 20:22:11', 3);
INSERT INTO bxhdoidua.tblchangdua (id, dia_diem, mo_ta, so_vong_dua, ten, thoi_gian, tbl_giai_dau_id) VALUES (4, 'Sài Gòn - Lào Cai', 'Có bão đi qua', 1, 'Sài Gòn - Lào Cai', '2021-11-03 16:22:52', 2);
