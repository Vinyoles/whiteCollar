package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.models.Shop;

public interface ShopsDAO extends JpaRepository<Shop, Long> {

}
