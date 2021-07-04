DROP TABLE IF EXISTS naukri_skill;

CREATE TABLE naukri_skill (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  skill VARCHAR(250) NOT NULL,
  location VARCHAR(250) DEFAULT NULL,
  description VARCHAR(250) DEFAULT NULL
);

INSERT INTO naukri_skill (skill, location, description) VALUES
  ('Java', 'Delhi', 'Backend'),
  ('Python', 'Noida', 'Backend'),
  ('Spring,Microservice', 'Bangalore', 'Backend');