package com.equifax.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.equifax.model.FUSION_JOB_SNAP_SHOT;


@Repository
public interface FUSION_JOB_SNAP_SHOT_Repository extends JpaRepository<FUSION_JOB_SNAP_SHOT,String> {

}
