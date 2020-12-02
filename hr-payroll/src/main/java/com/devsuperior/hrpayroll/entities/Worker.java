package com.devsuperior.hrpayroll.entities;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Worker implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private Double dailyIncome;
	
}
