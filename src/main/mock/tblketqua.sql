create table tblketqua
(
    id                     int auto_increment
        primary key,
    diem                   int not null,
    thoi_gian_ve_dich      int not null,
    thu_hang               int not null,
    tbl_chang_dua_id       int null,
    tbl_doi_dua_tay_dua_id int null,
    constraint FKgnpkiin4f38iynmm1isp5f7dr
        foreign key (tbl_chang_dua_id) references tblchangdua (id),
    constraint FKlr7vpfoe5gqu83g1eb6x9dpc6
        foreign key (tbl_doi_dua_tay_dua_id) references tbldoiduataydua (id)
);

INSERT INTO bxhdoidua.tblketqua (id, diem, thoi_gian_ve_dich, thu_hang, tbl_chang_dua_id, tbl_doi_dua_tay_dua_id) VALUES (1, 30, 100, 1, 1, 1);
INSERT INTO bxhdoidua.tblketqua (id, diem, thoi_gian_ve_dich, thu_hang, tbl_chang_dua_id, tbl_doi_dua_tay_dua_id) VALUES (2, 20, 200, 2, 1, 2);
