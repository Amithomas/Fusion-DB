package com.equifax.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.equifax.model.NAS_USAGE;
@Repository
public interface NAS_USAGE_Repository extends JpaRepository<NAS_USAGE,Integer> {

}
