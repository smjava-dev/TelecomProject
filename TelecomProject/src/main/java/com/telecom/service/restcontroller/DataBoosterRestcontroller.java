package com.telecom.service.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.telecom.service.DataBoosterDeleteService;

@RestController
public class DataBoosterRestcontroller {
	@Autowired
	private DataBoosterDeleteService dataBoosterDeleteService;
	@DeleteMapping("/delete/{id}")
	public void deleteDataBoosterById(@PathVariable("id") Integer id) {
		dataBoosterDeleteService.deleteDataBoosterById(id);
	}
}
