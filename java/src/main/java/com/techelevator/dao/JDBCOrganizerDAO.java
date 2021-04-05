package com.techelevator.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.model.Organizer;
import com.techelevator.model.Tournament;

@Component
public class JDBCOrganizerDAO implements OrganizerDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public JDBCOrganizerDAO (JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Organizer getOrganizerInfoByUserId(int userId) {
		Organizer organizer = new Organizer();
		
		String sql = "SELECT organizer_id, users.user_id, organizer_first_name, organizer_last_name, organizer_phone, organizer_email " + 
				"FROM organizer " + 
				"JOIN users ON organizer.user_id = users.user_id " + 
				"WHERE (users.user_id = ? AND organizer_id IS NOT NULL)";
		SqlRowSet rows = jdbcTemplate.queryForRowSet(sql, userId);
		
	
		while(rows.next()) {
			organizer = mapRowToOrganizer(rows);
		}
		
		
		return organizer;
	}
	
	
	@Override
	public Organizer getOrganizerInfoByOrganizerId(int organizerId) {
		Organizer organizer = new Organizer();
		
		String sql = "SELECT organizer_id, user_id, organizer_first_name, organizer_last_name, organizer_phone, organizer_email " + 
				"FROM organizer WHERE organizer_id = ?";
		
		SqlRowSet rows = jdbcTemplate.queryForRowSet(sql, organizerId);
		
		while(rows.next()) {
			organizer = mapRowToOrganizer(rows);
		}
		
		return organizer;
	}
	
	
	
	private Organizer mapRowToOrganizer (SqlRowSet rows) {
		Organizer organizer = new Organizer();
		
		organizer.setOrganizerId(rows.getInt("organizer_id"));
		organizer.setUserId(rows.getInt("user_id"));
		organizer.setFirstName(rows.getString("organizer_first_name"));
		organizer.setLastName(rows.getString("organizer_last_name"));
		organizer.setPhone(rows.getString("organizer_phone"));
		organizer.setEmail(rows.getString("organizer_email"));
		
		
		return organizer;
	}

	

}