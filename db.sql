drop table tax;
drop table bill;
drop table customer;
drop table login;

create table login(username varchar(20),password varchar(20));
create table customer(meter_number int primary key,name varchar(20), address varchar(40), state varchar(20),city varchar(15),email varchar(30),phone varchar(15));
create table bill(month varchar(20) primary key,units varchar(5),amount varchar(15) ,meter_number int references customer(meter_number));
create table tax(meter_location varchar(10),meter_type varchar(15),phase_code varchar(5),bill_type varchar(10),days varchar(5),meter_rent varchar(5),mcb_rent varchar(5),service_rent varchar(5),gst varchar(5));

insert into login values('admin','12345');
insert into tax values('Pune','II-Phase','II','Customer','30','50','30','20','20');
insert into customer values(1001,'Dheeraj','a','b','c','e','145542517');
