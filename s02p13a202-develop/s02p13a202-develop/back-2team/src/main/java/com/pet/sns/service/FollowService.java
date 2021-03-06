package com.pet.sns.service;

import java.util.List;

import com.pet.sns.model.dto.Follow;

public interface FollowService {
	public List<Follow> testAll();

	public Follow selectOne(String unum);

	public String selectFollower(String unum);

	public String selectFollowing(String unum);

	public Follow selectMyFollow(Follow f);

	public void insert(Follow f);

	public void update(Follow f);

	public void delete(String unum);
}
