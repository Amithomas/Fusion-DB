package com.equifax.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.equifax.model.DATA_PUMB_JOB_DETAILS;



@Repository
public interface DATA_PUMB_JOB_DETAILS_Repository extends JpaRepository<DATA_PUMB_JOB_DETAILS,String> {

}
