package com.techelevator.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.dao.tournamentDAO;
import com.techelevator.model.Tournament;


@RestController
public class TournamentController {
	
	private tournamentDAO tournamentDAO;
	
	TournamentController(tournamentDAO tournamentDAO){
		this.tournamentDAO = tournamentDAO;
	};
	
	// Below is message we are getting on Postman...
	// It is modifying the database but returning a 500 error: 
	// No results were returned by the query.; nested exception is org.postgresql.util.PSQLException: No results were returned by the query.
	
	@RequestMapping(path="tournaments", method = RequestMethod.POST)
	public void createTournament(@RequestBody Tournament tournament) {
		tournamentDAO.createTournament(tournament);
	};
	
	@RequestMapping(path="tournaments", method = RequestMethod.GET)
	public List<Tournament> getAllTournaments() {
		return tournamentDAO.listAllTournaments();
	}

}