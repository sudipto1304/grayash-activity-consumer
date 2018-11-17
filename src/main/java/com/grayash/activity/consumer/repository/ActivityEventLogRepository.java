package com.grayash.activity.consumer.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grayash.activity.consumer.entity.ActivityEventLogEntity;


@Transactional
@Repository
public interface ActivityEventLogRepository extends JpaRepository<ActivityEventLogEntity, Long>{

}
