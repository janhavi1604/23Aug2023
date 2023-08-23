package com.model;

public class SmsService1 {
	
	private String sender;
	private String receiver;
	private String message;
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getMessgae() {
		return messgae;
	}
	public void setMessgae(String messgae) {
		this.messgae = messgae;
	}
	private String messgae;
	@Override
	public String toString() {
		return "SmsService1 [sender=" + sender + ", receiver=" + receiver + ", messgae=" + messgae + "]";
	}
	public SmsService1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SmsService1(String sender, String receiver, String messgae) {
		super();
		this.sender = sender;
		this.receiver = receiver;
		this.messgae = messgae;
	}
	

}
