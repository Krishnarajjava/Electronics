package com.electronics.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electronics.entity.Mobile;
import com.electronics.service.MobileService;

@RestController
@RequestMapping(value="/mobile")
public class MobileController {
	@Autowired
	MobileService ms;
	@PostMapping(value="/setMobile")
	public String setMobile(@RequestBody Mobile mo) {
		return ms.setMobile(mo);
	}
	@PostMapping(value="/setAllMobile")
	public String setAllMobile(@RequestBody List<Mobile> m) {
		return ms.setAllMobile(m);
	}
	@GetMapping(value="/getAllMobile")
	public List<Mobile> getAllMobile(){
		return ms.getAllMobile();
	}
	@GetMapping(value="/getById/{m}")
	public Mobile getById(@PathVariable int m) {
		return ms.getById(m);
	}
	@GetMapping(value="/getByBrand/{a}")
	public List<Mobile> getByBrand(@PathVariable String a){
		return ms.getByBrand(a);
	}
	@GetMapping(value="/getByRange/{a}/{b}")
	public List<Mobile> getByRange(@PathVariable int a,@PathVariable int b){
		return ms.getByRange(a, b);
	}
	@GetMapping(value="/getBrandByColor/{a}")
	public List<String> getBrandByColor(@PathVariable String a){
		return ms.getBrandByColor(a);
	}
}


