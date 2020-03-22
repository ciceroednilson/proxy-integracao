package br.com.ciceroednilson.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.ciceroednilson.model.PeopleModel;
import br.com.ciceroednilson.service.PeopleService;

@RestController
@RequestMapping("/people")
public class PeopleController {

	@Autowired
	private PeopleService peopleService;
	
	@GetMapping(value = "/findall")
	public @ResponseBody ResponseEntity<List<PeopleModel>> findAll(){
		
		List<PeopleModel> peoples = this.peopleService.findAll();
		
		return new ResponseEntity<List<PeopleModel>>(peoples, HttpStatus.OK);
	}
}
