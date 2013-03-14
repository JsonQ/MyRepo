package com.test;

import java.util.List;

import com.web.form.pojo.FlcInfo;

public interface IFlcInfoAction {

	public FlcInfo getOne(FlcInfo flc) throws Exception;
	public List<FlcInfo> getMany(FlcInfo flc) throws Exception;
}
