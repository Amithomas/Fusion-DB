package com.equifax.service;


import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Date;

import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.equifax.dao.CLUSTER_DETAILS_Repository;
import com.equifax.dao.FUSION_JOB_DETAILS_Repository;
import com.equifax.dao.FUSION_JOB_SNAP_SHOT_Repository;
import com.equifax.model.CLUSTER_DETAILS;
import com.equifax.model.FUSION_JOB_DETAILS;
import com.equifax.model.FUSION_JOB_SNAP_SHOT;
@Service
public class FusionJobServiceImpl implements FusionJobService {
	@Autowired
	private FUSION_JOB_SNAP_SHOT_Repository FusionJobSnapShotRepository;
	@Autowired
	private FUSION_JOB_DETAILS_Repository FusionJobDetailsRepository;
	@Autowired
	private CLUSTER_DETAILS_Repository ClusterDetailsRepository;
	
	public List<FUSION_JOB_SNAP_SHOT> getFusionJobSnapshot(){
		return FusionJobSnapShotRepository.findAll();
	}
	
	public List<Map>getOverallJobDetails(){
		
		int completed=0;
		int pending=0;
		int failed=0;
		int inProgress=0;
		int cancelling=0;
		int purged =0;
		int cancelled =0;
		int toBePurged=0;
		int invalid=0;
		int archived=0;
		
		Map<String,Object> jobsCompleted= new HashMap<String,Object>();
		Map<String,Object> jobsFailed= new HashMap<String,Object>();
		Map<String,Object> jobsPending= new HashMap<String,Object>();
		Map<String,Object> jobsInProgress= new HashMap<String,Object>();
		Map<String,Object> jobscancelling= new HashMap<String,Object>();
		Map<String,Object> jobsCancelled= new HashMap<String,Object>();
		Map<String,Object> jobsPurged= new HashMap<String,Object>();
		Map<String,Object> jobsArchived= new HashMap<String,Object>();
		Map<String,Object> jobsTobePurged= new HashMap<String,Object>();
		Map<String,Object> jobsInvalid= new HashMap<String,Object>();
		
		List<Map>OverallStatus=new ArrayList<Map>();
		List<FUSION_JOB_DETAILS> jobDetails= FusionJobDetailsRepository.findAll();
		int total = jobDetails.size();
		for(FUSION_JOB_DETAILS job : jobDetails ) {
			if(job.getJobSTATUS().equals("COMPLETED")) completed++;
			if(job.getJobSTATUS().equals("PENDING")) pending++;
			if(job.getJobSTATUS().equals("FAILED")) failed++;
			if(job.getJobSTATUS().equals("IN_PROGRESS")) inProgress++;
			if(job.getJobSTATUS().equals("CANCELLING")) cancelling++;
			if(job.getJobSTATUS().equals("PURGED")) purged++;
			if(job.getJobSTATUS().equals("CANCELLED")) cancelled++;
			if(job.getJobSTATUS().equals("TO_BE_PURGED")) toBePurged++;
			if(job.getJobSTATUS().equals("INVALID")) invalid++;
			if(job.getJobSTATUS().equals("ARCHIVED")) archived++;
			}
		jobsCompleted.put("title", "COMPLETED");
		jobsCompleted.put("value",completed);
		jobsCompleted.put("total", total);
		
		jobsFailed.put("title", "FAILED");
		jobsFailed.put("value",failed);
		jobsFailed.put("total", total);
		
		jobsPending.put("title", "PENDING");
		jobsPending.put("value",pending);
		jobsPending.put("total", total);
		
		jobsInProgress.put("title", "IN_PROGRESS");
		jobsInProgress.put("value",inProgress);
		jobsInProgress.put("total", total);
		
		jobscancelling.put("title", "CANCELLING");
		jobscancelling.put("value",cancelling);
		jobscancelling.put("total", total);
		
		jobsCancelled.put("title", "CANCELLED");
		jobsCancelled.put("value",cancelled);
		jobsCancelled.put("total", total);
		
		jobsPurged.put("title", "PURGED");
		jobsPurged.put("value",purged);
		jobsPurged.put("total", total);
		
		jobsArchived.put("title", "ARCHIVED");
		jobsArchived.put("value",archived);
		jobsArchived.put("total", total);
		
		jobsTobePurged.put("title", "TO_BE_PURGED");
		jobsTobePurged.put("value",toBePurged);
		jobsTobePurged.put("total", total);
		
		jobsInvalid.put("title", "INVALID");
		jobsInvalid.put("value",invalid);
		jobsInvalid.put("total", total);
		
		OverallStatus.add(jobsCompleted);
		OverallStatus.add(jobsFailed);
		OverallStatus.add(jobsPending);
		OverallStatus.add(jobsInProgress);
		OverallStatus.add(jobscancelling);
		OverallStatus.add(jobsCancelled);
		OverallStatus.add(jobsPurged);
		OverallStatus.add(jobsArchived);
		OverallStatus.add(jobsTobePurged);
		OverallStatus.add(jobsInvalid);
		
		return OverallStatus;
		
		
	}
	
public List<Map>getOverallDateWiseJobDetails(String from, String to) throws ParseException{
		
		int completed=0;
		int pending=0;
		int failed=0;
		int inProgress=0;
		int cancelling=0;
		int purged =0;
		int cancelled =0;
		int toBePurged=0;
		int invalid=0;
		int archived=0;
		
		Map<String,Object> jobsCompleted= new HashMap<String,Object>();
		Map<String,Object> jobsFailed= new HashMap<String,Object>();
		Map<String,Object> jobsPending= new HashMap<String,Object>();
		Map<String,Object> jobsInProgress= new HashMap<String,Object>();
		Map<String,Object> jobscancelling= new HashMap<String,Object>();
		Map<String,Object> jobsCancelled= new HashMap<String,Object>();
		Map<String,Object> jobsPurged= new HashMap<String,Object>();
		Map<String,Object> jobsArchived= new HashMap<String,Object>();
		Map<String,Object> jobsTobePurged= new HashMap<String,Object>();
		Map<String,Object> jobsInvalid= new HashMap<String,Object>();
		
		List<Map>OverallStatus=new ArrayList<Map>();
		List<FUSION_JOB_DETAILS> jobDetails= FusionJobDetailsRepository.findAll();
		int total = jobDetails.size();
		for(FUSION_JOB_DETAILS job : jobDetails ) {
			DateFormat formatter;
		      formatter = new SimpleDateFormat("dd/MM/yyyy");
		      Date date = (Date) formatter.parse(from);
		      java.sql.Timestamp timeStampfrom = new Timestamp(date.getTime());
		      
		      Date date1 = (Date) formatter.parse(to);
		      java.sql.Timestamp timeStampto = new Timestamp(date1.getTime());
		      
		  if(job.getDATE_SUBMITTED().compareTo(timeStampfrom)>=0 &&job.getDATE_SUBMITTED().compareTo(timeStampto)<=0 ) {
			if(job.getJobSTATUS().equals("COMPLETED")) completed++;
			if(job.getJobSTATUS().equals("PENDING")) pending++;
			if(job.getJobSTATUS().equals("FAILED")) failed++;
			if(job.getJobSTATUS().equals("IN_PROGRESS")) inProgress++;
			if(job.getJobSTATUS().equals("CANCELLING")) cancelling++;
			if(job.getJobSTATUS().equals("PURGED")) purged++;
			if(job.getJobSTATUS().equals("CANCELLED")) cancelled++;
			if(job.getJobSTATUS().equals("TO_BE_PURGED")) toBePurged++;
			if(job.getJobSTATUS().equals("INVALID")) invalid++;
			if(job.getJobSTATUS().equals("ARCHIVED")) archived++;
			}
		}
		jobsCompleted.put("title", "COMPLETED");
		jobsCompleted.put("value",completed);
		jobsCompleted.put("total", total);
		
		jobsFailed.put("title", "FAILED");
		jobsFailed.put("value",failed);
		jobsFailed.put("total", total);
		
		jobsPending.put("title", "PENDING");
		jobsPending.put("value",pending);
		jobsPending.put("total", total);
		
		jobsInProgress.put("title", "IN_PROGRESS");
		jobsInProgress.put("value",inProgress);
		jobsInProgress.put("total", total);
		
		jobscancelling.put("title", "CANCELLING");
		jobscancelling.put("value",cancelling);
		jobscancelling.put("total", total);
		
		jobsCancelled.put("title", "CANCELLED");
		jobsCancelled.put("value",cancelled);
		jobsCancelled.put("total", total);
		
		jobsPurged.put("title", "PURGED");
		jobsPurged.put("value",purged);
		jobsPurged.put("total", total);
		
		jobsArchived.put("title", "ARCHIVED");
		jobsArchived.put("value",archived);
		jobsArchived.put("total", total);
		
		jobsTobePurged.put("title", "TO_BE_PURGED");
		jobsTobePurged.put("value",toBePurged);
		jobsTobePurged.put("total", total);
		
		jobsInvalid.put("title", "INVALID");
		jobsInvalid.put("value",invalid);
		jobsInvalid.put("total", total);
		
		OverallStatus.add(jobsCompleted);
		OverallStatus.add(jobsFailed);
		OverallStatus.add(jobsPending);
		OverallStatus.add(jobsInProgress);
		OverallStatus.add(jobscancelling);
		OverallStatus.add(jobsCancelled);
		OverallStatus.add(jobsPurged);
		OverallStatus.add(jobsArchived);
		OverallStatus.add(jobsTobePurged);
		OverallStatus.add(jobsInvalid);
		
		return OverallStatus;
		
		
	}
	
	public List<FUSION_JOB_DETAILS> getJobDetails(String Status){
		return FusionJobDetailsRepository.findByjobSTATUS(Status);
	}
	
}
