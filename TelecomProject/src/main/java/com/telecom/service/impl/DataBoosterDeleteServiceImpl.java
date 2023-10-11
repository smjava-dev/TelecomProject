package com.telecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telecom.service.DataBoosterDeleteService;
import com.telecom.service.repository.DataBoosterRepository;

@Service
public class DataBoosterDeleteServiceImpl implements DataBoosterDeleteService {

	@Autowired
	private DataBoosterRepository dataBoosterRepository;

	@Override
	public void deleteDataBoosterById(Integer id) {
		dataBoosterRepository.deleteById(id);
	}

}
