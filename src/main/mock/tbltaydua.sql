create table tbltaydua
(
    tbl_thanh_vien_id int          not null
        primary key,
    quoc_tich         varchar(255) not null,
    tieu_su           varchar(255) not null,
    constraint FKtq4h7qd16g0jh5rwd80dd306u
        foreign key (tbl_thanh_vien_id) references tblthanhvien (id)
);

INSERT INTO bxhdoidua.tbltaydua (tbl_thanh_vien_id, quoc_tich, tieu_su) VALUES (1, 'Việt Nam', 'Tay đua vô địch aff1');
INSERT INTO bxhdoidua.tbltaydua (tbl_thanh_vien_id, quoc_tich, tieu_su) VALUES (2, 'Việt Nam ', 'Tay đua vô địch world cup');
