package com.example.tariflerim.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tariflerim.business.abstracts.ImageService;
import com.example.tariflerim.core.utilities.result.DataResult;
import com.example.tariflerim.core.utilities.result.Result;
import com.example.tariflerim.entites.concoretes.Image;


@CrossOrigin
@RestController
@RequestMapping("/api/imageControllers")
public class ImageController{

	ImageService imageService;
	
	@Autowired
	public ImageController(ImageService imageService) {
		super();
		this.imageService = imageService;
	}

	@GetMapping("/getAll")
	public DataResult<List<Image>> getAll() {
		return imageService.getAll();
	}

	@GetMapping("/getImageWithUserId")
	public DataResult<Image> getImageWithUserId(int userId) {
		return imageService.getByUserId(userId);
	}

	@PostMapping("/add")
	public Result add(Image image) {
		return imageService.add(image);
	}

	@PostMapping("/delete")
	public Result delete(int id) {
		return imageService.delete(id);
	}

}
