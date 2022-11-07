create table pescador
(
id number(3) not null primary key,
nombre varchar2(20),
edad number(3),
nacionalidad varchar2(20),
especialidad varchar2(20)
);


create table pez
(
nombre varchar2(20) primary key,
longitud number(5),
peso number(5),
localizacion varchar2(20),
recordLongitud number(5),
id_pescador number(3) not null,
FOREIGN KEY(id_pescador) REFERENCES pescador(id) on delete cascade
);


insert into pescador values(1,'jaime',25,'español','arpon');

insert into pez values('dorada',90,6.1,'Mar Mediterraneo','110',1);