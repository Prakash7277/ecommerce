package com.ecom.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Website {

	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private int id;
	
	@Column(unique = true, nullable = false)
	@NotNull
	@Size(min=5, max = 15 , message = " website name must between 5-15 characters")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
}
