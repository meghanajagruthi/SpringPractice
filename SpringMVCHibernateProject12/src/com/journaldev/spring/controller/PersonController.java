package com.journaldev.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.journaldev.spring.bean.Person;
import com.journaldev.spring.service.PersonService;




@Controller
public class PersonController {
	
		private PersonService personService;
		@Autowired(required=true)
		@Qualifier(value = "personService")
			public void setPersonService(PersonService ps) {
			this.personService = ps;
		}
		
		@RequestMapping(value = "/persons", method = RequestMethod.GET)
		public String listPersons(Model model) {
			model.addAttribute("person", new Person());
			List<Person> listPersons = new ArrayList<>();
			Person person =new Person();
			person.setName("Rachana");
			listPersons.add(person);
			model.addAttribute("listPersons", listPersons);
			return "person";
		}
		
		//For add and update person both
		@RequestMapping(value = "/person/add", method = RequestMethod.GET)
		public String addPerson(@ModelAttribute("person") Person p) {
			if(p.getId() == 0) {
				//new person, add it
				this.personService.addPerson(p);
			} else {
				//existing person, call update
				this.personService.updatePerson(p);
			}
			return "redirect:/persons";
		}
		
		@RequestMapping("/edit/{id}")
		public String editPerson(@PathVariable("id") int id, Model model) {
			model.addAttribute("person", this.personService.getPersonById(id));
			model.addAttribute("listpersons", this.personService.listPersons());
			return "person";
		}
	}
			
			


