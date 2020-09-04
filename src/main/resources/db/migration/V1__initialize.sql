BEGIN;
DROP TABLE IF EXISTS PRODUCTS CASCADE;
CREATE TABLE PRODUCTS
(
    id    BIGSERIAL PRIMARY KEY,
    title VARCHAR(255),
    price INTEGER,
     description varchar(255)
);

INSERT INTO products (title, price, description)
VALUES ('phone', 45000, 'good'),
       ('laptop', 60000, 'okokok'),
       ('car', 1000000, 'norm'),
       ('book', 1000, 'not bad'),
       ('ball', 1200, 'bad');

COMMIT;
--DROP TABLE IF EXISTS HIBER.PRODUCTS CASCADE;
--CREATE TABLE HIBER.PRODUCTS
--(
--    id    BIGSERIAL PRIMARY KEY,
--    title VARCHAR(255),
--    price INTEGER,
--     description varchar(255)
--);
--
--INSERT INTO products (title, price, description)
--VALUES ('phone', 45000, 'good'),
--       ('laptop', 60000, 'okokok'),
--       ('car', 1000000, 'norm'),
--       ('book', 1000, 'not bad'),
--       ('ball', 1200, 'bad');
--
--COMMIT;