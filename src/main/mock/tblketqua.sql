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

INSERT INTO `bxhdoidua`.`tblketqua` (`id`, `diem`, `thoi_gian_ve_dich`, `thu_hang`, `tbl_chang_dua_id`, `tbl_doi_dua_tay_dua_id`) VALUES ('3', '20', '80', '1', '2', '3');
INSERT INTO `bxhdoidua`.`tblketqua` (`id`, `diem`, `thoi_gian_ve_dich`, `thu_hang`, `tbl_chang_dua_id`, `tbl_doi_dua_tay_dua_id`) VALUES ('4', '10', '120', '2', '2', '4');
INSERT INTO `bxhdoidua`.`tblketqua` (`id`, `diem`, `thoi_gian_ve_dich`, `thu_hang`, `tbl_chang_dua_id`, `tbl_doi_dua_tay_dua_id`) VALUES ('5', '10', '130', '1', '3', '5');
INSERT INTO `bxhdoidua`.`tblketqua` (`id`, `diem`, `thoi_gian_ve_dich`, `thu_hang`, `tbl_chang_dua_id`, `tbl_doi_dua_tay_dua_id`) VALUES ('6', '10', '170', '2', '3', '6');
UPDATE `bxhdoidua`.`tblketqua` SET `thoi_gian_ve_dich` = '40' WHERE (`id` = '1');
UPDATE `bxhdoidua`.`tblketqua` SET `thoi_gian_ve_dich` = '60' WHERE (`id` = '2');
