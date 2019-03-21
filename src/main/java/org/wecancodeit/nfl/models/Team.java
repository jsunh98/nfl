package org.wecancodeit.nfl.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Team {

	@Id
	@GeneratedValue
	private Long teamId;
	private String teamName;
	private String location;
	
	
	public Team(String teamName, String location) {
		this.teamName = teamName;		
		this.location = location;
	}
	
	
	public Long getTeamId() {
		return teamId;
	}
	public String getTeamName() {
		return teamName;
	}

	public String getLocation() {
		return location;
	}


	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", location=" + location + "]";
	}


	
}
