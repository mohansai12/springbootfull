package com.kani.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="vote")
public class vote {
	@Id
	@GeneratedValue
	private long voteId;
	private String voteName;
	private long voteAge;
	private String Address;

	public long getVoteId() {
		return voteId;
	}
	public void setVoteId(long voteId) {
		this.voteId = voteId;
	}
	public String getVoteName() {
		return voteName;
	}
	public void setVoteName(String voteName) {
		this.voteName = voteName;
	}
	public long getVoteAge() {
		return voteAge;
	}
	public void setVoteAge(long voteAge) {
		this.voteAge = voteAge;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public vote() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "vote [voteId=" + voteId + ", voteName=" + voteName + ", voteAge=" + voteAge + ", Address=" + Address
				+ "]";
	}
	
	
	
}
