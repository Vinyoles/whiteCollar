package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.models.Painting;

public interface PaintingsDAO extends JpaRepository<Painting, Long> {

}
