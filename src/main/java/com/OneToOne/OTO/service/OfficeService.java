package com.OneToOne.OTO.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OneToOne.OTO.entity.Office;
import com.OneToOne.OTO.repository.OfficeRepository;

@Service
public class OfficeService implements ServiceImplement{
	
	@Autowired
	private OfficeRepository officeRepository;

	@Override
	public Office post(Office office) {
		return officeRepository.save(office);
	}

	@Override
	public List<Office> postall(List<Office> list) {
		return officeRepository.saveAll(list);
	}

	@Override
	public Optional<Office> get(int id) {
		return officeRepository.findById(id);
	}

	@Override
	public List<Office> getall() {
		return officeRepository.findAll();
	}

	@Override
	public Office update(Office office) {
		Optional<Office>optional=officeRepository.findById(office.getO_id());
		Office office2=optional.get();
		office2.setO_id(office.getO_id());
		office2.setOfficename(office.getOfficename());
		office2.setPlace(office.getPlace());
		office2.setWorkers(office.getWorkers());
		return officeRepository.save(office2);
		
	}

	@Override
	public void delete(int id) {
		officeRepository.deleteById(id);
		
	}
	

}
