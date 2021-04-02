create table "students" (
id bigserial not null primary key,
name varchar,
surname varchar,
age integer,
groupNumber varchar,
faculty varchar);

INSERT INTO students(name, surname, age, groupNumber, faculty) values ('Петр', 'Петров', 25, 'P41141', 'ПИиКТ');
INSERT INTO students(name, surname, age, groupNumber, faculty) values ('Владимир', 'Иванов', 26, 'P41142', 'ИКТ');
INSERT INTO students(name, surname, age, groupNumber, faculty) values ('Иван', 'Иванов', 27, 'P41143', 'ПИиКТ');
INSERT INTO students(name, surname, age, groupNumber, faculty) values ('Иммануил', 'Кант', 28, 'P41141', 'ИКТ');
INSERT INTO students(name, surname, age, groupNumber, faculty) values ('Джордж', 'Клуни', 29, 'P41142', 'ПИиКТ');
INSERT INTO students(name, surname, age, groupNumber, faculty) values ('Билл', 'Рубцов', 30, 'P41143', 'ИКТ');
INSERT INTO students(name, surname, age, groupNumber, faculty) values ('Марк', 'Марков', 31, 'P41141', 'ПИиКТ');
INSERT INTO students(name, surname, age, groupNumber, faculty) values ('Галина', 'Матвеева', 32, 'P41142', 'ИКТ');
INSERT INTO students(name, surname, age, groupNumber, faculty) values ('Святослав', 'Павлов', 33, 'P41143', 'ПИиКТ');