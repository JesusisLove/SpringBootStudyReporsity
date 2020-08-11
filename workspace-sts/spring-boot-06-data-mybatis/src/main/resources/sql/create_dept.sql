drop table if exists department
        Create table department(
        ‘id’ int(11) not null auto_increment,
        ‘departmentname’ varchar(255) default null,
        Primary key (‘id’)
        ) engine=innoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;