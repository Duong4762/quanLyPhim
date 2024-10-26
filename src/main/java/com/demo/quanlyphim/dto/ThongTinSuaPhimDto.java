package com.demo.quanlyphim.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
@Data
public class ThongTinSuaPhimDto {
    private int maPhim;
    private String tenPhim;
    private String trailer;
    private String moTa;
    private String ngayKhoiChieu;
    private boolean dangChieu;
    private boolean sapChieu;
    private boolean hot;
    private double danhGia;
    private MultipartFile hinhAnh;
}
