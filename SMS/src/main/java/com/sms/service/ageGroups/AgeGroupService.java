package com.sms.service.ageGroups;

import java.util.List;

import com.sms.model.AgeGroup;

public interface AgeGroupService {
	
	public void addAgeGroup(AgeGroup info);

	public void updateAgeGroup(AgeGroup info);
	
	public AgeGroup getAgeGroup(int id);
	
	public void deleteAgeGroup(int id);
	
	public List<AgeGroup> getAllAgeGroups();
}
