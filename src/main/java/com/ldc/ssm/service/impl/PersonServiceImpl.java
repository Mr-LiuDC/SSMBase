package com.ldc.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ldc.ssm.dao.PersonDao;
import com.ldc.ssm.entity.Person;
import com.ldc.ssm.entity.QueryCondition;
import com.ldc.ssm.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	
	/*
	 * @Autowired: 自动装配注入
	 */
	@Autowired
	private PersonDao personDao;

	public void savePerson(Person person) {
		personDao.insert(person);
	}

	public Person selectPersonById(Integer personId) {
		return personDao.selectPersonById(personId);
	}

	public void update(Person person) {
		personDao.update(person);
	}

	public void delete(Integer personId) {
		personDao.delete(personId);
	}

	public List<Person> selectPersonByCondition(QueryCondition qc) {
		return personDao.selectPersonByCondition(qc);
	}

}
