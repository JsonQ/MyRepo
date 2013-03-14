package com.test;

import java.util.List;

import com.dao.core.IBatisGenericDao;
import com.web.form.pojo.FlcInfo;

public class FlcInfoAction implements IFlcInfoAction{

	private IBatisGenericDao dao;
	
	public FlcInfo getOne(FlcInfo flc) throws Exception{
		
		return null;
	}
	
	public List<FlcInfo> getMany(FlcInfo flc) throws Exception{
		
		List<FlcInfo> flcs = dao.getRecordList("FlcInfo.select", flc);
		return flcs;
	}

	public IBatisGenericDao getDao() {
		return dao;
	}

	public void setDao(IBatisGenericDao dao) {
		this.dao = dao;
	}
}
