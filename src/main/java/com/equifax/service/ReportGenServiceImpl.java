package com.equifax.service;


import java.util.ArrayList;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.equifax.dao.REPORT_DETAILS_Repository;
import com.equifax.dao.REPORT_MASTER_Repository;
import com.equifax.model.REPORT_DETAILS;
import com.equifax.model.REPORT_MASTER;

@Service
public class ReportGenServiceImpl implements ReportGenService {
	@Autowired
	private REPORT_MASTER_Repository reportMaster;
	
	@Autowired
	private REPORT_DETAILS_Repository reportDetails;
	
	public List<Object> genReport(String duration, String from, String to){
		DateTimeFormatter fmt = DateTimeFormat.forPattern("dd/MM/yyyy");
		List<Object>Report= new ArrayList<Object>();
		List<REPORT_MASTER> reportMasterDetails= reportMaster.findAll();
		List<REPORT_DETAILS> reportDetailsList= reportDetails.findDetails(from,to);
		if(reportDetailsList.size()==0) {
			String Status= "No values in the Boundary";
			List<Object> statusList= new ArrayList<Object>();
			statusList.add(Status);
			return statusList;
		}
		else {
			for(REPORT_MASTER singleReport: reportMasterDetails) {
				List<Integer>yAxisvalues=new ArrayList<Integer>();
				List<String>xAxisvalues=new ArrayList<String>();
				Map<String,Object>reportChart= new HashMap<String,Object>();
				String reportId = singleReport.getReportId();
				List<REPORT_DETAILS> relevantReportDetails= new ArrayList<REPORT_DETAILS>();
				for(REPORT_DETAILS detail:reportDetailsList) {
					if(detail.getREPORT_MASTER().getReportId().equals(reportId)) relevantReportDetails.add(detail);
				}
				relevantReportDetails.sort(Comparator.comparing(REPORT_DETAILS::getX_VALUE));
				if(singleReport.getFORMULA().equals("count")) {
					DateTimeFormatter dtf = DateTimeFormat.forPattern("dd/MM/yyyy");
					LocalDate startDate= LocalDate.parse(relevantReportDetails.get(0).getX_VALUE(), dtf);
					LocalDate endDate=LocalDate.parse(relevantReportDetails.get(relevantReportDetails.size()-1).getX_VALUE(), dtf);
					
					while(startDate.compareTo(endDate)<=0){
						LocalDate tempDate = new LocalDate();
						if(duration.equals("month")) {
							 tempDate= startDate.plusMonths(1);
						}
						
						if(duration.equals("week")) {
							 tempDate= startDate.plusWeeks(1);
						}
						
						if(duration.equals("day")) {
							 tempDate= startDate.plusDays(1);
						}
						if(duration.equals("year")) {
							 tempDate= startDate.plusYears(1);
						}
						int sum=0;
						for(REPORT_DETAILS detail:relevantReportDetails) {
							LocalDate detailDate = LocalDate.parse(detail.getX_VALUE(), dtf);
							if(detailDate.compareTo(tempDate)<0 && detailDate.compareTo(startDate)>=0) {
								sum=sum+Integer.valueOf(detail.getY_VALUE());
							}
						}
						StringBuilder period = new StringBuilder();
						period.append(startDate.toString(fmt));
						period.append(" to ");
						period.append(tempDate.minusDays(1).toString(fmt));
						xAxisvalues.add(period.toString());
						yAxisvalues.add(sum);
						startDate=tempDate;
					}
				}
				reportChart.put("Report", singleReport.getReportId());
				reportChart.put("x-axis", xAxisvalues);
				reportChart.put("y-axis", yAxisvalues);
				Report.add(reportChart);
				}	
			
		return Report;	
		}
	
	}
}
