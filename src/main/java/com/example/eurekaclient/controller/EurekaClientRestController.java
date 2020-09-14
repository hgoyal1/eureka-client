package com.example.eurekaclient.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;

@RestController
@Slf4j
public class EurekaClientRestController {

	@PostMapping("/create")
	public ResponseEntity<String> createRecord(@RequestBody JsonNode requestBody) {
		Assert.notNull(requestBody, "Request Body should not be empty!!");
		log.info(requestBody.toString());
		return new ResponseEntity<>("Record created successfully", HttpStatus.CREATED);
	}
	
	@GetMapping("/read")
	public ResponseEntity<String> getRecord() {

		String body = "{\"name\": \"Harsh\"}";
		return new ResponseEntity<>(body, HttpStatus.OK);
	}
}