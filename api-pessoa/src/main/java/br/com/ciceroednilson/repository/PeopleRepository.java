package br.com.ciceroednilson.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.ciceroednilson.repository.entity.PeopleEntity;


@Repository
public interface  PeopleRepository extends org.springframework.data.repository.Repository<PeopleEntity, Integer> {
	
	
	List<PeopleEntity> findAll();

}
