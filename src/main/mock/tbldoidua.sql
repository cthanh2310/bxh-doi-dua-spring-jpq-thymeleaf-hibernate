create table tbldoidua
(
    id              int auto_increment
        primary key,
    hang            varchar(255) not null,
    mo_ta           varchar(255) not null,
    ten             varchar(255) not null,
    tbl_giai_dau_id int          null,
    constraint FKl1m55xaqeoiqnf2xvpkoiqkcr
        foreign key (tbl_giai_dau_id) references tblgiaidau (id)
);

INSERT INTO bxhdoidua.tbldoidua (id, hang, mo_ta, ten, tbl_giai_dau_id) VALUES (1, 'Honda', 'Nhật bản', 'Honda-hd1', 3);
INSERT INTO bxhdoidua.tbldoidua (id, hang, mo_ta, ten, tbl_giai_dau_id) VALUES (2, 'Mazda', 'Nhật bản', 'Mazda-md2', 3);
INSERT INTO bxhdoidua.tbldoidua (id, hang, mo_ta, ten, tbl_giai_dau_id) VALUES (3, 'Toyota', 'Nhật bản', 'Toyota-tyt3', 3);
INSERT INTO bxhdoidua.tbldoidua (id, hang, mo_ta, ten, tbl_giai_dau_id) VALUES (4, 'Lexus', 'Nhật bản', 'Lexus-lx1', 2);
