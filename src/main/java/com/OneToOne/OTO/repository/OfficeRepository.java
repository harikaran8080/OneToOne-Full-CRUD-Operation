package com.OneToOne.OTO.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OneToOne.OTO.entity.Office;

@Repository
public interface OfficeRepository extends JpaRepository<Office, Integer>{

}
