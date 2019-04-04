package com.equifax.model;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class WIDGET_MASTER {
@Id
@Column(name="WIDGET_ID")
private String WIDGET_ID;

@Column(name="WIDGET_NAME")
private String WIDGET_NAME;

@Column(name="DESCRIPTION")
private String DESCRIPTION;

@Column(name="REFRESH_RATE")
private BigDecimal REFRESH_RATE;

@Column(name="TYPE")
private String TYPE;

@Column(name="DEFAULT_REQUEST")
private String DEFAULT_REQUEST;

@ManyToOne
@JoinColumn(name = "APP_ID")
private DASHBOARD_MASTER DASHBOARD_MASTER;

@OneToMany(mappedBy = "WIDGET_MASTER", targetEntity=DASHBOARD_THRESHOLDS.class,cascade = CascadeType.ALL)
private Set DASHBOARD_THRESHOLDS;

public String getWIDGET_ID() {
	return WIDGET_ID;
}

public void setWIDGET_ID(String wIDGET_ID) {
	WIDGET_ID = wIDGET_ID;
}

public String getWIDGET_NAME() {
	return WIDGET_NAME;
}

public void setWIDGET_NAME(String wIDGET_NAME) {
	WIDGET_NAME = wIDGET_NAME;
}

public String getDESCRIPTION() {
	return DESCRIPTION;
}

public void setDESCRIPTION(String dESCRIPTION) {
	DESCRIPTION = dESCRIPTION;
}

public BigDecimal getREFRESH_RATE() {
	return REFRESH_RATE;
}

public void setREFRESH_RATE(BigDecimal rEFRESH_RATE) {
	REFRESH_RATE = rEFRESH_RATE;
}

public String getTYPE() {
	return TYPE;
}

public void setTYPE(String tYPE) {
	TYPE = tYPE;
}

public String getDEFAULT_REQUEST() {
	return DEFAULT_REQUEST;
}

public void setDEFAULT_REQUEST(String dEFAULT_REQUEST) {
	DEFAULT_REQUEST = dEFAULT_REQUEST;
}

public DASHBOARD_MASTER getDASHBOARD_MASTER() {
	return DASHBOARD_MASTER;
}

public void setDASHBOARD_MASTER(DASHBOARD_MASTER dASHBOARD_MASTER) {
	DASHBOARD_MASTER = dASHBOARD_MASTER;
}







}
