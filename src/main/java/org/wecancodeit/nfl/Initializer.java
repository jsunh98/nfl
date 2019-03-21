package org.wecancodeit.nfl;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.nfl.models.Team;
import org.wecancodeit.nfl.repositories.TeamRepository;

@Service
public class Initializer implements CommandLineRunner {

	@Resource
	TeamRepository teamRepo;
	
	
	@Override
	public void run(String... args) throws Exception {
		Team bengals = teamRepo.save(new Team("Cincinnati Bengals", "Cincinnati, Ohio"));
		Team browns = teamRepo.save(new Team("Cleveland Browns", "Cleveland, Ohio"));
		Team bears = teamRepo.save(new Team("Chicago Bears", "Chicago, Illinois"));
		Team broncos = teamRepo.save(new Team("Denver Broncos", "Denver, Colorado"));
		Team ravens = teamRepo.save(new Team("Baltimore Ravens", "Baltimore, Maryland"));
		Team panthers = teamRepo.save(new Team("Carolina Panthers", "Charlotte, North Carolina"));
	}
	
	

}
