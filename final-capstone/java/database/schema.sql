BEGIN TRANSACTION;

DROP TABLE IF EXISTS breweries; 
DROP TABLE IF EXISTS users;

DROP SEQUENCE IF EXISTS seq_user_id;
DROP SEQUENCE IF EXISTS seq_brewery_id;

CREATE SEQUENCE seq_user_id
  INCREMENT BY 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;
  
  CREATE SEQUENCE seq_brewery_id
  INCREMENT BY 1
  NO MAXVALUE
  NO MINVALUE
  CACHE 1;


CREATE TABLE users (
	user_id int DEFAULT nextval('seq_user_id'::regclass) NOT NULL,
	username varchar(50) NOT NULL,
	password_hash varchar(200) NOT NULL,
	role varchar(50) NOT NULL,
        account_type varchar(25) NOT NULL,
        user_location varchar(35),  
	CONSTRAINT PK_user PRIMARY KEY (user_id)
);

CREATE TABLE breweries (
	brewery_id int DEFAULT nextval('seq_brewery_id'::regclass) NOT NULL,
	brewery_name varchar(50) NOT NULL,
        brewer_id int,
        brewery_street_address varchar,
        brewery_city varchar,
        brewery_state varchar,
        brewery_zip int,   
        brewery_website varchar, 
        isActive  boolean DEFAULT TRUE NOT NULL, 
	CONSTRAINT PK_brewery PRIMARY KEY (brewery_id),
	CONSTRAINT FK_brewer_id FOREIGN KEY(brewer_id) REFERENCES users(user_id)
);


INSERT INTO users (username,password_hash,role, account_type, user_location) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER', 'Beer Lover', 'Ohio');
INSERT INTO users (username,password_hash,role, account_type, user_location) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN', 'Administrator', 'Texas');
INSERT INTO users (username,password_hash,role, account_type, user_location) VALUES ('brewer','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN', 'Brewer', 'Wisconsin');


INSERT INTO breweries (brewery_name, brewer_id, brewery_street_address, brewery_city, brewery_state, brewery_zip, brewery_website) VALUES ('Diving Dog Brewhouse' , 1, '1892 Telegraph Ave', 'Oakland', 'California', 94612, 'http://www.leaddogbrewing.com');
INSERT INTO breweries (brewery_name, brewer_id, brewery_street_address, brewery_city, brewery_state, brewery_zip, brewery_website) VALUES ('Diving Dog Brewhouse' , 1, '1892 Telegraph Ave', 'Oakland', 'California', 94612, 'http://www.spotteddogbrewery.com');
INSERT INTO breweries (brewery_name, brewer_id, brewery_street_address, brewery_city, brewery_state, brewery_zip, brewery_website) VALUES ('Diving Dog Brewhouse' , 3, '1892 Telegraph Ave', 'Oakland', 'California', 94612, 'http://www.bossdogbrewing.com');
INSERT INTO breweries (brewery_name, brewer_id, brewery_street_address, brewery_city, brewery_state, brewery_zip, brewery_website) VALUES ('Diving Dog Brewhouse' , 1, '1892 Telegraph Ave', 'Oakland', 'California', 94612, 'http://www.runningdogsbrewery.com');
INSERT INTO breweries (brewery_name, brewer_id, brewery_street_address, brewery_city, brewery_state, brewery_zip, brewery_website) VALUES ('Diving Dog Brewhouse' , 1, '1892 Telegraph Ave', 'Oakland', 'California', 94612, 'http://dogmoneyllc.com');
INSERT INTO breweries (brewery_name, brewer_id, brewery_street_address, brewery_city, brewery_state, brewery_zip, brewery_website) VALUES ('Diving Dog Brewhouse' , 3, '1892 Telegraph Ave', 'Oakland', 'California', 94612, 'http://www.tindogbrewing.com');

COMMIT TRANSACTION;

