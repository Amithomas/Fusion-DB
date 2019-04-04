package com.equifax.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CUMULATIVE_REPORT_BASE_DATA {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;
	
	@Column(name="PROJECT_NUMBER")
	private String PROJECT_NUMBER;
	
	@Column(name="PROJECT_NAME")
	private String PROJECT_NAME;
	
	@Column(name="CUSTOMER")
	private String CUSTOMER;
	
	@Column(name="JOB_NAME")
	private String JOB_NAME;
	
	@Column(name="STEP_NAME")
	private String STEP_NAME;
	
	@Column(name="JOB_NUMBER")
	private String JOB_NUMBER;
	
	@Column(name="JOB_START_DATE")
	private Timestamp JOB_START_DATE;
	
	@Column(name="JOB_START_DATE_TIME")
	private Timestamp JOB_START_DATE_TIME;
	
	@Column(name="JOB_END_DATE_TIME")
	private Timestamp JOB_END_DATE_TIME;
	
	@Column(name="EXECUTION_TIME")
	private String EXECUTION_TIME;
	
	@Column(name="JOB_SUBMITTED_BY")
	private String JOB_SUBMITTED_BY;
	
	@Column(name="JOB_STATUS")
	private String JOB_STATUS;
	
	@Column(name="PROJECT_RUN_TYPE")
	private String PROJECT_RUN_TYPE;
	
	@Column(name="ITEM_COUNT")
	private Integer ITEM_COUNT;
	
	@Column(name="SIZE_GB")
	private BigDecimal SIZE_GB;
	
	@Column(name="CLUSTER_ID")
	private String CLUSTER_ID;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPROJECT_NUMBER() {
		return PROJECT_NUMBER;
	}

	public void setPROJECT_NUMBER(String pROJECT_NUMBER) {
		PROJECT_NUMBER = pROJECT_NUMBER;
	}

	public String getPROJECT_NAME() {
		return PROJECT_NAME;
	}

	public void setPROJECT_NAME(String pROJECT_NAME) {
		PROJECT_NAME = pROJECT_NAME;
	}

	public String getCUSTOMER() {
		return CUSTOMER;
	}

	public void setCUSTOMER(String cUSTOMER) {
		CUSTOMER = cUSTOMER;
	}

	public String getJOB_NAME() {
		return JOB_NAME;
	}

	public void setJOB_NAME(String jOB_NAME) {
		JOB_NAME = jOB_NAME;
	}

	public String getSTEP_NAME() {
		return STEP_NAME;
	}

	public void setSTEP_NAME(String sTEP_NAME) {
		STEP_NAME = sTEP_NAME;
	}

	public String getJOB_NUMBER() {
		return JOB_NUMBER;
	}

	public void setJOB_NUMBER(String jOB_NUMBER) {
		JOB_NUMBER = jOB_NUMBER;
	}

	public Timestamp getJOB_START_DATE() {
		return JOB_START_DATE;
	}

	public void setJOB_START_DATE(Timestamp jOB_START_DATE) {
		JOB_START_DATE = jOB_START_DATE;
	}

	public Timestamp getJOB_START_DATE_TIME() {
		return JOB_START_DATE_TIME;
	}

	public void setJOB_START_DATE_TIME(Timestamp jOB_START_DATE_TIME) {
		JOB_START_DATE_TIME = jOB_START_DATE_TIME;
	}

	public Timestamp getJOB_END_DATE_TIME() {
		return JOB_END_DATE_TIME;
	}

	public void setJOB_END_DATE_TIME(Timestamp jOB_END_DATE_TIME) {
		JOB_END_DATE_TIME = jOB_END_DATE_TIME;
	}

	public String getEXECUTION_TIME() {
		return EXECUTION_TIME;
	}

	public void setEXECUTION_TIME(String eXECUTION_TIME) {
		EXECUTION_TIME = eXECUTION_TIME;
	}

	public String getJOB_SUBMITTED_BY() {
		return JOB_SUBMITTED_BY;
	}

	public void setJOB_SUBMITTED_BY(String jOB_SUBMITTED_BY) {
		JOB_SUBMITTED_BY = jOB_SUBMITTED_BY;
	}

	public String getJOB_STATUS() {
		return JOB_STATUS;
	}

	public void setJOB_STATUS(String jOB_STATUS) {
		JOB_STATUS = jOB_STATUS;
	}

	public String getPROJECT_RUN_TYPE() {
		return PROJECT_RUN_TYPE;
	}

	public void setPROJECT_RUN_TYPE(String pROJECT_RUN_TYPE) {
		PROJECT_RUN_TYPE = pROJECT_RUN_TYPE;
	}

	public Integer getITEM_COUNT() {
		return ITEM_COUNT;
	}

	public void setITEM_COUNT(Integer iTEM_COUNT) {
		ITEM_COUNT = iTEM_COUNT;
	}

	public BigDecimal getSIZE_GB() {
		return SIZE_GB;
	}

	public void setSIZE_GB(BigDecimal sIZE_GB) {
		SIZE_GB = sIZE_GB;
	}

	public String getCLUSTER_ID() {
		return CLUSTER_ID;
	}

	public void setCLUSTER_ID(String cLUSTER_ID) {
		CLUSTER_ID = cLUSTER_ID;
	}
	
	
	

}
