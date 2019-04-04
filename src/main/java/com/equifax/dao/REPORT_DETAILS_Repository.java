package com.equifax.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equifax.model.REPORT_DETAILS;
@Repository
public interface REPORT_DETAILS_Repository extends JpaRepository<REPORT_DETAILS,Integer>{

}
