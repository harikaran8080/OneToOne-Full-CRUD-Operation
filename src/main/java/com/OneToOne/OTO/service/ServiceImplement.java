package com.OneToOne.OTO.service;

import java.util.List;
import java.util.Optional;

import com.OneToOne.OTO.entity.Office;

public interface ServiceImplement {

	Office post(Office office);

	List<Office> postall(List<Office> list);

	Optional<Office> get(int id);

	List<Office> getall();

	Office update(Office office);

	void delete(int id);

}
