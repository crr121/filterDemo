package com.zt.entity;

import java.io.Serializable;

public class Login implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer logId;
	private String logName;
	private String logPwd;
	private Integer logState;

	public Login(Integer logId, String logName, String logPwd, Integer logState) {
		super();
		this.logId = logId;
		this.logName = logName;
		this.logPwd = logPwd;
		this.logState = logState;
	}

	public Login() {
		super();
	}

	public Integer getLogId() {
		return logId;
	}

	public void setLogId(Integer logId) {
		this.logId = logId;
	}

	public String getLogName() {
		return logName;
	}

	public void setLogName(String logName) {
		this.logName = logName;
	}

	public String getLogPwd() {
		return logPwd;
	}

	public void setLogPwd(String logPwd) {
		this.logPwd = logPwd;
	}

	public Integer getLogState() {
		return logState;
	}

	public void setLogState(Integer logState) {
		this.logState = logState;
	}

	@Override
	public String toString() {
		return "Login [logId=" + logId + ", logName=" + logName + ", logPwd="
				+ logPwd + ", logState=" + logState + "]";
	}

}
