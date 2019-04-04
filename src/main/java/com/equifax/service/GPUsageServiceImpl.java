package com.equifax.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.equifax.dao.GP_USAGE_Repository;
import com.equifax.model.GP_USAGE;
@Service
public class GPUsageServiceImpl implements GPUsageService{
	@Autowired
	private GP_USAGE_Repository GPusagerepository;
	
	public List<GP_USAGE> getGPusage(){
		return GPusagerepository.findAll();
	}
}
