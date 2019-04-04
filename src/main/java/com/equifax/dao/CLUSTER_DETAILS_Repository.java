package com.equifax.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equifax.model.CLUSTER_DETAILS;



@Repository
public interface CLUSTER_DETAILS_Repository extends JpaRepository<CLUSTER_DETAILS,String> {

}
