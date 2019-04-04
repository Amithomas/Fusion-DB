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
public class GP_USAGE {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;
	
	@Column(name="USAGE")
	private BigDecimal USAGE;
	
	@ManyToOne
	@JoinColumn(name = "CLUSTER_ID")
	private CLUSTER_DETAILS CLUSTER_DETAILS;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getUSAGE() {
		return USAGE;
	}

	public void setUSAGE(BigDecimal uSAGE) {
		USAGE = uSAGE;
	}

	public CLUSTER_DETAILS getCLUSTER_DETAILS() {
		return CLUSTER_DETAILS;
	}

	public void setCLUSTER_DETAILS(CLUSTER_DETAILS cLUSTER_DETAILS) {
		CLUSTER_DETAILS = cLUSTER_DETAILS;
	}
	
	
}
