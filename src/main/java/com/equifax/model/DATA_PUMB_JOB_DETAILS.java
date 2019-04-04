package com.equifax.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DATA_PUMB_JOB_DETAILS {
	
	@Column(name = "PROJECT_JOB")
	private String PROJECT_JOB;
	
	@Id
	@Column(name = "QUEUE")
	private String QUEUE;
	
	@Column(name="TOTAL")
	private int TOTAL;
	
	@Column(name="HOLD")
	private int HOLD;
	
	@Column(name="INQUEUE")
	private int INQUEUE;
	
	@Column(name="WAIT")
	private int WAIT;
	
	@Column(name="SUCCESS")
	private int SUCCESS;
	
	@Column(name="FAILED")
	private int FAILED;
	
	@Column(name="CANCELLED")
	private int CANCELLED;
	
	@Column(name="RUNNING")
	private int RUNNING;
	
	@Column(name="JOB_DATE")
	private Timestamp JOB_DATE;

	public String getPROJECT_JOB() {
		return PROJECT_JOB;
	}

	public void setPROJECT_JOB(String pROJECT_JOB) {
		PROJECT_JOB = pROJECT_JOB;
	}

	public String getQUEUE() {
		return QUEUE;
	}

	public void setQUEUE(String qUEUE) {
		QUEUE = qUEUE;
	}

	public int getTOTAL() {
		return TOTAL;
	}

	public void setTOTAL(int tOTAL) {
		TOTAL = tOTAL;
	}

	public int getHOLD() {
		return HOLD;
	}

	public void setHOLD(int hOLD) {
		HOLD = hOLD;
	}

	public int getINQUEUE() {
		return INQUEUE;
	}

	public void setINQUEUE(int iNQUEUE) {
		INQUEUE = iNQUEUE;
	}

	public int getWAIT() {
		return WAIT;
	}

	public void setWAIT(int wAIT) {
		WAIT = wAIT;
	}

	public int getSUCCESS() {
		return SUCCESS;
	}

	public void setSUCCESS(int sUCCESS) {
		SUCCESS = sUCCESS;
	}

	public int getFAILED() {
		return FAILED;
	}

	public void setFAILED(int fAILED) {
		FAILED = fAILED;
	}

	public int getCANCELLED() {
		return CANCELLED;
	}

	public void setCANCELLED(int cANCELLED) {
		CANCELLED = cANCELLED;
	}

	public int getRUNNING() {
		return RUNNING;
	}

	public void setRUNNING(int rUNNING) {
		RUNNING = rUNNING;
	}

	public Timestamp getJOB_DATE() {
		return JOB_DATE;
	}

	public void setJOB_DATE(Timestamp jOB_DATE) {
		JOB_DATE = jOB_DATE;
	}
	
	
	
}
