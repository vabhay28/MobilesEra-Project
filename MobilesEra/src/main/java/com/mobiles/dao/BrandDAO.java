package com.mobiles.dao;

import java.util.List;

import com.mobiles.model.Brand;


public interface BrandDAO 
{
	public void addBrand(Brand brand);
	
	public List<Brand> fetchAllBrand();
	
	public Brand getBrandById(int brandId);
	
	public void deleteBrand(int brandId);
}
