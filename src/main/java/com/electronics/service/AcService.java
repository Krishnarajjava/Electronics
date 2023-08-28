package com.electronics.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electronics.deo.Acdeo;
import com.electronics.entity.Ac;

@Service
public class AcService {
	@Autowired
	Acdeo acdeo;

	public String setAc(Ac ac) {
		return acdeo.setAc(ac);
	}
	public String setAllAc(List<Ac>acs) {
		return acdeo.setAllAc(acs);
	}
	public List<Ac> getAllAc() {
	
		return acdeo.getAllAc();
	}
	public Ac getById(int x) {
		return acdeo.getById(x);
	}
}
