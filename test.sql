CREATE DATABASE registration;

\c registration;

create table app_user ( id int8 not null, app_user_role varchar(255),
    email varchar(255), enabled boolean, locked boolean, first_name varchar(255),
    last_name varchar(255), password varchar(255), username varchar(255) );

create table confirmation_token (id int8 not null,confirmed_at date, created_at date, expires_at date, token varchar(255), app_user_id int8 not null );

INSERT INTO app_user ( id, app_user_role, email, enabled, first_name, last_name, locked, password, username)VALUES (  1, 'ADMIN', 'admin@admin.com', true , 'admin', 'admin', false, '$2a$12$07F5909VcxNf89c5phIUteTAdM2ehd4shN8kD4e63z54HrFZIqtzK', 'admin');