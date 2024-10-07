package com.slc.mall.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String State;
	private String Dist;
	private String tel;
	private int pin_code;

}
