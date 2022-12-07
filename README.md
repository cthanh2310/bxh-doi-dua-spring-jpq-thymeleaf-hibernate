Sai phần sequence-diagram và truy vấn dữ liệu thì join chứ không duyệt trâu 2 vòng for
- Những chỗ duyệt 2 vòng for để lấy ra data là sai => cần sum + join để query ra: đúng 1 câu query!
- VD: lấy sum điểm của đội đua từ bảng kết quả: 1 doidua ->n doiduataydua 1 -> n ketqua ==> vd sum điểm doidua: SELECT sum(t.diem)  FROM KetQua t join DoiDuaTayDua ddtd on t.doiDuaTayDua.id = ddtd.id join DoiDua dd on ddtd.doiDua.id = dd.id where dd.id = ?1 group by dd.id
