DROP TABLE IF EXISTS documents CASCADE;
create table documents (
    id bigserial primary key,
    contain varchar(5000),
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp
);
insert into documents (contain) values
('Harry Potter: Philosopher''s Stone'),
('Harry Potter: Chamber of Secrets'),
('Harry Potter: Prisoner of Azkaban'),
('Harry Potter: Goblet of Fire'),
('Harry Potter: Order of the Phoenix'),
('Harry Potter: Half-Blood Price'),
('Harry Potter: Deathly Hallows');
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

DROP TABLE IF EXISTS Furniture CASCADE;
create table Furniture(
    id    bigserial primary key,
    title varchar(255),
    price integer,
);

INSERT INTO products (title, price, description)
values ('Chair', 100),
values ('Table', 200),
values ('Sofa', 300),
values ('Сupboard', 400);

COMMIT;
