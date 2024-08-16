package com.example.query_methods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController
{
	@Autowired
	private UserRepo repo;
	
	@GetMapping("/")
	public String test()
	{
		return "JAI SHREE RAM";
	}
	
	@PostMapping("addUser")
	public List<UserEntity> addUser(@RequestBody List<UserEntity> user)
	{
		return repo.saveAll(user);
	}
	
	@GetMapping("getall")
	public List<UserEntity> getAll()
	{
		return repo.findAll();
	}
	
	@GetMapping("getByFName/{name}")
	public List<UserEntity> getByFName(@PathVariable String name)
	{
		return repo.findByFirstName(name);
	}
	
	@GetMapping("getforl")
	public List<UserEntity> getByfnameorlname(@RequestParam String fname, @RequestParam String lname)
	{
		return repo.findByFirstNameOrLastName(fname,lname);
	}
	
	@GetMapping("getfandl")
	public List<UserEntity> getfandl(@RequestParam String fname, @RequestParam String lname)
	{
		return repo.findByFirstNameAndLastName(fname,lname);
	}
	
	@GetMapping("agegreater/{age}")
	public List<UserEntity> getgreat(@PathVariable int age)
	{
		return repo.findByAgeGreaterThanEqual(age);
	}
	
	@GetMapping("ageless/{age}")
	public List<UserEntity> getless(@PathVariable int age)
	{
		return repo.findByAgeLessThanEqual(age);
	}
	
	@GetMapping("namecontain/{name}")
	public List<UserEntity> getnameContains(@PathVariable String name)
	{
		return repo.findByFirstNameContaining(name);
	}
	
	@GetMapping("namestart/{name}")
	public List<UserEntity> getnameStarts(@PathVariable String name)
	{
		return repo.findByFirstNameStartingWith(name);
	}
	
	@GetMapping("nameend/{name}")
	public List<UserEntity> getnameendss(@PathVariable String name)
	{
		return repo.findByFirstNameEndingWith(name);
	}
	
	@GetMapping("agebetween")
	public List<UserEntity> getage(@RequestParam int min, @RequestParam int max)
	{
		return repo.findByAgeBetween(min,max);
	}
	
	@GetMapping("true")
	public List<UserEntity> gettrue()
	{
		return repo.findByIsActiveTrue();
	}
	
	@GetMapping("false")
	public List<UserEntity> getfalse()
	{
		return repo.findByIsActiveFalse();
	}
	
	
	@GetMapping("exist/{num}")
	public boolean getexist(@PathVariable int num)
	{
		return repo.existsById(num);
	}
	
//	@GetMapping("")
//	public List<UserEntity> get()
//	{
//		return repo.find();
//	}
	
}
