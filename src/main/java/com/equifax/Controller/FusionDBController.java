package com.equifax.Controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.equifax.model.DATA_PUMB_JOB_DETAILS;
import com.equifax.model.FUSION_JOB_DETAILS;
import com.equifax.model.FUSION_JOB_SNAP_SHOT;
import com.equifax.model.GP_USAGE;
import com.equifax.model.NAS_USAGE;
import com.equifax.service.DataPumpJobService;
import com.equifax.service.FusionJobService;
import com.equifax.service.GPUsageService;
import com.equifax.service.NASUsageService;
import com.equifax.service.ReportGenService;
@RestController
public class FusionDBController {
	
	@Autowired
	private FusionJobService fusionJobService;
	@Autowired
	private DataPumpJobService dataPumpJobService;
	@Autowired
	private GPUsageService gpUsageService;
	@Autowired
	private NASUsageService nasUsageService;
	@Autowired
	private ReportGenService reportGenService;
	
	@CrossOrigin
	@RequestMapping(value="/jobsnapshot", method = RequestMethod.GET)
    public List<FUSION_JOB_SNAP_SHOT> getfusionjobsnapshot()throws IOException 
    {
    	return fusionJobService.getFusionJobSnapshot();
    }
    
    @CrossOrigin
	@RequestMapping(value="/jobstatus", method = RequestMethod.GET)
    public List<Map> getfusionjobstatus()throws IOException 
    {
    	return fusionJobService.getOverallJobDetails();
    }
    
    @CrossOrigin
	@RequestMapping(value="/jobdatewisestatus", method = RequestMethod.GET)
    public List<Map> getfusionDateWisejobstatus(@RequestParam String from,@RequestParam String to)throws IOException, ParseException 
    {
    	 return fusionJobService.getOverallDateWiseJobDetails(from, to);
    }
    
    @CrossOrigin
	@RequestMapping(value="/jobstatuswiselist", method = RequestMethod.GET)
    public List<FUSION_JOB_DETAILS> getStatuswiselist(@RequestParam String status){
    	return fusionJobService.getJobDetails(status);
    }
    
    @CrossOrigin
	@RequestMapping(value="/datapumpjoblist", method = RequestMethod.GET)
    public List<DATA_PUMB_JOB_DETAILS> getDatapumpJoblist()
    {
    	return dataPumpJobService.getAllDetails();
    }
    
    @CrossOrigin
	@RequestMapping(value="/gpusage", method = RequestMethod.GET)
    public List<GP_USAGE> getGPUsage(){
    	return gpUsageService.getGPusage();
    }
    
    @CrossOrigin
	@RequestMapping(value="/nasusage", method = RequestMethod.GET)
    public List<NAS_USAGE> getNASUsage(){
    	return nasUsageService.getNASUsage();
    }
    
    @CrossOrigin
	@RequestMapping(value="/getreport", method = RequestMethod.GET)
    public List<Object> getGenReport(@RequestParam String duration){
    	return reportGenService.genReport(duration);
    }
}
