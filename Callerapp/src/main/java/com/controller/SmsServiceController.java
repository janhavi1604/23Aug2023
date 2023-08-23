package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.SmsService1;
import com.model.SmsService2;

@RestController
public class SmsServiceController {
	
	ArrayList<SmsService1> arrayListService1=new ArrayList();
	ArrayList<SmsService2> arrayListService2=new ArrayList();
	
	public SmsServiceController()
	{
		arrayListService1.add(new SmsService1("986235412","987456231","Hello from user"));
		arrayListService1.add(new SmsService1("986235412","987456231","Hello from user"));
		arrayListService1.add(new SmsService1("986235412","987456231","Hello from user"));
		arrayListService1.add(new SmsService1("986235412","987456231","Hello from user"));
	
	
          arrayListService2.add(new SmsService2("9856234125","963145666","Say hiii"));	
	}
	
	
	
	@GetMapping(value="/service/param",params="version=1")
	public List<SmsService1> getSmsServiceDetails1()
	{
		return arrayListService1;
	}
	
	@GetMapping(value="/service/param",params="version=2")
	public List<SmsService2> getSmsServiceDetails2()
	{
		return arrayListService2;
	}

}
