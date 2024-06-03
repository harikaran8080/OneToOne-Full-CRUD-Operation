package com.OneToOne.OTO.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "workers")
public class Workers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int w_id;
	
	private String name;
	
	private String roll;
	
	private int salary;
	

}
