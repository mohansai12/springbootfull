package com.kani.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kani.springboot.entity.vote;

public interface IVoteRepository extends JpaRepository<vote, Integer> {

	vote findBy(Class<vote> class1, long voId);

}
