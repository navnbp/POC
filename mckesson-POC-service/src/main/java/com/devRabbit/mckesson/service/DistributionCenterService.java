package com.devRabbit.mckesson.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.devRabbit.mckesson.entity.DistributionCenter;

@Service
public interface DistributionCenterService {

	List<DistributionCenter> getAllDistributionCenters();

	DistributionCenter addDistributionCenter(DistributionCenter distributionCenter);

}
