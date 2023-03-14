package com.kani.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.kani.springboot.entity.vote;
import com.kani.springboot.repository.IVoteRepository;
@Service
public class VoteImpl implements Ivote{
	@Autowired
	IVoteRepository repo;

	@Override
	public vote createvote(vote vo) {
		// TODO Auto-generated method stub
		return repo.save(vo);
	}

	@Override
	public List<vote> findAllvote() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteVote(long voId) {
		// TODO Auto-generated method stub
		vote v1=repo.findBy(vote.class,voId);
	}

}
