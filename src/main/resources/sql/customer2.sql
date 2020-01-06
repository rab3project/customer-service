create table customer(
customer_id int not null auto_increment,
first_name varchar(40),
last_name varchar(40),
email varchar(40),
phone varchar(15),
primary key (customer_id)
);
alter table customer add column created_at datetime;
alter table customer add column updated_at datetime;


create table customer_login(
login_id int not null auto_increment,
user_name varchar(50) not null,
password varchar(50) not null,
last_sign_in datetime,
customer_id int,
created_at datetime,
updated_at datetime,
primary key(login_id),
foreign key(customer_id) references customer(customer_id)
);



create table billing_address(
billing_id int not null auto_increment,
address1 varchar(30),
address2 varchar(30),
city varchar(20),
state varchar(20),
zip_code varchar(12),
customer_id int,
primary key (billing_id),
foreign key (customer_id)  references customer(customer_id)
);
alter table billing_address add column created_at datetime;
alter table billing_address add column updated_at datetime;
