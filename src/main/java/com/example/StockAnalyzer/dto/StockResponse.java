package com.example.StockAnalyzer.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
public class StockResponse {

	
	private int buyDay;
	private int sellDay;
	private int maxProfit;
	
}
