CREATE DATABASE db_system;


CREATE TABLE tb_pessoa (
  
  id_pessoa int auto_increment primary key not null,
  ds_nome   varchar(100) not null,
  fl_sexo  char(1) not null,
  dt_nascimento  date not null

);

