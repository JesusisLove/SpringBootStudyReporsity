drop table if exists employee;
Create table employee (
‘id’ int(11) not null auto_increment,
‘lastname’ varchar(255) default null,
‘email’ varchar(255) default null,
‘gender’ int default null,
‘departmentid’ varchar(255) default null,
‘birth’ data default null,
Primary key (‘id’)
) engine=innoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;