package com.techelevator.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.dao.OrganizerDAO;
import com.techelevator.model.Organizer;
import com.techelevator.model.User;


@CrossOrigin
@RestController
public class OrganizerController {
	
	private OrganizerDAO organizerDAO;
	
	OrganizerController(OrganizerDAO organizerDAO){
		this.organizerDAO = organizerDAO;
	};
	
	
	@RequestMapping(path="/organizers/info/{userId}", method = RequestMethod.GET)
	public Organizer getOrganizerInfoByUserId(@PathVariable Integer userId) {
		return organizerDAO.getOrganizerInfoByUserId(userId);
	}
	
	@RequestMapping(path="/organizers", method=RequestMethod.POST)
	public Organizer createNewOrganizer(@RequestBody Organizer organizer) {
		return organizerDAO.createNewOrganizer(organizer);
	}

	@RequestMapping(path="/organizers/{organizerId}", method = RequestMethod.GET)
	public Organizer getOrganizerInfoByOrganizerId(@PathVariable Integer organizerId) {
		return organizerDAO.getOrganizerInfoByOrganizerId(organizerId);
	}
	
	@RequestMapping(path="/organizers/{organizerId}", method = RequestMethod.PUT)
	public void updateOrganizerInfo(@PathVariable Integer organizerId, Principal principal) {
		organizerDAO.updateOrganizerInfo(principal.getName(), organizerId);
	}
	
	@RequestMapping(path="/organizers/{organizerId}", method = RequestMethod.DELETE)
	public void deleteOrganizer(@PathVariable Integer organizerId, Principal principal) {
		organizerDAO.deleteOrganizer(principal.getName(), organizerId);
	}

}
