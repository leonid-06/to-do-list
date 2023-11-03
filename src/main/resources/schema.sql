create table task(
                     id int PRIMARY KEY AUTO_INCREMENT,
                     name varchar(20),
                     description varchar(20),
                     updated datetime,
                     created datetime,
                     status boolean
);

INSERT INTO task (name, description, updated, created, status)
VALUES ('Go to home', 'very fast', '2023-11-03 12:30:00', '2023-11-03 12:30:00', false);

INSERT INTO task (name, description, updated, created, status)
VALUES ('Buy groceries', 'milk, eggs, bread', '2023-11-03 13:00:00', '2023-11-03 13:00:00', true);

INSERT INTO task (name, description, updated, created, status)
VALUES ('Finish work project', 'important deadline', '2023-11-03 14:00:00', '2023-11-03 14:00:00', false);

INSERT INTO task (name, description, updated, created, status)
VALUES ('Read a book', 'mystery novel', '2023-11-03 15:00:00', '2023-11-03 15:00:00', true);

INSERT INTO task (name, description, updated, created, status)
VALUES ('Exercise', 'go to the gym', '2023-11-03 16:00:00', '2023-11-03 16:00:00', false);

INSERT INTO task (name, description, updated, created, status)
VALUES ('Call a friend', 'catching up', '2023-11-03 17:00:00', '2023-11-03 17:00:00', true);

INSERT INTO task (name, description, updated, created, status)
VALUES ('Plan a trip', 'destination ideas', '2023-11-03 18:00:00', '2023-11-03 18:00:00', false);
