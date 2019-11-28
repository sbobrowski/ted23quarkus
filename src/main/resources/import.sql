CREATE TABLE test_user (
  id INT,
  username VARCHAR(255),
  password VARCHAR(255),
  role VARCHAR(255)
);

INSERT INTO test_user (id, username, password, role) VALUES (1, 'admin', 'admin', 'admin');
INSERT INTO test_user (id, username, password, role) VALUES (2, 'user','user', 'user');

-- Create some todos on startup

INSERT INTO todo (id, message) VALUES (1, 'My first todo');
INSERT INTO todo (id, message) VALUES (2, 'My second todo');
INSERT INTO todo (id, message) VALUES (3, 'My third todo');