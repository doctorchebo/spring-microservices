INSERT INTO user (id, name, day_of_birth) VALUES (10001, 'Marcelo', CURRENT_TIMESTAMP);
INSERT INTO user (id, name, day_of_birth) VALUES (10002, 'Ivana', CURRENT_TIMESTAMP);
INSERT INTO user (id, name, day_of_birth) VALUES (10003, 'Tom', CURRENT_TIMESTAMP);

INSERT INTO post (id, description, user_id) VALUES (11001, 'My first post', 10001);
INSERT INTO post (id, description, user_id) VALUES (11002, 'My second post', 10001);
