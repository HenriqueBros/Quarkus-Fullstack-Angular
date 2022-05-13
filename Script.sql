create table produto(
id INT not null,
name VARCHAR(30),
valor int,
primary key (id)
);

create table materiaPrima(
id INT not null,
name VARCHAR(30),
valor int,
quantidade int,
primary key (id)
);