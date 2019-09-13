DROP TABLE IF EXISTS skates;

CREATE TABLE skates (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  producer VARCHAR(250) NOT NULL,
  model VARCHAR(250) NOT NULL,
  bearings VARCHAR(250),
  frame VARCHAR(250),
  have_break VARCHAR(250),
  liner VARCHAR(250),
  number_of_wheels VARCHAR(250),
  price VARCHAR(250),
  production_year VARCHAR(250),
  shell VARCHAR(250),
  still_on_sale VARCHAR(250)
);

INSERT INTO skates (producer, model) VALUES
  ('Aliko', 'Dangote'),
  ('Bill', 'Gates'),
  ('Folrunsho', 'Alakija');
