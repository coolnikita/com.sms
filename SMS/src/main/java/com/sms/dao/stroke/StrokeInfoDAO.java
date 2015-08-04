package com.sms.dao.stroke;

import java.util.List;

import com.sms.model.StrokeInfo;

public interface StrokeInfoDAO {
	
	public void addStrokeInfo(StrokeInfo info);
	
	public void updateStrokeInfo(StrokeInfo info);
	
	public StrokeInfo getStrokeInfo(int id);
	
	public void deleteStrokeInfo(int id);
	
	public List<StrokeInfo> getAllStrokeInfo();

}
