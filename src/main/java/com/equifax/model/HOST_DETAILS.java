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
public class HOST_DETAILS {
@Id
@Column(name="HOST_ID")
private String HOST_ID;

@Column(name="HOST_NAME")
private String HOST_NAME;

@Column(name="IP")
private String IP;

@Column(name="RAM_USAGE")
private BigDecimal RAM_USAGE;

@Column(name="CPU_USAGE")
private BigDecimal CPU_USAGE;

@Column(name="DISK_USAGE")
private BigDecimal DISK_USAGE;

@Column(name="ERROR_WARNING")
private String ERROR_WARNING;

@Column(name="DOWN_TIME")
private String DOWN_TIME;

@Column(name="TYPE")
private String TYPE;

@OneToMany(mappedBy = "HOST_DETAILS", targetEntity=NAS_USAGE.class,cascade = CascadeType.ALL)
private Set NAS_USAGE;

@OneToMany(mappedBy = "HOST_DETAILS", targetEntity=HOST_APPLICATION_MAPPING.class,cascade = CascadeType.ALL)
private Set HOST_APPLICATION_MAPPING;

@OneToMany(mappedBy = "HOST_DETAILS", targetEntity=GP_SERVER_STAT.class,cascade = CascadeType.ALL)
private Set GP_SERVER_STAT;


@ManyToOne
@JoinColumn(name = "CLUSTER_ID")
private CLUSTER_DETAILS CLUSTER_DETAILS;

public String getHOST_ID() {
	return HOST_ID;
}

public void setHOST_ID(String hOST_ID) {
	HOST_ID = hOST_ID;
}

public String getHOST_NAME() {
	return HOST_NAME;
}

public void setHOST_NAME(String hOST_NAME) {
	HOST_NAME = hOST_NAME;
}

public String getIP() {
	return IP;
}

public void setIP(String iP) {
	IP = iP;
}

public BigDecimal getRAM_USAGE() {
	return RAM_USAGE;
}

public void setRAM_USAGE(BigDecimal rAM_USAGE) {
	RAM_USAGE = rAM_USAGE;
}

public BigDecimal getCPU_USAGE() {
	return CPU_USAGE;
}

public void setCPU_USAGE(BigDecimal cPU_USAGE) {
	CPU_USAGE = cPU_USAGE;
}

public BigDecimal getDISK_USAGE() {
	return DISK_USAGE;
}

public void setDISK_USAGE(BigDecimal dISK_USAGE) {
	DISK_USAGE = dISK_USAGE;
}

public String getERROR_WARNING() {
	return ERROR_WARNING;
}

public void setERROR_WARNING(String eRROR_WARNING) {
	ERROR_WARNING = eRROR_WARNING;
}

public String getDOWN_TIME() {
	return DOWN_TIME;
}

public void setDOWN_TIME(String dOWN_TIME) {
	DOWN_TIME = dOWN_TIME;
}

public String getTYPE() {
	return TYPE;
}

public void setTYPE(String tYPE) {
	TYPE = tYPE;
}

public CLUSTER_DETAILS getCLUSTER_DETAILS() {
	return CLUSTER_DETAILS;
}

public void setCLUSTER_DETAILS(CLUSTER_DETAILS cLUSTER_DETAILS) {
	CLUSTER_DETAILS = cLUSTER_DETAILS;
}


}
