package com.model;

public class ServicePolicies1 {
	public String policyversion;
	public String policyname;
	public String effectivedate;
	public String effectivelocation;
	public String charges;
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
	public ServicePolicies1(String policyversion, String policyname, String effectivedate, String effectivelocation,
			String charges) {
		super();
		this.policyversion = policyversion;
		this.policyname = policyname;
		this.effectivedate = effectivedate;
		this.effectivelocation = effectivelocation;
		this.charges = charges;
	}
	public ServicePolicies1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ServicePolicies1 [policyversion=" + policyversion + ", policyname=" + policyname + ", effectivedate="
				+ effectivedate + ", effectivelocation=" + effectivelocation + ", charges=" + charges + "]";
	}
	
	
	
	
	

}
