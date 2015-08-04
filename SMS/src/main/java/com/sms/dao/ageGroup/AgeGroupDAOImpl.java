package com.sms.dao.ageGroup;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.sms.model.AgeGroup;

@Repository
public class AgeGroupDAOImpl implements AgeGroupDAO {

	private SessionFactory sessionFactory;
	
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public void addAgeGroup(AgeGroup group) {
		getCurrentSession().save(group);
	}

	public void updateAgeGroup(AgeGroup info) {
		AgeGroup group = getAgeGroup(info.getGroupId());
		group.setGroupName(info.getGroupName());
		group.setLowerAgeLimit(info.getLowerAgeLimit());
		group.setUpperAgeLimit(info.getUpperAgeLimit());
		getCurrentSession().update(group);
	}

	public AgeGroup getAgeGroup(int id) {
		AgeGroup group = (AgeGroup) getCurrentSession().get(AgeGroup.class, id);
		return group;
	}

	public void deleteAgeGroup(int id) {
		AgeGroup group = getAgeGroup(id);
		if(group!=null)
			getCurrentSession().delete(group);
	}

	@SuppressWarnings("unchecked")
	public List<AgeGroup> getAllAgeGroups() {
		List<AgeGroup> listOfAgeGroups = getCurrentSession().createQuery("from age_group").list();
		return listOfAgeGroups;
	}

}
