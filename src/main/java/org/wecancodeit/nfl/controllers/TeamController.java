package org.wecancodeit.nfl.controllers;

import java.util.Collection;

import javax.annotation.Resource;
import org.json.JSONObject;
import org.json.JSONException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wecancodeit.nfl.models.Team;
import org.wecancodeit.nfl.repositories.TeamRepository;



@RestController
@RequestMapping
public class TeamController {
	
	@Resource
	TeamRepository teamRepo;
	
	@GetMapping("")
	public Collection<Team> getTeams() {
		return (Collection<Team>) teamRepo.findAll();
	}
	
	@PostMapping("/add")
	public Collection<Team> addTeam(@RequestBody String body) throws JSONException {
		JSONObject json = new JSONObject(body);
		String teamName = json.getString("teamName");
		String location = new String("location");
		teamRepo.save(new Team(teamName, location));
		return (Collection<Team>) teamRepo.findAll();
	}

}
