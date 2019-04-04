package com.equifax.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CLUSTER_DETAILS {
	 @Id
	 @Column(name = "CLUSTER_ID")
	 private String CLUSTER_ID;
	 
	 @Column(name = "CLUSTER_NAME")
	 private String CLUSTER_NAME;
	 
	 @Column(name = "ALIAS_NAME")
	 private String ALIAS_NAME;
	 
	 @OneToMany(mappedBy = "CLUSTER_DETAILS", targetEntity=FUSION_JOB_SNAP_SHOT.class,cascade = CascadeType.ALL)
	    private Set FUSION_JOB_SNAP_SHOT;
	 
	 @OneToMany(mappedBy = "CLUSTER_DETAILS", targetEntity=FUSION_JOB_DETAILS.class,cascade = CascadeType.ALL)
	    private Set FUSION_JOB_DETAILS;
	 
	 @OneToMany(mappedBy = "CLUSTER_DETAILS", targetEntity=GP_USAGE.class,cascade = CascadeType.ALL)
	    private Set GP_USAGE;
	 
	 @OneToMany(mappedBy = "CLUSTER_DETAILS", targetEntity=HOST_DETAILS.class,cascade = CascadeType.ALL)
	    private Set HOST_DETAILS;
	 
	 @OneToMany(mappedBy = "CLUSTER_DETAILS", targetEntity=NAS_USAGE.class,cascade = CascadeType.ALL)
	    private Set NAS_USAGE;
	 
	 @OneToMany(mappedBy = "CLUSTER_DETAILS", targetEntity=GP_SERVER_STAT.class,cascade = CascadeType.ALL)
	 private Set GP_SERVER_STAT;
	 
	 
	 public CLUSTER_DETAILS() { }
	 
	 public CLUSTER_DETAILS(String CLUSTER_ID,String CLUSTER_NAME,String ALIAS_NAME) {
		 this.CLUSTER_ID=CLUSTER_ID;
		 this.CLUSTER_NAME= CLUSTER_NAME;
		 this.ALIAS_NAME= ALIAS_NAME;
	 }
	 

	public String getCLUSTER_ID() {
		return CLUSTER_ID;
	}

	public void setCLUSTER_ID(String cLUSTER_ID) {
		CLUSTER_ID = cLUSTER_ID;
	}

	public String getCLUSTER_NAME() {
		return CLUSTER_NAME;
	}

	public void setCLUSTER_NAME(String cLUSTER_NAME) {
		CLUSTER_NAME = cLUSTER_NAME;
	}

	public String getALIAS_NAME() {
		return ALIAS_NAME;
	}

	public void setALIAS_NAME(String aLIAS_NAME) {
		ALIAS_NAME = aLIAS_NAME;
	}

	/*public Set getFUSION_JOB_SNAP_SHOT() {
		return FUSION_JOB_SNAP_SHOT;
	}

	public void setFUSION_JOB_SNAP_SHOT(Set fUSION_JOB_SNAP_SHOT) {
		FUSION_JOB_SNAP_SHOT = fUSION_JOB_SNAP_SHOT;
	}
	 
	 */
}
