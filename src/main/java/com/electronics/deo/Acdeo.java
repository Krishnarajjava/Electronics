package com.electronics.deo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.electronics.entity.Ac;
import com.electronics.repository.AcRepository;

@Repository
public class Acdeo {
	@Autowired
	AcRepository ar;

	public String setAc(Ac ac) {
		ar.save(ac);
		return "saved";

	}

	public String setAllAc(List<Ac> acs) {
	
		ar.saveAll(acs);
		return "all saved";
	}

	public List<Ac> getAllAc() {
	
		return ar.findAll();
	}

	public Ac getById(int x) {
		return ar.findById(x).get();
	}

}
