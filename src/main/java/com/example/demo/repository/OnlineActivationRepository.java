package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Dto.BastionDto;

@Repository
public interface OnlineActivationRepository extends JpaRepository<OnlineLicenseRepository, Integer> {

	@Query(value = "SELECT u.Inv_id_fk,u.system_count,u.status,u.os,u.create_date,u.expiry_date, a.user_name,a.user_email_id,a.user_address,a.mobile_no" +
            "FROM OnlineActivation u " +
            "LEFT JOIN OnlineLicense a ON u.license_key = a.license_key",
    nativeQuery = true)
	List<BastionDto> fetchBastionDtoLeftJoin();


	
}
