package com.example.tariflerim.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tariflerim.entites.concoretes.Image;

@Repository
public interface ImageDao extends JpaRepository<Image, Integer>{
	
	List<Image> findAll();
	
	Image getByUserId(int userId);
}
