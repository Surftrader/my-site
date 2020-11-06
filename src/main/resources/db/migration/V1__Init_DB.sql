use admin_default;

# DROP TABLE db_tarot.cards;

create table cards (
  id bigint not null auto_increment,
  description varchar(255),
  card_name varchar(255),
  card_number integer,
  image_path varchar(255),
  primary key (id)) engine=InnoDB;

