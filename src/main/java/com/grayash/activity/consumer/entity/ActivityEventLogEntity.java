package com.grayash.activity.consumer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
@Table(name = "EVENT_ACTIVITY_LOG")
public class ActivityEventLogEntity {
	
	@Id
    @Column(name="AUDIT_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long auditId;
    @Column(name="CUSTOMER_ID")
	private String customerId;
    @Column(name="REQUEST_URI")
	private String requestUrl;
    @Column(name="ACTIVITY_TYPE")
	private String activityType;
    @Column(name="ACTIVITY_DATA")
	private String activityData;
    @Column(name="RESPONSE_CODE")
	private String responseCode;
    @Column(name="EXCEPTION")
	private String exception;
    @Column(name="APP_ID")
	private String appId;
    @Column(name="OS")
	private String os;
    @Column(name="OS_VERSION")
	private String osVersion;
    @Column(name="ISP")
	private String isp;
    @Column(name="IP_ADDRESS")
	private String ip;
    @Column(name="SERVICE_NAME")
	private String serviceName;
    @Column(name="SPAN_ID")
	private String spanId;
    @Column(name="TRACE_ID")
	private String traceId;
    @Column(name="TIMESTAMP")
	private String timeStamp;
	

}
