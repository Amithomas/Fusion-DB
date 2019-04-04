package com.equifax.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class GP_SERVER_STAT {
	
	@Id
	@Column(name="SEGMENT_NAME")
	private String SEGMENT_NAME;
	
	@Column(name="STATUS")
	private Integer STATUS;
	
	@Column(name="ERROR_WARNING")
	private String ERROR_WARNING;
	
	@Column(name="DOWNTIME")
	private String DOWNTIME;
	
	@ManyToOne
	@JoinColumn(name = "CLUSTER_ID")
	private CLUSTER_DETAILS CLUSTER_DETAILS;
	
	@ManyToOne
	@JoinColumn(name = "HOST_ID")
	private HOST_DETAILS HOST_DETAILS;

	public String getSEGMENT_NAME() {
		return SEGMENT_NAME;
	}

	public void setSEGMENT_NAME(String sEGMENT_NAME) {
		SEGMENT_NAME = sEGMENT_NAME;
	}

	public Integer getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(Integer sTATUS) {
		STATUS = sTATUS;
	}

	public String getERROR_WARNING() {
		return ERROR_WARNING;
	}

	public void setERROR_WARNING(String eRROR_WARNING) {
		ERROR_WARNING = eRROR_WARNING;
	}

	public String getDOWNTIME() {
		return DOWNTIME;
	}

	public void setDOWNTIME(String dOWNTIME) {
		DOWNTIME = dOWNTIME;
	}

	public CLUSTER_DETAILS getCLUSTER_DETAILS() {
		return CLUSTER_DETAILS;
	}

	public void setCLUSTER_DETAILS(CLUSTER_DETAILS cLUSTER_DETAILS) {
		CLUSTER_DETAILS = cLUSTER_DETAILS;
	}

	public HOST_DETAILS getHOST_DETAILS() {
		return HOST_DETAILS;
	}

	public void setHOST_DETAILS(HOST_DETAILS hOST_DETAILS) {
		HOST_DETAILS = hOST_DETAILS;
	}
	
	
	
	

}
