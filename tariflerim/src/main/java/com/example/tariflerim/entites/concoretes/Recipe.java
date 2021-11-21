package com.example.tariflerim.entites.concoretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Recipes")
public class Recipe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	
	@Column(name = "userId")
    private int userId;

	@Column(name = "name")
    private String name;

	@Column(name = "tarif")
    private String tarif;
	
	@Column(name = "image")
    private String image;
	
	@Column(name = "date")
    private String date = new Date().toString();

}
