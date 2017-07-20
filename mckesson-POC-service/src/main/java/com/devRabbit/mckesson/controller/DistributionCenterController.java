package com.devRabbit.mckesson.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devRabbit.mckesson.entity.DistributionCenter;
import com.devRabbit.mckesson.entity.Supplier;
import com.devRabbit.mckesson.service.DistributionCenterService;

@RestController
@RequestMapping("/distribution")
public class DistributionCenterController {

	
	@Autowired
	private DistributionCenterService distributionCenterService;
	
	
	
	@GetMapping("/get")
	public List<DistributionCenter> getDistributionCenters() {

		return distributionCenterService.getAllDistributionCenters();
	}
	
	@PostMapping("/add")
	public DistributionCenter addDistributionCenter(@RequestBody final DistributionCenter distributionCenter) 
	{
		return distributionCenterService.addDistributionCenter(distributionCenter);
		
	}
}
