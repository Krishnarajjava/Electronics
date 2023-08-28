package com.electronics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.electronics.deo.MobileDao;
import com.electronics.entity.Mobile;


@Service
public class MobileService {
	@Autowired
	MobileDao md;

	public String setMobile( Mobile mo) {
		return md.setMobile(mo);
		
	}

	public String setAllMobile(List<Mobile> m) {
		return md.setAllMobile(m);
	}

	public List<Mobile> getAllMobile() {
		
		return md.getAllMobile();
	}

	public Mobile getById(int m) {

		return md.getById(m);
	}

	public List<Mobile> getByBrand(String a) {
	
		return md.getByBrand(a);
	}

	public List<Mobile> getByRange(int a, int b) {
		
		return md.getByRange(a,b);
	}

	public List<String> getBrandByColor(String a) {
		
		return md.getBrandByColor(a);
	}

}
