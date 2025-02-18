package com.example.StockAnalyzer.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.StockAnalyzer.dto.StockResponse;

@Service
@CrossOrigin(origins = "*")
public class StockService {

	public StockResponse getmaxProfit(int[] nums) {

		if (nums.length < 2 || nums.length == 0) {

			return new StockResponse(0, -1, -1);
		}
		int maxProfit = 0;
		int buyDay = 0;
		int sellDay = 0;
		int minimal = nums[0];

		for (int i = 1; i < nums.length; i++) {

			if (minimal > nums[i]) {

				minimal = nums[i];
				buyDay = i;

			}
			int cost = nums[i] - minimal;

			if (maxProfit < cost) {

				maxProfit = cost;
				sellDay = i;

			}

		}

		return new StockResponse(buyDay, sellDay, maxProfit);
	}

}
