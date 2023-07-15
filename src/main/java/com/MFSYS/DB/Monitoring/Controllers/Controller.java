package com.MFSYS.DB.Monitoring.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MFSYS.DB.Monitoring.Services.DbService;


@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
@RequestMapping("/")
@RestController
public class Controller {
	
	private DbService dbService;
	@Autowired
	public Controller(DbService dbService) {
		this.dbService = dbService;
	}
	
	@PostMapping("/save/{type}/{dbName}/{requestBody}")
	public void saveEventData(@RequestBody String requestBody, @PathVariable String type, @PathVariable String dbName) {
//		dbService.save(requestBody, type, dbName);
	}

}
