package com.equifax.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class HOST_APPLICATION_MAPPING {
	
	@Id
	@Column(name="APP_NAME")
	private String APP_NAME;
	
	@Column(name="APP_TYPE")
	private String APP_TYPE;
	
	@Column(name="APP_VERSION")
	private String APP_VERSION;
	
	@Column(name="SERVER")
	private String SERVER;
	
	@Column(name="SERVER_VERSION")
	private String SERVER_VERSION;
	
	@Column(name="JVM_USAGE")
	private BigDecimal JVM_USAGE;
	
	@Column(name="LOG")
	private String LOG;
	
	@Column(name="STATUS")
	private Integer STATUS;
	
	@Column(name="DOWN_TIME")
	private String DOWN_TIME;
	
	@ManyToOne
	@JoinColumn(name = "HOST_ID")
	private HOST_DETAILS HOST_DETAILS;

	public String getAPP_NAME() {
		return APP_NAME;
	}

	public void setAPP_NAME(String aPP_NAME) {
		APP_NAME = aPP_NAME;
	}

	public String getAPP_TYPE() {
		return APP_TYPE;
	}

	public void setAPP_TYPE(String aPP_TYPE) {
		APP_TYPE = aPP_TYPE;
	}

	public String getAPP_VERSION() {
		return APP_VERSION;
	}

	public void setAPP_VERSION(String aPP_VERSION) {
		APP_VERSION = aPP_VERSION;
	}

	public String getSERVER() {
		return SERVER;
	}

	public void setSERVER(String sERVER) {
		SERVER = sERVER;
	}

	public String getSERVER_VERSION() {
		return SERVER_VERSION;
	}

	public void setSERVER_VERSION(String sERVER_VERSION) {
		SERVER_VERSION = sERVER_VERSION;
	}

	
	public String getLOG() {
		return LOG;
	}

	public void setLOG(String lOG) {
		LOG = lOG;
	}

	

	public BigDecimal getJVM_USAGE() {
		return JVM_USAGE;
	}

	public void setJVM_USAGE(BigDecimal jVM_USAGE) {
		JVM_USAGE = jVM_USAGE;
	}

	public Integer getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(Integer sTATUS) {
		STATUS = sTATUS;
	}

	public String getDOWN_TIME() {
		return DOWN_TIME;
	}

	public void setDOWN_TIME(String dOWN_TIME) {
		DOWN_TIME = dOWN_TIME;
	}

	public HOST_DETAILS getHOST_DETAILS() {
		return HOST_DETAILS;
	}

	public void setHOST_DETAILS(HOST_DETAILS hOST_DETAILS) {
		HOST_DETAILS = hOST_DETAILS;
	}
	
	

}
