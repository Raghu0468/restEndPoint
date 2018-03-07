package com.example.restEndPoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restEndPoint.service.AceServiceProvider;

@RestController
@RequestMapping("user")
public class AceRestEndPointController {

	@Autowired
    private AceServiceProvider aceServiceProvider;
	
	@GetMapping(value = "dashboard", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getDashboard() {
        return aceServiceProvider.getDashboard();
    }
    @GetMapping(value = "buttons", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getButtons() {
        return aceServiceProvider.getButtons();
    }
    @GetMapping(value = "typography", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getTypography() {
    	return aceServiceProvider.getTypography();
    }
    @GetMapping(value = "gallery", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String getGallery() {
    	return aceServiceProvider.getGallery();
    }
	
}
