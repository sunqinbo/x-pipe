package com.ctrip.xpipe.redis.console.model;

public class MigrationEventModel implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	
	private MigrationEventTbl event;
	
	public MigrationEventModel(){}
	
	public MigrationEventTbl getEvent() {
		return event;
	}

	public void setEvent(MigrationEventTbl event) {
		this.event = event;
	}

	@Override
	public String toString() {
		return String.format("%s", event);
	}
}
