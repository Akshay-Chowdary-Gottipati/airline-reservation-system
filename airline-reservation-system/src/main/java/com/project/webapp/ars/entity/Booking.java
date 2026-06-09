package com.project.webapp.ars.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="booking_information")
@DynamicInsert
@DynamicUpdate
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
	
	@Id
	@Column(name="booking_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookingId;
	
	@ManyToOne
	@JoinColumn(name="user_id",referencedColumnName = "user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="flight_id",referencedColumnName = "flight_id")
	private Flight flight;
	
	@Column(name="booking_date")
	private LocalDateTime bookingDate;
	
	@Column(name="booking_status")
	private String bookingStatus;
	
	@Column(name="total_amount")
	private BigDecimal totalAmount;
}
