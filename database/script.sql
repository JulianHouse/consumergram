USE consumergram;

CREATE TABLE consumers (
                           id INT PRIMARY KEY,
                           email VARCHAR(255) NOT NULL,
                           username VARCHAR(255) NOT NULL,
                           password VARCHAR(255) NOT NULL
);

ALTER TABLE consumers MODIFY id INT AUTO_INCREMENT;

INSERT INTO consumers (email, username, password) VALUES ('rayza@gmail.com', 'rayza', 'test123');