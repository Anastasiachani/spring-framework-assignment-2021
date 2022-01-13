# spring-framework-assignment-2021
Code for 2021 assignment. 

Database: Using Docker (https://docs.docker.com/get-docker/)

Για να εγκατασταθεί η εικόνα(image) της mysql στο docker, θα χρειαστεί να τρέξετε στο command line την εντολή:

docker pull mysql

Έπειτα τρέχετε την εντολή:

docker run --name mysqldb -v mysqldbvol:/var/lib/mysql -p 3306:3306 -e MYSQL_USER=hbusers -e MYSQL_PASSWORD=changeit -e MYSQL_DATABASE=users -e MYSQL_ROOT_PASSWORD=pass123 --rm -d mysql/mysql-server:latest

(η βάση που θα τρέχει στην εφραμογή)

Στο DBeaver(https://dbeaver.io/download/), χρησιμοποιώντας MySQL, τρέχουμε τις εξής εντολές ώστε να δημιουργηθούν οι πίνακες: 

CREATE TABLE IF NOT EXISTS `user` (
`email` varchar(50) NOT NULL,
`password` varchar(100) NOT NULL,
`enabled` tinyint(1) NOT NULL,
PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `authorities` (
`username` varchar(50) NOT NULL,
`authority` varchar(50) NOT NULL,
UNIQUE KEY `ix_auth_username` (`username`,`authority`),
CONSTRAINT `fk_authorities_users` FOREIGN KEY (`username`) REFERENCES `user` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

Γεμίζουμε τους πίνακες με αυτές τις τιμές:

INSERT INTO `user` (`email`, `password`, `enabled`) VALUES
('anastasia@hua.gr', '$2a$04$DR/f..s1siWJc8Xg3eJgpeB28a4V6kYpnkMPeOuq4rLQ42mJUYFGC', 1),
('root@hua.gr', '$2a$04$DR/f..s1siWJc8Xg3eJgpeB28a4V6kYpnkMPeOuq4rLQ42mJUYFGC', 1);

INSERT INTO `authorities` (`username`, `authority`) VALUES
('root', 'ROLE_ADMIN'),
('anastasia', 'ROLE_USER');

INSERT INTO `user` VALUES
('david@hua.gr', 'n5ypW?=Jxn-Z="$H>;ef',1),
('john@hua.gr', '_{8mUux^LCBuh:Rs^{s>',1),
('ajay@hua.gr', 'r9J`5bq7^Gu[t(2:.&2z',1),
('mary@hua.gr', '2LV$#nT%#QQv(Bm7UCwq',1),
('max@hua.gr', 'wRR9g}L6xk]Mv4h4e-',1);

INSERT INTO `authorities` (`username`, `authority`) VALUES
('david', 'ROLE_USER'),
('john', 'ROLE_USER'),
('ajay', 'ROLE_USER'),
('mary', 'ROLE_USER'),
('max', 'ROLE_USER');

Clone Project into IntelliJ(στην γραμμή εργαλειών της εφαρμογής):

Git -> Clone  

και URL:  https://github.com/Anastasiachani/spring-framework-assignment-2021/tree/master
