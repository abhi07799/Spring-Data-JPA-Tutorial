package com.example.query_methods;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer>
{
	List<UserEntity> findByFirstName(String name);
	
	List<UserEntity> findByFirstNameOrLastName(String fname, String lname);
	
	List<UserEntity> findByFirstNameAndLastName(String fname, String lname);
	
	List<UserEntity> findByAgeGreaterThanEqual(int num);
	
	List<UserEntity> findByAgeLessThanEqual(int num);
	
	List<UserEntity> findByFirstNameContaining(String name);
	
	List<UserEntity> findByFirstNameLike(String name);
	
	List<UserEntity> findByAgeBetween(int a, int b);
	
	List<UserEntity> findByFirstNameStartingWith(String name);
	
	List<UserEntity> findByFirstNameEndingWith(String name);
	
	List<UserEntity> findByIsActiveTrue();
	
	List<UserEntity> findByIsActiveFalse();
	
	boolean existsById(int num);
}
