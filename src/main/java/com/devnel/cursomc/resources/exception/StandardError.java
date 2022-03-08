package com.devnel.cursomc.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer status;
	private String smg;
	private Long timeStamp;

	public StandardError(Integer status, String smg, Long timeStamp) {
		super();
		this.status = status;
		this.smg = smg;
		this.timeStamp = timeStamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getSmg() {
		return smg;
	}

	public void setSmg(String smg) {
		this.smg = smg;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}
}
