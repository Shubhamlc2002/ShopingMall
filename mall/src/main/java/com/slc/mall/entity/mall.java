package com.slc.mall.entity;

import java.io.Serializable;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data

public class mall implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	@OneToOne(cascade =CascadeType.ALL )
	@JoinColumn(name = "Fk_address")
	private address adress;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Fk_product")
	private Set<product>product;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Fk_employee")
	Set<employee>employee;

}
