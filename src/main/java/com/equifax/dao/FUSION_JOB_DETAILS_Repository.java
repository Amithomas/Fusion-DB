package com.equifax.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.equifax.model.FUSION_JOB_DETAILS;


@Repository
public interface FUSION_JOB_DETAILS_Repository extends JpaRepository<FUSION_JOB_DETAILS,String> {
	public List<FUSION_JOB_DETAILS> findByjobSTATUS(String JOB_STATUS);
}
