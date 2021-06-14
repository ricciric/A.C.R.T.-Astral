package it.uniroma3.siw.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.siw.spring.model.MembroStaff;
import it.uniroma3.siw.spring.repository.MembroStaffRepository;

@Service
public class MembroStaffService {

	@Autowired
	private MembroStaffRepository membroStaffRepository;

	@Transactional
	public List<MembroStaff> tutti(){
		return (List<MembroStaff>) this.membroStaffRepository.findAll();
	}

}
