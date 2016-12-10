CREATE TABLE USER (
  USER_ID       BIGINT              NOT NULL AUTO_INCREMENT,
  NAME          VARCHAR(255) UNIQUE NOT NULL,
  PASSWORD_HASH VARCHAR(255)        NOT NULL,
  PRIMARY KEY (USER_ID)
)
