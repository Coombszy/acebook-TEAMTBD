DROP TABLE IF EXISTS posts;

CREATE TABLE posts (
  id bigserial PRIMARY KEY,
  name VARCHAR(64) NOT NULL,
  content varchar(250) NOT NULL
);
