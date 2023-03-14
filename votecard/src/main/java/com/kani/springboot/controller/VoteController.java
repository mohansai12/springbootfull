package com.kani.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.kani.springboot.entity.vote;
import com.kani.springboot.service.Ivote;

@RestController
@RequestMapping(value="vote")
public class VoteController {
	@Autowired
	Ivote vot;
	
	@PostMapping(path="/create")
      public ResponseEntity<Boolean> createvote(@RequestBody  vote vo1) {
		
		vot.createvote(vo1);
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);
		System.out.println("response entity=" + responseEntity);
		return responseEntity;
	}
	@GetMapping(path="/getAll")
	public  ResponseEntity<List<vote>> findAll(){
		List<vote> list=vot.findAllvote();
		
		return new ResponseEntity<List<vote>>(list,new HttpHeaders(),HttpStatus.OK);
	}
	@DeleteMapping(path="/delete/{voteId}")
	public String deletevote(@PathVariable("voteId") Long voteId) {
		vot.deleteVote(voteId);
		return "Deleted";
	
	}
	

}
