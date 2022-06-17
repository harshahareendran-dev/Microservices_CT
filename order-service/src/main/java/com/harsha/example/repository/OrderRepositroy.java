package com.harsha.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsha.example.vo.OrderVO;

public interface OrderRepositroy extends JpaRepository<OrderVO, Integer>{

}
