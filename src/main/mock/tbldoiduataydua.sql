create table tbldoiduataydua
(
    id                int auto_increment
        primary key,
    thoi_diem         datetime(6) not null,
    tbl_doi_dua_id    int         null,
    tbl_thanh_vien_id int         null,
    constraint FK5ady64wam6bhyd0jnta2v90qk
        foreign key (tbl_doi_dua_id) references tbldoidua (id),
    constraint FKmqyljmewidyo7hxsk2hvgrm2h
        foreign key (tbl_thanh_vien_id) references tbltaydua (tbl_thanh_vien_id)
);

INSERT INTO bxhdoidua.tbldoiduataydua (id, thoi_diem, tbl_doi_dua_id, tbl_thanh_vien_id) VALUES (1, '2022-08-27 17:09:50', 1, 1);
INSERT INTO bxhdoidua.tbldoiduataydua (id, thoi_diem, tbl_doi_dua_id, tbl_thanh_vien_id) VALUES (2, '2022-06-27 17:10:05', 1, 2);

INSERT INTO `bxhdoidua`.`tbldoiduataydua` (`id`, `thoi_diem`, `tbl_doi_dua_id`, `tbl_thanh_vien_id`) VALUES ('3', '2022-06-27 17:10:05.000000', '2', '4');
INSERT INTO `bxhdoidua`.`tbldoiduataydua` (`id`, `thoi_diem`, `tbl_doi_dua_id`, `tbl_thanh_vien_id`) VALUES ('4', '2022-06-27 17:10:05.000000', '2', '5');
INSERT INTO `bxhdoidua`.`tbldoiduataydua` (`id`, `thoi_diem`, `tbl_doi_dua_id`, `tbl_thanh_vien_id`) VALUES ('5', '2022-06-27 17:10:05.000000', '3', '6');
INSERT INTO `bxhdoidua`.`tbldoiduataydua` (`id`, `thoi_diem`, `tbl_doi_dua_id`, `tbl_thanh_vien_id`) VALUES ('6', '2022-06-27 17:10:05.000000', '3', '7');
