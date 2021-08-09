package com.api.AgendaApi.controller;

import com.api.AgendaApi.dto.request.PersonDTO;
import com.api.AgendaApi.dto.response.MessageResponseDTO;
import com.api.AgendaApi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController

public class PersonController {

   private PersonService personService;

   @Autowired
   public PersonController(PersonService personService){
       this.personService = personService;
   }

   @PostMapping
   @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO){
       return personService.createPerson(personDTO);
   }
}
