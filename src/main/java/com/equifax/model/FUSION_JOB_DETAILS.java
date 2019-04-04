package com.equifax.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class FUSION_JOB_DETAILS {
	
	@Column(name = "PROJECT_NUMBER")
	private String PROJECT_NUMBER;
	
	@Column(name = "JOB_NAME")
	private String JOB_NAME;
	
	@Id
	@Column(name = "JOB_NUMBER")
	private String JOB_NUMBER;
	
	@Column(name = "JOB_STATUS")
	private String jobSTATUS;
	
	@Column(name = "CURRENT_STEP")
	private String CURRENT_STEP;
	
	@Column(name = "CURRENT_STEP_ID")
	private String CURRENT_STEP_ID;
	
	@Column(name = "CURRENT_STEP_STATUS")
	private String CURRENT_STEP_STATUS;
	
	@Column(name = "SUBMITTED_BY")
	private String SUBMITTED_BY;
	
	@Column(name = "DATE_SUBMITTED")
	private Timestamp DATE_SUBMITTED;
	
	@Column(name = "DATE_COMPLETED")
	private Timestamp DATE_COMPLETED;
	
	@Column(name = "ERROR_STAT")
	private String ERROR_STAT;
	
	@ManyToOne
	@JoinColumn(name = "CLUSTER_ID")
	private CLUSTER_DETAILS CLUSTER_DETAILS;

	public String getPROJECT_NUMBER() {
		return PROJECT_NUMBER;
	}

	public void setPROJECT_NUMBER(String pROJECT_NUMBER) {
		PROJECT_NUMBER = pROJECT_NUMBER;
	}

	public String getJOB_NAME() {
		return JOB_NAME;
	}

	public void setJOB_NAME(String jOB_NAME) {
		JOB_NAME = jOB_NAME;
	}

	public String getJOB_NUMBER() {
		return JOB_NUMBER;
	}

	public void setJOB_NUMBER(String jOB_NUMBER) {
		JOB_NUMBER = jOB_NUMBER;
	}

	

	public String getJobSTATUS() {
		return jobSTATUS;
	}

	public void setJobSTATUS(String jobSTATUS) {
		this.jobSTATUS = jobSTATUS;
	}

	public String getCURRENT_STEP() {
		return CURRENT_STEP;
	}

	public void setCURRENT_STEP(String cURRENT_STEP) {
		CURRENT_STEP = cURRENT_STEP;
	}

	public String getCURRENT_STEP_ID() {
		return CURRENT_STEP_ID;
	}

	public void setCURRENT_STEP_ID(String cURRENT_STEP_ID) {
		CURRENT_STEP_ID = cURRENT_STEP_ID;
	}

	public String getCURRENT_STEP_STATUS() {
		return CURRENT_STEP_STATUS;
	}

	public void setCURRENT_STEP_STATUS(String cURRENT_STEP_STATUS) {
		CURRENT_STEP_STATUS = cURRENT_STEP_STATUS;
	}

	public String getSUBMITTED_BY() {
		return SUBMITTED_BY;
	}

	public void setSUBMITTED_BY(String sUBMITTED_BY) {
		SUBMITTED_BY = sUBMITTED_BY;
	}


	public Timestamp getDATE_SUBMITTED() {
		return DATE_SUBMITTED;
	}

	public void setDATE_SUBMITTED(Timestamp dATE_SUBMITTED) {
		DATE_SUBMITTED = dATE_SUBMITTED;
	}

	public Timestamp getDATE_COMPLETED() {
		return DATE_COMPLETED;
	}

	public void setDATE_COMPLETED(Timestamp dATE_COMPLETED) {
		DATE_COMPLETED = dATE_COMPLETED;
	}

	public String getERROR_STAT() {
		return ERROR_STAT;
	}

	public void setERROR_STAT(String eRROR_STAT) {
		ERROR_STAT = eRROR_STAT;
	}

	public CLUSTER_DETAILS getCLUSTER_DETAILS() {
		return CLUSTER_DETAILS;
	}

	public void setCLUSTER_DETAILS(CLUSTER_DETAILS cLUSTER_DETAILS) {
		CLUSTER_DETAILS = cLUSTER_DETAILS;
	}
	
	
	
}
