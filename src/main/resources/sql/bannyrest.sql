

CREATE TABLE client (
  id INT NOT NULL,
  first_name    VARCHAR(30),
  last_name   VARCHAR(30),

  PRIMARY KEY(id)
);

CREATE SEQUENCE client_seq START WITH 1;

CREATE OR REPLACE TRIGGER client_on_insert
  BEFORE INSERT ON client
  FOR EACH ROW
BEGIN
  SELECT client_seq.nextval
  INTO :new.id
  FROM dual;
END;

select * from client;

INSERT INTO client (first_name, last_name) VALUES ('Tracey','Hanks');
INSERT INTO client (first_name, last_name) VALUES ('Joel','Vincent');
INSERT INTO client (first_name, last_name) VALUES ('Bruce','Welson');
INSERT INTO client (first_name, last_name) VALUES ('Jim','Hat');
INSERT INTO client (first_name, last_name) VALUES ('Theo','Pendle');
INSERT INTO client (first_name, last_name) VALUES ('Bruce','Wayne');

commit;