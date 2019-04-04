package com.equifax.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equifax.model.GP_USAGE;



@Repository
public interface GP_USAGE_Repository extends JpaRepository<GP_USAGE,Integer>{

}
