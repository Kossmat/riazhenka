# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table person (
  id                        varchar(255) not null,
  name                      varchar(255),
  age                       integer,
  constraint pk_person primary key (id))
;

create table roll (
  id                        varchar(255) not null,
  name                      varchar(255),
  description               varchar(255),
  weight                    integer,
  constraint pk_roll primary key (id))
;

create sequence person_seq;

create sequence roll_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists person;

drop table if exists roll;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists person_seq;

drop sequence if exists roll_seq;

