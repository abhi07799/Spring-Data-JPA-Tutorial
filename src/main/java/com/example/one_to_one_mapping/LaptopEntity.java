package com.example.one_to_one_mapping;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "laptops")
public class LaptopEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String laptopModel;
	
	@JsonManagedReference
	@OneToOne(mappedBy = "laptop")
	private StudentEntity student;
	
//	@ManyToOne
//    @JoinColumn(name = "student_id", nullable=false) // This column in Laptop table refers to StudentEntity
//    private StudentEntity student;
	
}
