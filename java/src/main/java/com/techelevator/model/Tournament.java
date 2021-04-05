package com.techelevator.model;

public class Tournament {
	
	private int id;
	private String name;
	private int organizerId;
	private int maxParticipants;
	private boolean isTeam;
	private boolean isDouble;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOrganizerId() {
		return organizerId;
	}
	public void setOrganizerId(int organizerId) {
		this.organizerId = organizerId;
	}
	public int getMaxParticipants() {
		return maxParticipants;
	}
	public void setMaxParticipants(int maxParticipants) {
		this.maxParticipants = maxParticipants;
	}
	public boolean isTeam() {
		return isTeam;
	}
	public void setTeam(boolean isTeam) {
		this.isTeam = isTeam;
	}
	public boolean isDouble() {
		return isDouble;
	}
	public void setDouble(boolean isDouble) {
		this.isDouble = isDouble;
	}

}