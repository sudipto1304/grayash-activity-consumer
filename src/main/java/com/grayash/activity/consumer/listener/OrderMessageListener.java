package com.grayash.activity.consumer.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.grayash.activity.consumer.model.ActivityData;
import com.grayash.activity.consumer.service.AuditActivityLogService;


@Component
public class OrderMessageListener {
 
	private static final Logger Log = LoggerFactory.getLogger(OrderMessageListener.class);
	
	public static final String QUEUE = "activity-event-queue";
    public static final String EXCHANGE = "activity-event-exchange";
    public static final String QUEUE_DEAD = "dead-activity-event-queue";
 
    @Autowired
    private AuditActivityLogService service;
    
    @RabbitListener(queues = QUEUE)
    public void processOrder(ActivityData data) {
    	if(Log.isDebugEnabled())
    		Log.debug("Order Received: "+data);
    	try {
    		service.logActivityData(data);
		} catch (Exception e) {
			if(Log.isErrorEnabled())
				Log.error("Writing Audit Activity failed", e);
		}
    	
    	
    }
}