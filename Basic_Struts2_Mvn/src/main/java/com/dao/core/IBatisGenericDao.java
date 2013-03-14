package com.dao.core;

import java.util.List;

import org.springframework.dao.DataAccessException;

public interface IBatisGenericDao {
	public <T> T getRecord(String sqlID, Object object) throws DataAccessException;
	public <T> List<T> getRecordList(String sqlID, Object object) throws DataAccessException;
	public <T> List<T> getRecordList(String sqlID, Object object, int offset, int limit) throws DataAccessException;
	
	public int insertRecord(String sqlID, Object object) throws DataAccessException;
	
	public int updateRecord(String sqlID, Object object) throws DataAccessException;
	
	public int deleteRecord(String sqlID, Object object) throws DataAccessException;

}
