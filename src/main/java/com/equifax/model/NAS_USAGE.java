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
public class NAS_USAGE {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int id;
	
	@Column(name="FOLDER")
	private String FOLDER;
	
	@Column(name="ALLOCATED_SPACE")
	private BigDecimal ALLOCATED_SPACE;
	
	@Column(name="USED_SPACE")
	private BigDecimal USED_SPACE;
	
	@ManyToOne
	@JoinColumn(name = "CLUSTER_ID")
	private CLUSTER_DETAILS CLUSTER_DETAILS;
	
	@ManyToOne
	@JoinColumn(name = "HOST_ID")
	private HOST_DETAILS HOST_DETAILS;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFOLDER() {
		return FOLDER;
	}

	public void setFOLDER(String fOLDER) {
		FOLDER = fOLDER;
	}

	public BigDecimal getALLOCATED_SPACE() {
		return ALLOCATED_SPACE;
	}

	public void setALLOCATED_SPACE(BigDecimal aLLOCATED_SPACE) {
		ALLOCATED_SPACE = aLLOCATED_SPACE;
	}

	public BigDecimal getUSED_SPACE() {
		return USED_SPACE;
	}

	public void setUSED_SPACE(BigDecimal uSED_SPACE) {
		USED_SPACE = uSED_SPACE;
	}

	public CLUSTER_DETAILS getCLUSTER_DETAILS() {
		return CLUSTER_DETAILS;
	}

	public void setCLUSTER_DETAILS(CLUSTER_DETAILS cLUSTER_DETAILS) {
		CLUSTER_DETAILS = cLUSTER_DETAILS;
	}

	public HOST_DETAILS getHOST_DETAILS() {
		return HOST_DETAILS;
	}

	public void setHOST_DETAILS(HOST_DETAILS hOST_DETAILS) {
		HOST_DETAILS = hOST_DETAILS;
	}
	
	
	
	
}
