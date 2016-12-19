-- sequence

drop sequence user_seq;

create sequence user_seq
start with 1
increment by 1
maxvalue 9999999999;

drop sequence blog_seq;

create sequence blog_seq
start with 1
increment by 1
maxvalue 9999999999;