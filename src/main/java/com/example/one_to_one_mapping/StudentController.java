package com.example.one_to_one_mapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController
{
	@Autowired
	private StudentRepo repo;
	
	@Autowired
	private LaptopRepo lrepo;
	
	@PostMapping("addStu")
	public StudentEntity add(@RequestBody StudentEntity stu)
	{
		return repo.save(stu);
	}
	
	@GetMapping("getallstu")
	public List<StudentEntity> allStud()
	{
		return repo.findAll();
	}
	
	@GetMapping("getlaps")
	public List<LaptopEntity> alllap()
	{
		return lrepo.findAll();
	}
}
