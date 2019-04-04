package com.equifax.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class REPORT_MASTER {
	
	@Id
	@Column(name="REPORT_ID")
	private String reportId;
	
	@Column(name="REPORT_NAME")
	private String REPORT_NAME;
	
	@Column(name="DESCRIPTION")
	private String DESCRIPTION;
	
	@Column(name="REPORT_BASE_TABLE")
	private String REPORT_BASE_TABLE;
	
	@Column(name="X_AXIS_FIELD")
	private String X_AXIS_FIELD;
	
	@Column(name="Y_AXIS_FIELD")
	private String Y_AXIS_FIELD;
	
	@Column(name="X_LABEL")
	private String X_LABEL;
	
	@Column(name="Y_LABEL")
	private String Y_LABEL;
	
	@Column(name="X_AXIS_TYPE")
	private String X_AXIS_TYPE;
	
	@Column(name="Y_AXIS_TYPE")
	private String Y_AXIS_TYPE;
	
	@Column(name="DEFAULT_REPORT")
	private String DEFAULT_REPORT;
	
	@Column(name="FORMULA")
	private String FORMULA;
	
	@OneToMany(mappedBy = "REPORT_MASTER", targetEntity=REPORT_DETAILS.class,cascade = CascadeType.ALL)
    private Set REPORT_DETAILS;

	public String getReportId() {
		return reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public String getREPORT_NAME() {
		return REPORT_NAME;
	}

	public void setREPORT_NAME(String rEPORT_NAME) {
		REPORT_NAME = rEPORT_NAME;
	}

	public String getDESCRIPTION() {
		return DESCRIPTION;
	}

	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}

	public String getREPORT_BASE_TABLE() {
		return REPORT_BASE_TABLE;
	}

	public void setREPORT_BASE_TABLE(String rEPORT_BASE_TABLE) {
		REPORT_BASE_TABLE = rEPORT_BASE_TABLE;
	}

	public String getX_AXIS_FIELD() {
		return X_AXIS_FIELD;
	}

	public void setX_AXIS_FIELD(String x_AXIS_FIELD) {
		X_AXIS_FIELD = x_AXIS_FIELD;
	}

	public String getY_AXIS_FIELD() {
		return Y_AXIS_FIELD;
	}

	public void setY_AXIS_FIELD(String y_AXIS_FIELD) {
		Y_AXIS_FIELD = y_AXIS_FIELD;
	}

	public String getX_LABEL() {
		return X_LABEL;
	}

	public void setX_LABEL(String x_LABEL) {
		X_LABEL = x_LABEL;
	}

	public String getY_LABEL() {
		return Y_LABEL;
	}

	public void setY_LABEL(String y_LABEL) {
		Y_LABEL = y_LABEL;
	}

	public String getX_AXIS_TYPE() {
		return X_AXIS_TYPE;
	}

	public void setX_AXIS_TYPE(String x_AXIS_TYPE) {
		X_AXIS_TYPE = x_AXIS_TYPE;
	}

	public String getY_AXIS_TYPE() {
		return Y_AXIS_TYPE;
	}

	public void setY_AXIS_TYPE(String y_AXIS_TYPE) {
		Y_AXIS_TYPE = y_AXIS_TYPE;
	}

	public String getDEFAULT_REPORT() {
		return DEFAULT_REPORT;
	}

	public void setDEFAULT_REPORT(String dEFAULT_REPORT) {
		DEFAULT_REPORT = dEFAULT_REPORT;
	}

	public String getFORMULA() {
		return FORMULA;
	}

	public void setFORMULA(String fORMULA) {
		FORMULA = fORMULA;
	}
	
	
	
	
	
	
	
	

}
