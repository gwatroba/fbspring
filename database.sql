CREATE TABLE profile (profile_id SERIAL PRIMARY KEY, login VARCHAR(25) UNIQUE NOT NULL, firstname VARCHAR(25) NOT NULL, lastname VARCHAR(25) NOT NULL, email VARCHAR(30) UNIQUE, created DATE NOT NULL);

CREATE TABLE message (message_id SERIAL PRIMARY KEY, message TEXT NOT NULL, created TIMESTAMP NOT NULL, profile_id INTEGER NOT NULL REFERENCES profile (profile_id));