package com.example.demo.entitty;

import java.security.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "booking_details")
public class OnlineLicense {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sr_no;
	@Column(nullable = false) 
	private String license_key;
	private String cust_email_fk;
	private String distributor_email_fk;
	private String user_name;
	private String user_email_id;
	private String mobile_no;
	private String user_address;
	@Column(columnDefinition = "Timestamp default CURRENT_TIMESTAMP")
	private Timestamp create_date;
	@Column(columnDefinition = "Timestamp default CURRENT_TIMESTAMP")
	private Timestamp update_date;
	

}
