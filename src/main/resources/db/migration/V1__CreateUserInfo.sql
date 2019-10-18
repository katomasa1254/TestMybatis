-- Table: public.login_user_info

-- DROP TABLE public.login_user_info;

CREATE TABLE public.login_user_info
(
    pw text COLLATE pg_catalog."default",
    user_id text COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT login_user_info_pkey PRIMARY KEY (user_id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.login_user_info
    OWNER to postgres;
    