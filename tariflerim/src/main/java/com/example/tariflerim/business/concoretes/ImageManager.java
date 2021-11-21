package com.example.tariflerim.business.concoretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.tariflerim.business.abstracts.ImageService;
import com.example.tariflerim.core.utilities.result.DataResult;
import com.example.tariflerim.core.utilities.result.Result;
import com.example.tariflerim.core.utilities.result.SuccessDataResult;
import com.example.tariflerim.core.utilities.result.SuccessResult;
import com.example.tariflerim.dataAccess.abstracts.ImageDao;
import com.example.tariflerim.entites.concoretes.Image;

@Service
public class ImageManager implements ImageService{

	ImageDao imageDao;
	
	@Autowired
	public ImageManager(ImageDao imageDao) {
		super();
		this.imageDao = imageDao;
	}

	@Override
	public DataResult<List<Image>> getAll() {
		return new SuccessDataResult<List<Image>>(imageDao.findAll(), "Görseller listelendi.");
	}

	@Override
	public DataResult<Image> getByUserId(int userId) {
		return new SuccessDataResult<Image>(imageDao.getByUserId(userId), "görsel getirildi.");
	}

	@Override
	public Result add(Image image) {
		imageDao.save(image);
		return new SuccessResult("görsel eklendi.");
	}

	@Override
	public Result delete(int id) {
		imageDao.deleteById(id);
		return new SuccessResult("görsel silindiç.");
	}

	
}
