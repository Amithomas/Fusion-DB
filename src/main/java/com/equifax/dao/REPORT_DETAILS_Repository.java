package com.equifax.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.equifax.model.REPORT_DETAILS;
@Repository
public interface REPORT_DETAILS_Repository extends JpaRepository<REPORT_DETAILS,Integer>{
	
	@Query("FROM REPORT_DETAILS RD  WHERE to_date(RD.X_VALUE,'DD/MM/YYYY') >= to_date(:#{#from},'DD/MM/YYYY') AND to_date(RD.X_VALUE,'DD/MM/YYYY') <= to_date(:#{#to},'DD/MM/YYYY')")
	List<REPORT_DETAILS> findDetails(@Param("from") String from, @Param("to") String to);

}
