package com.OneToOne.OTO.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "office")
public class Office {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int o_id;
	
	private String officename;
	
	private String place;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "w_id")
	private Workers workers;
	

}
