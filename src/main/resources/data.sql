insert into rol (rol_nombre)
values ('ROLE_ADMIN');

insert into rol (rol_nombre)
values ('ROLE_ASESOR');

insert into usuario (nombre ,nombre_Usuario,email            ,password)
            values  ('admin','admin'      ,'admin@email.com','$2a$10$wG79eHSDFOJ/.bnBoCbvxer/Zy4W42BdBTAjGKLTf8CQD0eFGv0KS');

insert into usuario_rol (usuario_id,rol_id)
            values (1,1);

--Personas
insert into personas(id,nombre,apellido,correo) values (1,'Jhonny','Montoya','jhonnymontoya@email.com' );
insert into personas(id,nombre,apellido,correo) values (2,'Mauricio','Lopez','mauriciolopez@email.com');
insert into personas(id,nombre,apellido,correo) values (3,'Andres','Munera','andresmunera@eail.com');
insert into personas(id,nombre,apellido,correo) values (4,'Chris','Hincapie','chrishincapie@email.com');
insert into personas(id,nombre,apellido,correo) values (5,'Andres','Pamplona','andrespamplona@email.com');
insert into personas(id,nombre,apellido,correo) values (6,'Sandra','Graciano','sandra@email.com');


--Tarjetas
insert into tarjetas(nombre,fecha,codigo,persona) values('Jhonny M','20/2024',587,1);
insert into tarjetas(nombre,fecha,codigo,persona) values('Mauricio','18/2024',345,2);
insert into tarjetas(nombre,fecha,codigo,persona) values('Andres','11/2024',751,3);
insert into tarjetas(nombre,fecha,codigo,persona) values('Chris','08/2026',452,4);
insert into tarjetas(nombre,fecha,codigo,persona) values('Jhonny V','09/2024',456,1);
insert into tarjetas(nombre,fecha,codigo,persona) values('Jhonny A','05/2024',852,1);
insert into tarjetas(nombre,fecha,codigo,persona) values('Mauro','02/2024',693,2);
insert into tarjetas(nombre,fecha,codigo,persona) values('Sandra','16/2024',145,6);

