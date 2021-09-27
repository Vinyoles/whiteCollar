DROP TABLE IF EXISTS shops;

CREATE TABLE shops (
	id_shop INTEGER PRIMARY KEY AUTO_INCREMENT,
	shop_name VARCHAR(40),
	shop_capacity INTEGER(30)
);



DROP TABLE IF EXISTS paintings;

CREATE TABLE paintings (
	id_painting INTEGER PRIMARY KEY AUTO_INCREMENT,
	author VARCHAR(30),
	title VARCHAR(100),
	price DOUBLE,
	entry_date TIMESTAMP,
	shop_id INTEGER(30)
);