# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table product (
  id                        varchar(255) not null,
  name                      varchar(255),
  description               varchar(255),
  weight                    integer,
  price                     double,
  image_src                 varchar(255),
  category_id               varchar(255),
  constraint pk_product primary key (id))
;

create table product_category (
  id                        varchar(255) not null,
  name                      varchar(255),
  constraint pk_product_category primary key (id))
;

create sequence product_seq;

create sequence product_category_seq;

alter table product add constraint fk_product_category_1 foreign key (category_id) references product_category (id) on delete restrict on update restrict;
create index ix_product_category_1 on product (category_id);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists product;

drop table if exists product_category;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists product_seq;

drop sequence if exists product_category_seq;

