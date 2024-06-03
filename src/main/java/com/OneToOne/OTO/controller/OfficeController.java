package com.OneToOne.OTO.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OneToOne.OTO.entity.Office;
import com.OneToOne.OTO.service.ServiceImplement;

@RestController
@RequestMapping("/office/api")
public class OfficeController {
	
	@Autowired
	private ServiceImplement implement;
	
	
	@PostMapping("/post")
	public Office post(@RequestBody Office office) {
		return implement.post(office);
		
	}
	@PostMapping("/postall")
	public List<Office>Postall(@RequestBody List<Office> list){
		return implement.postall(list);
		
	}
	@GetMapping("/get/{id}")
	public Optional<Office> get(@PathVariable int id){
		return implement.get(id);
		
	}
	@GetMapping("/getall")
	public List<Office> getall(){
		return implement.getall();
		
	}
	@PutMapping("/update")
	public Office update(@RequestBody Office office) {
		return implement.update(office);
		}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		implement.delete(id);
		return"Successfully Deleted";
	}
	

}
