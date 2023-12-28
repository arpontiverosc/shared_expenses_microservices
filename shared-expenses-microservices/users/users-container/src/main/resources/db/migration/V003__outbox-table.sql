CREATE TABLE outbox (
  id varchar(50) NOT NULL,
  aggregate varchar(50) NOT NULL UNIQUE,
  operation varchar(50) NOT NULL,
  message varchar(2000) NOT NULL
);

ALTER TABLE outbox ADD CONSTRAINT outbox_pk PRIMARY KEY (id);