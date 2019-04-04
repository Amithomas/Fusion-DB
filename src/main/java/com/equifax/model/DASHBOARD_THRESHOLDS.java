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
public class DASHBOARD_THRESHOLDS {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;
	
	@Column(name="THRESHOLD_LIMIT")
	private BigDecimal THRESHOLD_LIMIT;
	
	@Column(name="COLOR_CODE")
	private String COLOR_CODE;
	
	@ManyToOne
	@JoinColumn(name = "WIDGET_ID")
	private WIDGET_MASTER WIDGET_MASTER;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getTHRESHOLD_LIMIT() {
		return THRESHOLD_LIMIT;
	}

	public void setTHRESHOLD_LIMIT(BigDecimal tHRESHOLD_LIMIT) {
		THRESHOLD_LIMIT = tHRESHOLD_LIMIT;
	}


	public String getCOLOR_CODE() {
		return COLOR_CODE;
	}

	public void setCOLOR_CODE(String cOLOR_CODE) {
		COLOR_CODE = cOLOR_CODE;
	}

	public WIDGET_MASTER getWIDGET_MASTER() {
		return WIDGET_MASTER;
	}

	public void setWIDGET_MASTER(WIDGET_MASTER wIDGET_MASTER) {
		WIDGET_MASTER = wIDGET_MASTER;
	}

}
