package com.equifax.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class REPORT_DETAILS {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;
	
	@Column(name="X_VALUE")
	private String X_VALUE;
	
	@Column(name="Y_VALUE")
	private String Y_VALUE;
	
	@ManyToOne
	@JoinColumn(name = "REPORT_ID")
	private REPORT_MASTER REPORT_MASTER;

	

	public String getX_VALUE() {
		return X_VALUE;
	}

	public void setX_VALUE(String x_VALUE) {
		X_VALUE = x_VALUE;
	}

	public String getY_VALUE() {
		return Y_VALUE;
	}

	public void setY_VALUE(String y_VALUE) {
		Y_VALUE = y_VALUE;
	}

	public REPORT_MASTER getREPORT_MASTER() {
		return REPORT_MASTER;
	}

	public void setREPORT_MASTER(REPORT_MASTER rEPORT_MASTER) {
		REPORT_MASTER = rEPORT_MASTER;
	}
	
	
	
}
