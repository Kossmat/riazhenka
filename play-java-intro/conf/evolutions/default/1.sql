# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table roll (
  id                        varchar(255) not null,
  name                      varchar(255),
  description               varchar(255),
  weight                    integer,
  price                     double,
  image                     blob,
  constraint pk_roll primary key (id))
;

create sequence roll_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists roll;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists roll_seq;

