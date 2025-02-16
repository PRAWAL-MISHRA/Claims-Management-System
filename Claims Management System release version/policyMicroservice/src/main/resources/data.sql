DROP TABLE IF EXISTS benefits;
create table benefits(policy_id int,benefit_id int, benefit_name varchar(50));

insert into benefits (policy_id,benefit_id,benefit_name) values(1,201,'Free Monthly Health Checkup');
insert into benefits (policy_id,benefit_id,benefit_name) values(1,202,'Cashless Medical Treatment');
insert into benefits (policy_id,benefit_id,benefit_name) values(1,203,'Coverage For Covid-19 Treatment');
insert into benefits (policy_id,benefit_id,benefit_name) values(2,204,'Daily Hospital Cash Benefit');
insert into benefits (policy_id,benefit_id,benefit_name) values(3,205,'Tax Benefits On The Health Insurance Premium');

DROP TABLE IF EXISTS policy;
create table policy(policy_id int,cap_amount_benefits double,policy_number int,premium double,tenure int);

insert into policy (policy_id,cap_amount_benefits,policy_number,premium,tenure) values(1,120000.0,101,2000.0,25);
insert into policy (policy_id,cap_amount_benefits,policy_number,premium,tenure) values(2,80000.0,102,8000.0,21);
insert into policy (policy_id,cap_amount_benefits,policy_number,premium,tenure) values(3,30000.0,103,3000.0,14);


DROP TABLE IF EXISTS member_policy;
create table member_policy(member_id int,policy_id int,policy_number int,benefit_id int,subscription_date date,tenure int,cap_amount_benefits double);

insert into member_policy (member_id,policy_id,policy_number,benefit_id,subscription_date,tenure,cap_amount_benefits) values(3,2,102,203,'2019-01-09',14,80000.00);
insert into member_policy (member_id,policy_id,policy_number,benefit_id,subscription_date,tenure,cap_amount_benefits) values(2,1,102,201,'2019-01-09',14,80000.00);
insert into member_policy (member_id,policy_id,policy_number,benefit_id,subscription_date,tenure,cap_amount_benefits) values(1,3,102,201,'2019-01-09',14,80000.00);
insert into member_policy (member_id,policy_id,policy_number,benefit_id,subscription_date,tenure,cap_amount_benefits) values(1,1,102,201,'2019-01-09',14,80000.00);
insert into member_policy (member_id,policy_id,policy_number,benefit_id,subscription_date,tenure,cap_amount_benefits) values(4,2,102,204,'2019-01-09',14,80000.00);
insert into member_policy (member_id,policy_id,policy_number,benefit_id,subscription_date,tenure,cap_amount_benefits) values(4,1,102,204,'2019-01-08',14,80000.00);

DROP TABLE IF EXISTS provider_policy;
create table provider_policy(provider_id int,policy_id int,provider_address varchar(50),provider_name varchar(20),location varchar(20));

/*Inserting data in provider_policy table*/
insert into provider_policy (provider_id,policy_id,provider_address,provider_name,location) values(6,2,'MG Road','City Hospital','A');
insert into provider_policy (provider_id,policy_id,provider_address,provider_name,location) values(7,2,'Chitnis Nagar','LIC','B');
insert into provider_policy (provider_id,policy_id,provider_address,provider_name,location) values(8,2,'MG Road','City Hospital','Z');
insert into provider_policy (provider_id,policy_id,provider_address,provider_name,location) values(9,2,'Chitnis Nagar','LIC','D');
insert into provider_policy (provider_id,policy_id,provider_address,provider_name,location) values(1,2,'MG Road','City Hospital','Chennai');
insert into provider_policy (provider_id,policy_id,provider_address,provider_name,location) values(2,2,'Chitnis Nagar','LIC','Nagpur');
insert into provider_policy (provider_id,policy_id,provider_address,provider_name,location) values(3,3,'Chandni Chowk','Bajaj','Delhi');
insert into provider_policy (provider_id,policy_id,provider_address,provider_name,location) values(4,1,'Dhayari','Apollo Hospital','Pune');
insert into provider_policy (provider_id,policy_id,provider_address,provider_name,location) values(5,2,'Boriwali','HDFC','Mumbai');
insert into provider_policy (provider_id,policy_id,provider_address,provider_name,location) values(1,1,'Boriwali','HDFC','Mumbai');

/*insert into provider_policy values(100,'Guntur',10001,'Lalitha Super Speciality Hospitals');
insert into provider_policy values(101,'Guntur',10002,'Lalitha Multi Speciality Hospitals');
insert into provider_policy values(102,'Trichy',10001,'Apollo Hospitals');*/