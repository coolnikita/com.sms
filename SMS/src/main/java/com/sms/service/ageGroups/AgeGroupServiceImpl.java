package com.sms.service.ageGroups;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sms.dao.ageGroup.AgeGroupDAO;
import com.sms.model.AgeGroup;

@Service
@Transactional
public class AgeGroupServiceImpl implements AgeGroupService {

	@Autowired
	private AgeGroupDAO ageDao ;
	
	public void addAgeGroup(AgeGroup info) {
		ageDao.addAgeGroup(info);
	}

	public void updateAgeGroup(AgeGroup info) {
		ageDao.updateAgeGroup(info);
	}

	public AgeGroup getAgeGroup(int id) {
		return ageDao.getAgeGroup(id);
	}

	public void deleteAgeGroup(int id) {
		ageDao.deleteAgeGroup(id);
	}

	public List<AgeGroup> getAllAgeGroups() {
		return ageDao.getAllAgeGroups();
	}

}
