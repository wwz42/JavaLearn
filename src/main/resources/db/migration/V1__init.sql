create table igm (
id bigint(20) not null PRIMARY KEY auto_increment,
inn varchar(14) not null,
  ogrn varchar(20) not null,
  name varchar(100) not null,
  address varchar(100) not null
)