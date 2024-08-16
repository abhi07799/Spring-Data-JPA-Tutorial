package com.example.one_to_one_mapping;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Table(name = "students")
public class StudentEntity
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String fullName;
	
	@CreationTimestamp
	private LocalDateTime createdOn;
	
	@OneToOne
	@JoinColumn(name = "laptop_id", referencedColumnName = "id")
	private LaptopEntity laptop;
	
//	@OneToMany(mappedBy = "student") // 'student' is the field in Laptop class
//    private List<LaptopEntity> laptops;
		
}
