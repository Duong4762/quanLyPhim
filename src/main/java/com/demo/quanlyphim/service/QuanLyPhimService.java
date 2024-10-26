package com.demo.quanlyphim.service;


import com.demo.quanlyphim.dto.ResponseDto;
import com.demo.quanlyphim.dto.ThongTinSuaPhimDto;
import com.demo.quanlyphim.dto.ThongTinTaoPhimDto;

public interface QuanLyPhimService {
    ResponseDto getPhimByNameAndGroup(String name, String group);
    ResponseDto getPhimByPhimCode(int maPhim);
    ResponseDto deletePhim(int maPhim);
    ResponseDto addPhim(ThongTinTaoPhimDto phim);
    ResponseDto updatePhim(ThongTinSuaPhimDto phim);
}
