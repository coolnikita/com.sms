package com.sms.dao.ageGroup;

import java.util.List;
import com.sms.model.AgeGroup;

public interface AgeGroupDAO {
	public void addAgeGroup(AgeGroup info);

	public void updateAgeGroup(AgeGroup info);
	
	public AgeGroup getAgeGroup(int id);
	
	public void deleteAgeGroup(int id);
	
	public List<AgeGroup> getAllAgeGroups();
}
