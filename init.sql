CREATE TABLE student (
   id uuid primary key,
   name varchar(50) not null,
   surname varchar(50) not null
);

CREATE TABLE kurs (
   id uuid primary key,
   student_id uuid not null,
   name varchar(50) not null,
   foreign key(student_id) references student(id)
);
CREATE TABLE estimation (
   id uuid primary key,
   ocenka varchar(50) not null,
   kurs_id uuid,
   foreign key(kurs_id) references kurs(id)
);

INSERT INTO student(id,name,surname)
values
(gen_random_uuid(),'Petr','Ian');





