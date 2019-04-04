package com.equifax.service;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import com.equifax.model.FUSION_JOB_DETAILS;
import com.equifax.model.FUSION_JOB_SNAP_SHOT;




public interface FusionJobService {
	
	
	public List<FUSION_JOB_SNAP_SHOT> getFusionJobSnapshot();
	public List<FUSION_JOB_DETAILS> getJobDetails(String Status);
	public List<Map>getOverallJobDetails();
	public List<Map>getOverallDateWiseJobDetails(String from, String to) throws ParseException;
}
