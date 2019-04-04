package com.equifax.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class DASHBOARD_MASTER {
@Id
@Column(name="APP_ID")
private String APP_ID;

@Column(name="APP_NAME")
private String APP_NAME;

@Column(name="DESCRIPTION")
private String DESCRIPTION;

@OneToMany(mappedBy = "DASHBOARD_MASTER", targetEntity=WIDGET_MASTER.class,cascade = CascadeType.ALL)
private Set WIDGET_MASTER;

public String getAPP_ID() {
	return APP_ID;
}

public void setAPP_ID(String aPP_ID) {
	APP_ID = aPP_ID;
}

public String getAPP_NAME() {
	return APP_NAME;
}

public void setAPP_NAME(String aPP_NAME) {
	APP_NAME = aPP_NAME;
}

public String getDESCRIPTION() {
	return DESCRIPTION;
}

public void setDESCRIPTION(String dESCRIPTION) {
	DESCRIPTION = dESCRIPTION;
}




}
