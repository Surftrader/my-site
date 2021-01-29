use admin_default;

create table if not exists download_counters (
  id bigint not null auto_increment,
  file_name varchar(255),
  download_counter bigint,
  primary key (id)) engine=InnoDB;
