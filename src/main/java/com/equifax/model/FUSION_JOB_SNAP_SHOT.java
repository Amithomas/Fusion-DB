package com.equifax.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class FUSION_JOB_SNAP_SHOT {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column
	 private int id;
	 
	 @Column(name = "JOB_STATUS")
	 private String JOB_STATUS;
	 
	 @Column(name = "JOB_COUNT")
	 private BigDecimal JOB_COUNT;
	 
	 @ManyToOne
	 @JoinColumn(name = "CLUSTER_ID")
	 private CLUSTER_DETAILS CLUSTER_DETAILS;

	public FUSION_JOB_SNAP_SHOT() { }
	
	public FUSION_JOB_SNAP_SHOT(String JOB_STATUS, BigDecimal JOB_COUNT )
	{
		this.JOB_STATUS= JOB_STATUS;
		this.JOB_COUNT= JOB_COUNT;
	}

	public String getJOB_STATUS() {
		return JOB_STATUS;
	}

	public void setJOB_STATUS(String jOB_STATUS) {
		JOB_STATUS = jOB_STATUS;
	}

	public BigDecimal getJOB_COUNT() {
		return JOB_COUNT;
	}

	public void setJOB_COUNT(BigDecimal jOB_COUNT) {
		JOB_COUNT = jOB_COUNT;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CLUSTER_DETAILS getCLUSTER_DETAILS() {
		return CLUSTER_DETAILS;
	}

	public void setCLUSTER_DETAILS(CLUSTER_DETAILS cLUSTER_DETAILS) {
		CLUSTER_DETAILS = cLUSTER_DETAILS;
	}
	 
	 
	 
}
