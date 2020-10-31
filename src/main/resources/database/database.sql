DROP SCHEMA IF EXISTS ajax CASCADE;
DROP TABLE IF EXISTS ajax.users;

DROP SEQUENCE IF EXISTS ajax.users_id_seq;

CREATE SCHEMA ajax;

CREATE SEQUENCE IF NOT EXISTS ajax.users_id_seq START WITH 1 increment by 1;

CREATE TABLE IF NOT EXISTS ajax.users (
 id bigint NOT NULL DEFAULT nextval('ajax.users_id_seq'::regclass),
 enabled boolean NOT NULL DEFAULT true,
 username VARCHAR (255) NOT NULL,
 password VARCHAR (255) NOT NULL,
 CONSTRAINT users_pkey PRIMARY KEY (id)
);

INSERT INTO ajax.users (id, enabled, username, password)
VALUES (DEFAULT,DEFAULT,'admin', '{noop}admin'),
       (DEFAULT,DEFAULT,'user','{noop}user'),
       (DEFAULT,DEFAULT,'user1','{noop}user1'),
       (DEFAULT,DEFAULT,'user2','{noop}user2');

