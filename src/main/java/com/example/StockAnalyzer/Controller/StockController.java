package com.example.StockAnalyzer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StockAnalyzer.Service.StockService;
import com.example.StockAnalyzer.dto.StockResponse;

@RestController
@CrossOrigin(origins = "http://localhost:8080") 
@RequestMapping("/stock")

public class StockController {

	@Autowired
	private StockService stockSerives;

	@PostMapping("/analyze")
	public StockResponse analyzeStock(@RequestBody int[] nums) {

		return stockSerives.getmaxProfit(nums);
	}

}
