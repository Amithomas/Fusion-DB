package com.equifax.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.equifax.dao.DATA_PUMB_JOB_DETAILS_Repository;
import com.equifax.model.DATA_PUMB_JOB_DETAILS;

@Service
public class DataPumpJobServiceImpl implements DataPumpJobService {
	@Autowired
	private DATA_PUMB_JOB_DETAILS_Repository DataPumpJobRepository;
	
	public List<DATA_PUMB_JOB_DETAILS>getAllDetails(){
		return DataPumpJobRepository.findAll();
	}
 
}
