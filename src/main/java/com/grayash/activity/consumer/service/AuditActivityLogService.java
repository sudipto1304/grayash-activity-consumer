package com.grayash.activity.consumer.service;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grayash.activity.consumer.entity.ActivityEventLogEntity;
import com.grayash.activity.consumer.model.ActivityData;
import com.grayash.activity.consumer.repository.ActivityEventLogRepository;

@Service
public class AuditActivityLogService {
	
	private static final Logger Log = LoggerFactory.getLogger(AuditActivityLogService.class);
	
	@Autowired
	private ActivityEventLogRepository repository;
	
	public void logActivityData(ActivityData data) {
		ModelMapper modelMapper = new ModelMapper();
		ActivityEventLogEntity entity = modelMapper.map(data, ActivityEventLogEntity.class);
		ActivityEventLogEntity responseEntity = repository.save(entity);
		if(Log.isInfoEnabled())
			Log.info("Activity Audit Id is--->"+responseEntity.getAuditId());
		
	}

}
