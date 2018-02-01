package com.mindtree.webhookspringboot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accountDetails")
public class WebhookController {
	
	@RequestMapping(method = RequestMethod.POST, value = "/getAccountNumber")
	public Map getAccountNumber(@RequestBody String jsonObj){
		Map response = new HashMap<String, String>();
		Object obj = null;
		List contextOut = new ArrayList<String>();
		response.put("speech", "123456789");
		response.put("displayText", "Your Account Number is 123456789");
		response.put("data", obj);
		response.put("contextOut", contextOut);
		response.put("source", "source");
		return response;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/getBankDetails")
	public Map getBankDetails(@RequestBody String jsonObj){
		Map response = new HashMap<String, String>();
		Object obj = null;
		List contextOut = new ArrayList<String>();
		response.put("speech", "chennai");
		response.put("displayText", "Your Branch location is Chennai");
		response.put("data", obj);
		response.put("contextOut", contextOut);
		response.put("source", "source");
		return response;
	}
}
