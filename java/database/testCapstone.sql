START TRANSACTION;
<<<<<<< HEAD
<<<<<<< HEAD
ROLLBACK;

INSERT INTO organizer (user_id, organizer_first_name, organizer_last_name, organizer_phone, organizer_email)
        VALUES (2, 'Nick', 'Stewart', 7777777777, 'nickstewart@gmail.com');
        
UPDATE tournament
SET tournament_name = ?, organizer_id = ?, max_participants = ?, is_team = ?, is_double = ?, start_date = ?, end_date = ?
WHERE id = ?;        

        
INSERT INTO users (user_id, username, password_hash, role) VALUES (?, ?, ?, ?);


INSERT INTO tournament (tournament_name, organizer_id, max_participants, is_team, is_double, start_date, end_date) VALUES (?, ?, ?, ?, ?, ?, ?);
=======
INSERT INTO organizer (organizer_first_name, organizer_last_name, organizer_phone, organizer_email)
        VALUES ('Nick', 'Stewart', 7777777777, 'nickstewart@gmail.com');


INSERT INTO tournament (tournament_name, organizer_id, max_participants, is_team, is_double)
        VALUES ('Nick Stewart Open', 1, 100, false, false);
>>>>>>> 1c7a09c4523a0f63bf891ca1a8ee20d34b761393
=======
INSERT INTO organizer (user_id, organizer_first_name, organizer_last_name, organizer_phone, organizer_email)
        VALUES (1, 'Nick', 'Stewart', 7777777777, 'nickstewart@gmail.com');


INSERT INTO tournament (tournament_name, organizer_id, max_participants, is_team, is_double, start_date, end_date)
        VALUES (?, ?, ?, ?, ?, ?, ?);
        
        
INSERT INTO tournament_user (tournament_id, user_id, user_seeding, user_nickname)
        VALUES (?, ?, ?, ?);        
        
>>>>>>> ab1a5c22ea0e8e86909602dec44af1685aaba63c
        
SELECT tournament_name, max_participants, is_team, is_double, organizer_first_name, organizer_last_name, organizer_phone, organizer_email FROM tournament
JOIN organizer ON organizer.organizer_id = tournament.organizer_id;

<<<<<<< HEAD
SELECT organizer_id, users.user_id, organizer_first_name, organizer_last_name, organizer_phone, organizer_email
FROM organizer
JOIN users ON organizer.user_id = users.user_id
WHERE (users.user_id = ? AND organizer_id IS NOT NULL);

SELECT organizer_id, user_id, organizer_first_name, organizer_last_name, organizer_phone, organizer_email
FROM organizer
WHERE organizer_id = ?;



SELECT organizer_id, users.user_id, organizer_first_name, organizer_last_name, organizer_phone, organizer_email
FROM organizer
JOIN users ON organizer.user_id = users.user_id
WHERE users.user_id = ?;

SELECT * FROM tournament;

DELETE FROM tournament
WHERE id = ?;


SELECT CASE users.user_id WHEN (users.user_id != null AND organizer_id != null)  THEN true
                                                                ELSE false
                                                                END AS is_organizer
FROM users
JOIN organizer ON organizer.user_id = users.user_id;


IF (users.user_id != null AND organizer_id != null)
TRUE
ELSE FALSE;

SELECT 
FROM users 
JOIN organizer ON organizer.user_id = users.user_id
IF((users.user_id != null AND organizer_id != null), true, false);


=======
>>>>>>> 1c7a09c4523a0f63bf891ca1a8ee20d34b761393
SELECT * from tournament;
SELECT * from organizer;

UPDATE organizer SET organizer_first_name = ?, organizer_last_name = ?, organizer_phone = ?, organizer_email = ?
WHERE organizer_id = ?;

DELETE FROM organizer WHERE organizer_id = ?;

SELECT tournament_name, max_participants, is_team, is_double, organizer_first_name, organizer_last_name, organizer_phone, organizer_email FROM tournament
JOIN tournament_user ON tournament.id = tournament_user.tournament_id
JOIN users ON tournament_user.user_id = users.user_id
JOIN organizer ON organizer.organizer_id = tournament.organizer_id
WHERE users.user_id = ?;


SELECT user_id FROM tournament_user WHERE tournament_id = ? AND user_id = ?;

INSERT INTO tournament_user VALUES (?, ?, 1, ?)
JOIN;

SELECT user_id FROM tournament_user WHERE tournament_id = ? AND user_id = ?;

WHERE tournament_id = ? AND user_id = ?;



SELECT * from USERS;

ROLLBACK TRANSACTION;