package com.model;

public class ServicePolicies2 {
	public String policyversion;
	public String policyname;
	public String effectivedate;
	public String effectivelocation;
	public String charges;
	public String policyexception;
	public String claimnotification;
	public String getPolicyversion() {
		return policyversion;
	}
	public void setPolicyversion(String policyversion) {
		this.policyversion = policyversion;
	}
	public String getPolicyname() {
		return policyname;
	}
	public void setPolicyname(String policyname) {
		this.policyname = policyname;
	}
	public String getEffectivedate() {
		return effectivedate;
	}
	public void setEffectivedate(String effectivedate) {
		this.effectivedate = effectivedate;
	}
	public String getEffectivelocation() {
		return effectivelocation;
	}
	public void setEffectivelocation(String effectivelocation) {
		this.effectivelocation = effectivelocation;
	}
	public String getCharges() {
		return charges;
	}
	public void setCharges(String charges) {
		this.charges = charges;
	}
	public String getPolicyexception() {
		return policyexception;
	}
	public void setPolicyexception(String policyexception) {
		this.policyexception = policyexception;
	}
	public String getClaimnotification() {
		return claimnotification;
	}
	public void setClaimnotification(String claimnotification) {
		this.claimnotification = claimnotification;
	}
	@Override
	public String toString() {
		return "ServicePolicies2 [policyversion=" + policyversion + ", policyname=" + policyname + ", effectivedate="
				+ effectivedate + ", effectivelocation=" + effectivelocation + ", charges=" + charges
				+ ", policyexception=" + policyexception + ", claimnotification=" + claimnotification + "]";
	}
	public ServicePolicies2(String policyversion, String policyname, String effectivedate, String effectivelocation,
			String charges, String policyexception, String claimnotification) {
		super();
		this.policyversion = policyversion;
		this.policyname = policyname;
		this.effectivedate = effectivedate;
		this.effectivelocation = effectivelocation;
		this.charges = charges;
		this.policyexception = policyexception;
		this.claimnotification = claimnotification;
	}
	public ServicePolicies2() {
		super();
		// TODO Auto-generated constructor stub
	}


}
