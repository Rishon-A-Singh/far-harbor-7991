package com.trippy.models;



import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Service
@ToString
public class Driver{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer driverId;
	
	
	@NotNull(message = "License Number cannot be null!")
	@NotBlank(message = "License Number be blank!")
	private String licenseNo;
	
	@NotNull(message = "Rating Should be between 1-5....!")
	private Float rating;
	
	@NotNull(message = "Name cannot be null!")
	@NotBlank(message = "Name connot be blank!")
	private String userName;
	
	@NotNull(message="Password cannot be null!")
	@NotBlank(message= "Password cannot be blank!")
	@Pattern(regexp = "[A-Za-z0-9!@#$%^&*]{8,15}", message = "Password must be 8-15 characters in length and can include alphanumerics and special characters")
	private String password;
	
	private String address;
	
	@NotNull(message="Mobile number cannot be null!")
	@Pattern(regexp = "[6789]{1}[0-9]{9}", message = "Enter valid 10 digit mobile number")
	@Size(min = 10, max = 10)
	private String mobile;
	
	@Email
	private String email;

	
	@OneToOne(cascade = CascadeType.ALL)
	@ElementCollection(fetch = FetchType.EAGER)
	private Cab cab;

}


