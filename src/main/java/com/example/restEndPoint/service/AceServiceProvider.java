package com.example.restEndPoint.service;

import org.json.simple.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concretepage.service.IArticleService;

@Service
public class AceServiceProvider {

	@Autowired
    private IArticleService articleService;
	
	public String getTypography() {
        JSONArray list = articleService.getTypography();
        return list.toString();
    }
	public String getGallery() {
        JSONArray list = articleService.getGallery();
        return list.toString();
    }
	public String getDashboard() {
        JSONArray list = articleService.getDashboard();
        return list.toString();
    }
	public String getButtons() {
        JSONArray list = articleService.getButtons();
        return list.toString();
    }
}
