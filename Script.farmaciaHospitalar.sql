create database farmacia_hospitalar;

create table medicamento(
id serial primary key,
nome varchar(50) not null,
validade timestamp not null,
condc_armazenamento varchar(50) not null,
lote char(6) not null unique,
estoque int not null,
dosagem int not null,
forma_administracao varchar(20));

create table gerenciamento(
id serial primary key,
data_chegada timestamp not null,
data_saida timestamp not null,
foreign key (id) references medicamento(id));

create table historico(
id serial primary key,
cliente varchar(100) not null,
foreign key (id) references gerenciamento(id)
);