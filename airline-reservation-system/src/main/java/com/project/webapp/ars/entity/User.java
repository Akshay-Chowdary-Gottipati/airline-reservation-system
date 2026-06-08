package com.project.webapp.ars.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="user_information")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id",nullable = false)
	private long userId;
	
	@Id
	@Column(name="full_name",nullable = false)
	private String fullName;
	
	@Id
	@Column(name="email_address",nullable = false)
	private String emailAddress;
	
	@Id
	@Column(name="password",nullable = false)
	private String password;
	
	@Id
	@Column(name="role",nullable = false)
	private String role;
}
