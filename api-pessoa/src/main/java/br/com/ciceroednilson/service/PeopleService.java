package br.com.ciceroednilson.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ciceroednilson.model.PeopleModel;
import br.com.ciceroednilson.repository.PeopleRepository;
import br.com.ciceroednilson.repository.entity.PeopleEntity;

@Service
public class PeopleService {

	@Autowired
	private PeopleRepository peopleRepository;

	public List<PeopleModel> findAll(){
		
		List<PeopleModel> peoplesModel = new ArrayList<PeopleModel>();
		
		List<PeopleEntity> peoplesEntity = this.peopleRepository.findAll();
		
		peoplesEntity.forEach(entity->{
			peoplesModel.add(new PeopleModel(entity.getId(), entity.getName(), entity.getGender(), entity.getBirthDate()));
		});
		
		return peoplesModel;
	}
}
