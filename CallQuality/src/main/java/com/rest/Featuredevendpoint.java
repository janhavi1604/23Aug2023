package com.rest;



	import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
	import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
	import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
	import org.springframework.boot.actuate.endpoint.annotation.Selector;
	import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
	import org.springframework.boot.actuate.endpoint.web.WebEndpointResponse;
	import org.springframework.http.HttpStatus;
	import org.springframework.stereotype.Component;

import com.model.Developer;

import java.util.*;
	import java.util.concurrent.*;
	@Component
	@Endpoint(id = "features")
	public class Featuredevendpoint {

	    private Map<String, Developer> feature = new ConcurrentHashMap<>();

	    @ReadOperation
	    public Map<String, Developer> features() {
	    	feature.put("feature1", new Developer("peter","codeblocks","myserver","200"));
	    	
	        return feature;
	    }

	    @ReadOperation
	    public Developer feature(@Selector String name) {
	        return feature.get(name);
	    }

	    @WriteOperation
	    public WebEndpointResponse<Developer> configureFeature(String developername,String platformused,String serverused,String app_life_cycle_status) {
	      Developer feature=new Developer(developername,platformused,serverused,app_life_cycle_status);
	    	((Map<String, Developer>) feature).put(developername,feature);
	    	return new WebEndpointResponse(feature);
	    }

	    @DeleteOperation
	    public void deleteFeature(@Selector String name) {
	        feature.remove(name);
	    }

	    
			
			
			

	    }

