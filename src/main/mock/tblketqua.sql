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

-- update on 30/11/2022
UPDATE `bxhdoidua`.`tblketqua` SET `diem` = '15', `thoi_gian_ve_dich` = '100' WHERE (`id` = '1');
UPDATE `bxhdoidua`.`tblketqua` SET `diem` = '5', `thoi_gian_ve_dich` = '200' WHERE (`id` = '2');
UPDATE `bxhdoidua`.`tblketqua` SET `tbl_doi_dua_tay_dua_id` = '1' WHERE (`id` = '3');
UPDATE `bxhdoidua`.`tblketqua` SET `diem` = '15', `tbl_doi_dua_tay_dua_id` = '2' WHERE (`id` = '4');
UPDATE `bxhdoidua`.`tblketqua` SET `diem` = '25', `thoi_gian_ve_dich` = '40', `tbl_doi_dua_tay_dua_id` = '1' WHERE (`id` = '5');
UPDATE `bxhdoidua`.`tblketqua` SET `diem` = '20', `thoi_gian_ve_dich` = '60', `tbl_doi_dua_tay_dua_id` = '2' WHERE (`id` = '6');

INSERT INTO `bxhdoidua`.`tblketqua` (`id`, `diem`, `thoi_gian_ve_dich`, `thu_hang`, `tbl_chang_dua_id`, `tbl_doi_dua_tay_dua_id`) VALUES ('7', '15', '120', '3', '1', '3');
INSERT INTO `bxhdoidua`.`tblketqua` (`id`, `diem`, `thoi_gian_ve_dich`, `thu_hang`, `tbl_chang_dua_id`, `tbl_doi_dua_tay_dua_id`) VALUES ('8', '10', '180', '4', '1', '4');
INSERT INTO `bxhdoidua`.`tblketqua` (`id`, `diem`, `thoi_gian_ve_dich`, `thu_hang`, `tbl_chang_dua_id`, `tbl_doi_dua_tay_dua_id`) VALUES ('9', '20', '70', '3', '2', '3');
INSERT INTO `bxhdoidua`.`tblketqua` (`id`, `diem`, `thoi_gian_ve_dich`, `thu_hang`, `tbl_chang_dua_id`, `tbl_doi_dua_tay_dua_id`) VALUES ('10', '10', '130', '4', '2', '4');
INSERT INTO `bxhdoidua`.`tblketqua` (`id`, `diem`, `thoi_gian_ve_dich`, `thu_hang`, `tbl_chang_dua_id`, `tbl_doi_dua_tay_dua_id`) VALUES ('11', '20', '50', '3', '3', '3');
INSERT INTO `bxhdoidua`.`tblketqua` (`id`, `diem`, `thoi_gian_ve_dich`, `thu_hang`, `tbl_chang_dua_id`, `tbl_doi_dua_tay_dua_id`) VALUES ('12', '15', '100', '4', '3', '4');
INSERT INTO `bxhdoidua`.`tblketqua` (`id`, `diem`, `thoi_gian_ve_dich`, `thu_hang`, `tbl_chang_dua_id`, `tbl_doi_dua_tay_dua_id`) VALUES ('13', '15', '100', '5', '1', '5');
INSERT INTO `bxhdoidua`.`tblketqua` (`id`, `diem`, `thoi_gian_ve_dich`, `thu_hang`, `tbl_chang_dua_id`, `tbl_doi_dua_tay_dua_id`) VALUES ('14', '5', '200', '6', '1', '6');
INSERT INTO `bxhdoidua`.`tblketqua` (`id`, `diem`, `thoi_gian_ve_dich`, `thu_hang`, `tbl_chang_dua_id`, `tbl_doi_dua_tay_dua_id`) VALUES ('15', '15', '100', '5', '2', '5');
INSERT INTO `bxhdoidua`.`tblketqua` (`id`, `diem`, `thoi_gian_ve_dich`, `thu_hang`, `tbl_chang_dua_id`, `tbl_doi_dua_tay_dua_id`) VALUES ('16', '10', '150', '6', '2', '6');
INSERT INTO `bxhdoidua`.`tblketqua` (`id`, `diem`, `thoi_gian_ve_dich`, `thu_hang`, `tbl_chang_dua_id`, `tbl_doi_dua_tay_dua_id`) VALUES ('17', '20', '50', '5', '3', '5');
INSERT INTO `bxhdoidua`.`tblketqua` (`id`, `diem`, `thoi_gian_ve_dich`, `thu_hang`, `tbl_chang_dua_id`, `tbl_doi_dua_tay_dua_id`) VALUES ('18', '15', '150', '6', '3', '6');
