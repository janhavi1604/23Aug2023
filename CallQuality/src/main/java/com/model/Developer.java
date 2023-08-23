package com.model;

public class Developer {
	public String developername; 
	public String platformused; 
	public String serverused;
	public String app_life_cycle_status;
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Developer(String developername, String platformused, String serverused, String app_life_cycle_status) {
		super();
		this.developername = developername;
		this.platformused = platformused;
		this.serverused = serverused;
		this.app_life_cycle_status = app_life_cycle_status;
	}
	@Override
	public String toString() {
		return "Developer [developername=" + developername + ", platformused=" + platformused + ", serverused="
				+ serverused + ", app_life_cycle_status=" + app_life_cycle_status + "]";
	}
	public String getDevelopername() {
		return developername;
	}
	public void setDevelopername(String developername) {
		this.developername = developername;
	}
	public String getPlatformused() {
		return platformused;
	}
	public void setPlatformused(String platformused) {
		this.platformused = platformused;
	}
	public String getServerused() {
		return serverused;
	}
	public void setServerused(String serverused) {
		this.serverused = serverused;
	}
	public String getApp_life_cycle_status() {
		return app_life_cycle_status;
	}
	public void setApp_life_cycle_status(String app_life_cycle_status) {
		this.app_life_cycle_status = app_life_cycle_status;
	}
	

}
