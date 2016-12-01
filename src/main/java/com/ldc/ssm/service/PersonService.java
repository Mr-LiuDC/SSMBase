package com.ldc.ssm.service;

import java.util.List;

import com.ldc.ssm.entity.Person;
import com.ldc.ssm.entity.QueryCondition;

public interface PersonService {
	
	public void savePerson(Person person);

	public Person selectPersonById(Integer personId);

	public void update(Person person);

	public void delete(Integer personId);

	public List<Person> selectPersonByCondition(QueryCondition qc);

}
