package com.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sms.service.ageGroups.AgeGroupService;

@Controller
@RequestMapping(value="/ageGroup")
public class AgeGroupController {
	
	AgeGroupService service;
	
	
}
