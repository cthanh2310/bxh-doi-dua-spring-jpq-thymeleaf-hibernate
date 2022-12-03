INSERT INTO bxhdoidua.tblgiaidau (id, nam_to_chuc) VALUES (1, 2020);
INSERT INTO bxhdoidua.tblgiaidau (id, nam_to_chuc) VALUES (2, 2021);
INSERT INTO bxhdoidua.tblgiaidau (id, nam_to_chuc) VALUES (3, 2022);
INSERT INTO bxhdoidua.tblgiaidau (id, nam_to_chuc) VALUES (4, 2019);


INSERT INTO bxhdoidua.tblchangdua (id, dia_diem, mo_ta, so_vong_dua, ten, thoi_gian, tbl_giai_dau_id) VALUES (1, 'Hà Giang – Hà Tĩnh', 'Đường gồ ghề', 2, 'Hà Giang – Hà Tĩnh', '2022-11-27 16:21:14', 3);
INSERT INTO bxhdoidua.tblchangdua (id, dia_diem, mo_ta, so_vong_dua, ten, thoi_gian, tbl_giai_dau_id) VALUES (2, 'Hà Tĩnh – Đà Nẵng', 'Nhiều cây xanh', 3, 'Hà Tĩnh – Đà Nẵng', '2022-07-27 16:21:46', 3);
INSERT INTO bxhdoidua.tblchangdua (id, dia_diem, mo_ta, so_vong_dua, ten, thoi_gian, tbl_giai_dau_id) VALUES (3, 'Đà Nẵng – Cà Mau', 'Thoáng mát', 2, 'Đà Nẵng – Cà Mau', '2022-05-04 20:22:11', 3);
INSERT INTO bxhdoidua.tblchangdua (id, dia_diem, mo_ta, so_vong_dua, ten, thoi_gian, tbl_giai_dau_id) VALUES (4, 'Sài Gòn - Lào Cai', 'Có bão đi qua', 1, 'Sài Gòn - Lào Cai', '2021-11-03 16:22:52', 2);


INSERT INTO bxhdoidua.tblthanhvien (id, dia_chi, email, ghi_chu, ho_ten, ngay_sinh, password, sdt, username) VALUES (1, 'Hà Tĩnh', 'thanhpham.23102000@gmail.com', 'Phạm Công Thành', 'Phạm Công Thành', '2000-10-23 16:28:59', 'thanhpc', '0986249793', 'thanhpc');
INSERT INTO bxhdoidua.tblthanhvien (id, dia_chi, email, ghi_chu, ho_ten, ngay_sinh, password, sdt, username) VALUES (2, 'Hà Nội', 'hnoiv@gmail.com', 'Phạm Công Bình', 'Phạm Công Bình', '2001-11-27 16:30:16', 'binhpc', '0999846793', 'binhpc');
INSERT INTO bxhdoidua.tblthanhvien (id, dia_chi, email, ghi_chu, ho_ten, ngay_sinh, password, sdt, username) VALUES (3, 'Nghệ An', 'btc2022@gmail.com', 'Đinh Nhật Lệ', 'Đinh Thị Nhật Lệ', '1987-11-27 16:31:30', 'nhatledn', '0866497796', 'nhatledn');

INSERT INTO `bxhdoidua`.`tblthanhvien` (`id`, `dia_chi`, `email`, `ghi_chu`, `ho_ten`, `ngay_sinh`, `password`, `sdt`, `username`) VALUES ('4', 'Nghệ An', 'thanhpham.23102000@gmail.com', 'Phạm Công Tuấn', 'Phạm Công Tuấn', '2000-10-23 16:28:59.000000', 'tuanpc', '0866497796', 'tuanpc');
INSERT INTO `bxhdoidua`.`tblthanhvien` (`id`, `dia_chi`, `email`, `ghi_chu`, `ho_ten`, `ngay_sinh`, `password`, `sdt`, `username`) VALUES ('5', 'Nghệ An', 'thanhpham.23102000@gmail.com', 'Phạm Công Long', 'Phạm Công Long', '2000-10-23 16:28:59.000000', 'longpc', '0866497796', 'longpc');
INSERT INTO `bxhdoidua`.`tblthanhvien` (`id`, `dia_chi`, `email`, `ghi_chu`, `ho_ten`, `ngay_sinh`, `password`, `sdt`, `username`) VALUES ('6', 'Nghệ An', 'thanhpham.23102000@gmail.com', 'Phạm Công Luân', 'Phạm Công Luân', '2000-10-23 16:28:59.000000', 'luanpc', '0866497796', 'luanpc');
INSERT INTO `bxhdoidua`.`tblthanhvien` (`id`, `dia_chi`, `email`, `ghi_chu`, `ho_ten`, `ngay_sinh`, `password`, `sdt`, `username`) VALUES ('7', 'Nghệ An', 'thanhpham.23102000@gmail.com', 'Phạm Công Nhật', 'Phạm Công Nhật', '2000-10-23 16:28:59.000000', 'nhatpc', '0866497796', 'nhatpc');


INSERT INTO bxhdoidua.tbltaydua (tbl_thanh_vien_id, quoc_tich, tieu_su) VALUES (1, 'Việt Nam', 'Tay đua vô địch aff1');
INSERT INTO bxhdoidua.tbltaydua (tbl_thanh_vien_id, quoc_tich, tieu_su) VALUES (2, 'Việt Nam ', 'Tay đua vô địch world cup');

INSERT INTO `bxhdoidua`.`tbltaydua` (`tbl_thanh_vien_id`, `quoc_tich`, `tieu_su`) VALUES ('4', 'Việt Nam ', 'Tay đua vô địch world cup');
INSERT INTO `bxhdoidua`.`tbltaydua` (`tbl_thanh_vien_id`, `quoc_tich`, `tieu_su`) VALUES ('5', 'Việt Nam ', 'Tay đua vô địch euro');
INSERT INTO `bxhdoidua`.`tbltaydua` (`tbl_thanh_vien_id`, `quoc_tich`, `tieu_su`) VALUES ('6', 'Việt Nam ', 'Tay đua vô địch copa america');
INSERT INTO `bxhdoidua`.`tbltaydua` (`tbl_thanh_vien_id`, `quoc_tich`, `tieu_su`) VALUES ('7', 'Việt Nam ', 'Tay đua vô địch numberz');


INSERT INTO bxhdoidua.tbldoidua (id, hang, mo_ta, ten, tbl_giai_dau_id) VALUES (1, 'Honda', 'Nhật bản', 'Honda-hd1', 3);
INSERT INTO bxhdoidua.tbldoidua (id, hang, mo_ta, ten, tbl_giai_dau_id) VALUES (2, 'Mazda', 'Nhật bản', 'Mazda-md2', 3);
INSERT INTO bxhdoidua.tbldoidua (id, hang, mo_ta, ten, tbl_giai_dau_id) VALUES (3, 'Toyota', 'Nhật bản', 'Toyota-tyt3', 3);
INSERT INTO bxhdoidua.tbldoidua (id, hang, mo_ta, ten, tbl_giai_dau_id) VALUES (4, 'Lexus', 'Nhật bản', 'Lexus-lx1', 2);


INSERT INTO bxhdoidua.tbldoiduataydua (id, thoi_diem, tbl_doi_dua_id, tbl_thanh_vien_id) VALUES (1, '2022-08-27 17:09:50', 1, 1);
INSERT INTO bxhdoidua.tbldoiduataydua (id, thoi_diem, tbl_doi_dua_id, tbl_thanh_vien_id) VALUES (2, '2022-06-27 17:10:05', 1, 2);

INSERT INTO `bxhdoidua`.`tbldoiduataydua` (`id`, `thoi_diem`, `tbl_doi_dua_id`, `tbl_thanh_vien_id`) VALUES ('3', '2022-06-27 17:10:05.000000', '2', '4');
INSERT INTO `bxhdoidua`.`tbldoiduataydua` (`id`, `thoi_diem`, `tbl_doi_dua_id`, `tbl_thanh_vien_id`) VALUES ('4', '2022-06-27 17:10:05.000000', '2', '5');
INSERT INTO `bxhdoidua`.`tbldoiduataydua` (`id`, `thoi_diem`, `tbl_doi_dua_id`, `tbl_thanh_vien_id`) VALUES ('5', '2022-06-27 17:10:05.000000', '3', '6');
INSERT INTO `bxhdoidua`.`tbldoiduataydua` (`id`, `thoi_diem`, `tbl_doi_dua_id`, `tbl_thanh_vien_id`) VALUES ('6', '2022-06-27 17:10:05.000000', '3', '7');


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


INSERT INTO bxhdoidua.tblbantochuc (tbl_thanh_vien_id, mo_ta, ten) VALUES (3, 'Quản lý', 'VFF-CUP');
