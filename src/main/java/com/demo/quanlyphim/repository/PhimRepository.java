package com.demo.quanlyphim.repository;

import com.demo.quanlyphim.entity.Phim;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhimRepository extends JpaRepository<Phim, Integer> {
    List<Phim> findByTenPhimContainingIgnoreCaseAndMaNhom(String tenPhim, String maNhom);
}
