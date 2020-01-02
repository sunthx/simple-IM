CREATE TABLE t_user (
    id      VARCHAR(255)    NOT NULL,
    name    VARCHAR(255)    NOT NULL,
    avatar  VARCHAR(255),
    PRIMARY KEY (id)
)

CREATE TABLE t_message(
    id              VARCHAR(255)        NOT NULL,
    create_time     TIMESTAMP,
    update_time     TIMESTAMP,
    content         VARCHAR(255)        NOT NULL,
    sender_id       VARCHAR(255)        NOT NULL,
    group_id        VARCHAR(255)        NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE t_chat_group(
    id              VARCHAR(255)        NOT NULL,
    create_time     TIMESTAMP,
    update_time     TIMESTAMP,
    name            VARCHAR(255)        NOT NULL ,
    owner           VARCHAR(255)        NOT NULL ,
    PRIMARY KEY (id)
)
