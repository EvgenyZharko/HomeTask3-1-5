DROP TABLE products IF EXISTS
CREATE TABLE IF NOT EXISTS products (id bigserial, title VARCHAR(255), price int, PRIMARY KEY (id));
INSERT INTO products (title, price) VALUES ('Хлеб', 80), ('Молоко', 100), ('Яблоки', 500);
