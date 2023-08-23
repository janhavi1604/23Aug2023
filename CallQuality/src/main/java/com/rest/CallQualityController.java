package com.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.CallQualityDetails2;
import com.model.CallQualityDetailsV1;




@RestController
public class CallQualityController {
	
	ArrayList<CallQualityDetailsV1> arrayList1=new ArrayList();
	ArrayList<CallQualityDetails2> arrayList2=new ArrayList();
	
	public CallQualityController()
	{
		arrayList1.add(new CallQualityDetailsV1("incoming","50","100","30 min"));;
		arrayList2.add(new CallQualityDetails2("outgoing","60","120","30min","Mumbai","Delhi"));
		
	}
	
	/* using param
	@GetMapping(value="/callservice/param",params="version=1")
	public List<CallQualityDetailsV1> getCallQualityDetails()
	{
		return arrayList1;
	}
	
	@GetMapping(value="/callservice/param",params="version=2")
	public List<CallQualityDetails2> getCallQualityDetails2()
	{
		return arrayList2;
	}
	*/
	
	/* using uri
	@GetMapping(value="/callservice/v1")
	public List<CallQualityDetailsV1> getCallQualityDetails()
	{
		return arrayList1;
	}
	
	@GetMapping(value="/callservice/V2")
	public List<CallQualityDetails2> getCallQualityDetails2()
	{
		return arrayList2;
	}
	*/
	
	/*using headers
	@GetMapping(value="/callservice",headers="X-API-VERSION=1")
	public List<CallQualityDetailsV1> getCallQualityDetails()
	{
		return arrayList1;
	}
	
	@GetMapping(value="/callservice",headers="X-API-VERSION=2")
	public List<CallQualityDetails2> getCallQualityDetails2()
	{
		return arrayList2;
	}
	*/
	
	//using produces
	@GetMapping(value="/callservice",produces="application/call.service.app-v1+json")
	public List<CallQualityDetailsV1> getCallQualityDetails()
	{
		return arrayList1;
	}
	
	@GetMapping(value="/callservice",produces="application/call.service.app-v2+json")
	public List<CallQualityDetails2> getCallQualityDetails2()
	{
		return arrayList2;
	}
	
	
	
	

}
