package com.kani.springboot.service;

import java.util.List;


import com.kani.springboot.entity.vote;

public interface Ivote {
	vote createvote(vote vo);
	List<vote> findAllvote();
	public void deleteVote(long voId);

}
