package com.demo.quanlyphim.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "phim")
public class Phim {
    @Id
    @Column(name = "ma_phim")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maPhim;
    @Column(name = "ten_phim")
    private String tenPhim;
    @Column(name = "bi_danh")
    private String biDanh;
    private String trailer;
    @Column(name = "hinh_anh")
    private String hinhAnh;
    @Column(name = "mo_ta", length = 5000)
    private String moTa;
    @Column(name = "ma_nhom")
    private String maNhom;
    @Column(name = "ngay_khoi_chieu")
    private String ngayKhoiChieu;
    @Column(name = "danh_gia")
    private double danhGia;
    private boolean hot;
    @Column(name = "dang_chieu")
    private boolean dangChieu;
    @Column(name = "sap_chieu")
    private boolean sapChieu;
}
