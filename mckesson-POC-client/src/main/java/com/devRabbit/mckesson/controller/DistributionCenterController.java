package com.devRabbit.mckesson.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.devRabbit.mckesson.entity.DistributionCenter;
import com.devRabbit.mckesson.entity.Supplier;
import com.devRabbit.mckesson.service.DistributionCenterService;

@Controller
public class DistributionCenterController {

	@Autowired
	private DistributionCenterService distributionCenterService;

	private List<DistributionCenter> distributorList = null;

	public List<DistributionCenter> getDistributionCenters() {

		return Collections.unmodifiableList(Arrays.asList(distributionCenterService.getAllDistributionCenters()));
	}

	@RequestMapping(value = "/distribution/get", method = RequestMethod.GET)
	public String getDistributionCenters(Model model) {

		model.addAttribute("distributionCenter", getDistributionCenters());
		return "/distributionCenter/display";

	}

	@RequestMapping(value = "/distribution/add", method = RequestMethod.GET)
	public String addDistributionCenter(Model model) {
		model.addAttribute("distribution", new DistributionCenter());

		return "/distributionCenter/addDistributionCenter";

	}

	@RequestMapping(value = "/distribution/add", method = RequestMethod.POST)
	public String addDistributionCenter(final DistributionCenter distributionCenter) {
		distributionCenterService.addDistributionCenter(distributionCenter);
		return "redirect:/distribution/get";

	}

	@RequestMapping(value = "/distribution/getByNames", method = RequestMethod.GET)
	@ResponseBody
	public List<String> simulateSearchResult(String name) {

		if (distributorList == null || distributorList.size() == 0)
			this.getDistributionCenters();
		List<String> result = null;
		if (name == null || name.length() == 0) {
			result =this.distributorList.stream()
					.map(d->d.getName())
					.sorted()
					.collect(Collectors.toList());
		} else {
			result = this.distributorList.stream().
					map(d -> d.getName())
					.filter(d -> d.toLowerCase().contains(name.toLowerCase())).sorted().collect(Collectors.toList());
		}

		return result;

	}

	
}
