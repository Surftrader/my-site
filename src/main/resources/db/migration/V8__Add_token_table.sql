use admin_default;

create table tokens (
    id bigint not null auto_increment,
    token varchar(45),
    time_creation timestamp,
    primary key (id)) engine =InnoDB;
