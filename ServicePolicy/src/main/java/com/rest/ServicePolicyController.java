package com.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.model.ServicePolicies1;
import com.model.ServicePolicies2;


@RestController
public class ServicePolicyController {
	
	
	ArrayList<ServicePolicies1> arrayListP1=new ArrayList();
	ArrayList<ServicePolicies2> arrayListP2=new ArrayList();
	
	public ServicePolicyController()
	{
	arrayListP1.add(new ServicePolicies1("1","mypol","25","Delhi","500"));
	arrayListP2.add(new ServicePolicies2("2","mypol2","35","Mumbai","600","no","claim"));
	
	}
	
	/*
	@GetMapping(value="/servicepolicy",headers="X-API-VERSION=1")
	public List<ServicePolicies1> getServicePoliciesDetails()
	{
		return arrayListP1;
	}
	
	@GetMapping(value="/servicepolicy",headers="X-API-VERSION=2")
	public List<ServicePolicies2> getServicePoliciesDetails2()
	{
		return arrayListP2;
	}

*/
	
	@GetMapping(value="/servicepolicy/v1")
	public List<ServicePolicies1> getServicePoliciesDetails()
	{
		return arrayListP1;
	}
	
	@GetMapping(value="/servicepolicy/v2")
	public List<ServicePolicies2> getServicePoliciesDetails2()
	{
		return arrayListP2;
	}
	
	
	
}
