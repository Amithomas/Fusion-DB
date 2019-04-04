package com.equifax.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.equifax.dao.NAS_USAGE_Repository;
import com.equifax.model.NAS_USAGE;

@Service
public class NASUsageServiceImpl implements NASUsageService {
@Autowired
private NAS_USAGE_Repository NASusagerepository;

public List<NAS_USAGE>getNASUsage(){
	return NASusagerepository.findAll();
}
}
