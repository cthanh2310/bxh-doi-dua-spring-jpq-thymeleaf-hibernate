create table tblbantochuc
(
    tbl_thanh_vien_id int          not null
        primary key,
    mo_ta             varchar(255) not null,
    ten               varchar(255) not null,
    constraint FKfrm84jfovm7rj9cp78d3yed2h
        foreign key (tbl_thanh_vien_id) references tblthanhvien (id)
);

INSERT INTO bxhdoidua.tblbantochuc (tbl_thanh_vien_id, mo_ta, ten) VALUES (3, 'Quản lý', 'VFF-CUP');
