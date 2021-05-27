BEGIN TRANSACTION;

DROP TABLE IF EXISTS beers;
DROP TABLE IF EXISTS breweries; 
DROP TABLE IF EXISTS users;

DROP SEQUENCE IF EXISTS seq_user_id;
DROP SEQUENCE IF EXISTS seq_brewery_id;
DROP SEQUENCE IF EXISTS seq_beer_id;


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
  
CREATE SEQUENCE seq_beer_id
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
        active boolean DEFAULT TRUE NOT NULL, 
	CONSTRAINT PK_brewery PRIMARY KEY (brewery_id),
	CONSTRAINT FK_brewer_id FOREIGN KEY(brewer_id) REFERENCES users(user_id)
);

CREATE TABLE beers (
        beer_id int DEFAULT nextval('seq_beer_id'::regclass) NOT NULL,
        beer_name varchar(75) NOT NULL,
        beer_style varchar(50) NOT NULL,
        beer_description varchar(500) NOT NULL,
        beer_abv numeric,
        brewery_id int NOT NULL,
        active boolean DEFAULT TRUE NOT NULL,
        CONSTRAINT FK_brewery_id FOREIGN KEY(brewery_id) REFERENCES breweries(brewery_id)
);


INSERT INTO users (username,password_hash,role, account_type, user_location) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER', 'Beer Lover', 'Ohio');
INSERT INTO users (username,password_hash,role, account_type, user_location) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN', 'Administrator', 'Texas');

COMMIT TRANSACTION;

