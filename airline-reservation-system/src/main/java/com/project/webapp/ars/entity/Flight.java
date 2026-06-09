package com.project.webapp.ars.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

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
@Table(name="flight_information")
@DynamicInsert
@DynamicUpdate
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="flight_id")
	private long flightId;
	
	@Column(name="flight_number")
	private String flightNumber;
	
	@Column(name="airline_name")
	private String airlineName;
	
	@Column(name="source")
	private String source;
	
	@Column(name="destination")
	private String destination;
	
	@Column(name="departure_time")
	private LocalDateTime departureTime;
	
	@Column(name="arrival_time")
	private LocalDateTime arrivalTime;
	
	@Column(name="total_seats")
	private int totalSeats;
}
