package com.equifax.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equifax.model.REPORT_MASTER;


@Repository
public interface REPORT_MASTER_Repository extends JpaRepository<REPORT_MASTER,String> {

}
