create table client(
     id serial primary key,
     name varchar(20) not null,
     age int not null,
     cpf varchar(11) not null unique
);
