package com.herb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.herb.PermitRepository;
import com.herb.entity.Permit;

@Service
@Transactional
public class PermitService {

	@Autowired
	private PermitRepository repo;
	
	public List<Permit> listAll() {
		return repo.findAll();
	}
	
	public void save(Permit permit) {
		repo.save(permit);
	}
	
	public Permit get(long id) {
		return repo.findById(id).get();
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}
}
