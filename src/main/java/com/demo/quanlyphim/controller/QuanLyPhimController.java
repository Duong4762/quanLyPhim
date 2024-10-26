package com.demo.quanlyphim.controller;

import com.demo.quanlyphim.dto.ResponseDto;
import com.demo.quanlyphim.dto.ThongTinSuaPhimDto;
import com.demo.quanlyphim.dto.ThongTinTaoPhimDto;
import com.demo.quanlyphim.service.QuanLyPhimService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/QuanLyPhim")
public class QuanLyPhimController {
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private QuanLyPhimService quanLyPhimService;
    @GetMapping("/LayDanhSachPhim")
    public ResponseDto layDanhSachPhim(@RequestParam(defaultValue = "GP01", required = false) String maNhom, @RequestParam(defaultValue = "", required = false) String tenPhim){
        return quanLyPhimService.getPhimByNameAndGroup(tenPhim, maNhom);
    }
    @GetMapping("/LayThongTinPhim")
    public ResponseDto layThongTinPhim(@RequestParam(name = "MaPhim") int maPhim){
        return quanLyPhimService.getPhimByPhimCode(maPhim);
    }
    @PostMapping("/ThemPhimUploadHinh")
    public ResponseDto themPhim(@ModelAttribute ThongTinTaoPhimDto thongTinTaoPhimDto){
        return quanLyPhimService.addPhim(thongTinTaoPhimDto);
    }
    @PostMapping("/CapNhatPhimUpload")
    public ResponseDto capNhatPhim(@ModelAttribute ThongTinSuaPhimDto thongTinSuaPhimDto){
        return quanLyPhimService.updatePhim(thongTinSuaPhimDto);
    }
    @DeleteMapping("/XoaPhim")
    public ResponseDto XoaPhim(@RequestParam(name = "MaPhim") int maPhim){
        return quanLyPhimService.deletePhim(maPhim);
    }
}
