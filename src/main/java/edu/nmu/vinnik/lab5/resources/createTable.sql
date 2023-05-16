CREATE DATABASE University;

GO

USE University;

CREATE TABLE Students (
    id UNIQUEIDENTIFIER,
    surname VARCHAR(50),
    name VARCHAR(50),
    patronymic_name VARCHAR(50),
    date_of_birth DATE,
    score_book_id INT
);

INSERT INTO Students (id, surname, name, patronymic_name, date_of_birth, score_book_id)
VALUES
    (NEWID(), 'Smith', 'John', 'Michael', '2000-01-01', 10001),
    (NEWID(), 'Johnson', 'Emily', 'Grace', '2001-02-03', 10002),
    (NEWID(), 'Williams', 'David', 'Robert', '1999-08-04', 10003),
	(NEWID(), 'Williams', 'David', 'Robert', '1999-03-10', 10004),
	(NEWID(), 'Williams', 'Emily', 'Robert', '2001-05-14', 10005),
	(NEWID(), 'Williams', 'David', 'Emily', '2000-04-10', 10006),
	(NEWID(), 'Johnson', 'David', 'Robert', '2001-05-10', 10007),
	(NEWID(), 'Williams', 'David', 'Robert', '1999-07-15', 10008),
	(NEWID(), 'Williams', 'Johnson', 'Robert', '1999-05-10', 10009),
	(NEWID(), 'Emily', 'David', 'Robert', '2001-05-10', 10010),
	(NEWID(), 'Williams', 'David', 'Robert', '1999-08-16', 10011),
	(NEWID(), 'Williams', 'David', 'Emily', '2001-12-10', 10012),
	(NEWID(), 'Emily', 'David', 'Robert', '2000-05-17', 10013),
	(NEWID(), 'Williams', 'David', 'Johnson', '1999-05-10', 10014),
	(NEWID(), 'Williams', 'David', 'Robert', '2001-10-10', 10015),
	(NEWID(), 'Williams', 'David', 'Robert', '1999-11-11', 10016),
	(NEWID(), 'Johnson', 'David', 'Robert', '2001-05-01', 10017),
	(NEWID(), 'Williams', 'David', 'Johnson', '2000-10-10', 10018),
	(NEWID(), 'Williams', 'David', 'Robert', '2001-05-24', 10019),
    (NEWID(), 'Davis', 'Sarah', 'Elizabeth', '2002-09-15', 10020);