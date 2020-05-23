/**
 * 
 */
package com.sample.sampleapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Shamik
 *
 */
@Controller
public class AppController {
	
	@GetMapping("/response")
	public ResponseEntity<String> getResponse() {
		return new ResponseEntity<>("{}" ,HttpStatus.OK) ;
	}

}
