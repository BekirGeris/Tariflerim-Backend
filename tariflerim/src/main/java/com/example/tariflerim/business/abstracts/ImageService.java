package com.example.tariflerim.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.tariflerim.core.utilities.result.DataResult;
import com.example.tariflerim.core.utilities.result.Result;
import com.example.tariflerim.entites.concoretes.Image;

@Service
public interface ImageService {

	DataResult<List<Image>> getAll();
	
	DataResult<Image> getByUserId(int userId);
	
	Result add(Image image);
	
	Result delete(int id);
}
