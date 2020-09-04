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