package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dto.BastionDto;
import com.example.demo.repository.OnlineActivationRepository;
import com.example.demo.repository.OnlineLicenseRepository;

@Service
public class BastionService {
	
	@Autowired
	private OnlineActivationRepository onlineActivationRepository;
	
	private OnlineLicenseRepository onlineLicenseRepository;

	public List<BastionDto> getAll() {
		
		return onlineActivationRepository.fetchBastionDtoLeftJoin();
	}
	
	
	public void deleteEntry(String license_key)
	{
		onlineLicenseRepository.delete(onlineActivationRepository);
		return ;
	}

}
