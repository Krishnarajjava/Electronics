package com.electronics.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.electronics.entity.Mobile;

public interface MobileRepository extends JpaRepository<Mobile, Integer> {
	@Query(value="select * from mobile_details where brand like ?",nativeQuery = true)
	public List<Mobile> getByBrand(String a);
	
	@Query(value="select * from mobile_details where price>=? and price<=?",nativeQuery = true)
	public List<Mobile> getByRange(int a, int b);
	
	@Query(value="select brand from mobile_details where color Like ?",nativeQuery = true)
	public List<String> getBrandByColor(String a);


	

}
