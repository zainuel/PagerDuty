DROP TABLE IF EXISTS Team;

CREATE TABLE Team (
                               id INT AUTO_INCREMENT  PRIMARY KEY,
                               name VARCHAR(250) NOT NULL,

);


DROP TABLE IF EXISTS User;

CREATE TABLE User (
                               id INT AUTO_INCREMENT  PRIMARY KEY,
                               name VARCHAR(250) NOT NULL,
                               phone_number VARCHAR(250) NOT NULL,
);


DROP TABLE IF EXISTS Team_Member;

CREATE TABLE Team_Member (
                               id INT AUTO_INCREMENT  PRIMARY KEY,
                               team_id INT NOT NULL ,
                               user_id INT NOT NULL ,
                               foreign key (team_id) references Team(id),
                               foreign key (user_id) references User(id)
);




