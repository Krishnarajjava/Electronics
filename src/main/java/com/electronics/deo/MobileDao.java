package com.electronics.deo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.electronics.entity.Mobile;
import com.electronics.repository.MobileRepository;
@Repository
public class MobileDao {
	@Autowired
	MobileRepository mr;
	public String setMobile(Mobile mo) {
	
		mr.save(mo);
		return "Success";
	}
	public String setAllMobile(List<Mobile> m) {
	
		 mr.saveAll(m);
		 return "Success";
	}
	public List<Mobile> getAllMobile() {
		return mr.findAll();
	}
	public Mobile getById( int m) {
		return mr.findById(m).get();
	
	}
	public List<Mobile> getByBrand(String a) {
		
		return mr.getByBrand(a);
	}
	public List<Mobile> getByRange(int a, int b) {
		
		return mr.getByRange(a,b);
	}
	public List<String> getBrandByColor(String a) {
		
		return mr.getBrandByColor(a);
	}

}
