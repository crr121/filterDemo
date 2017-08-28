create table tbl_login (
log_id number primary key,
log_name varchar2(20) ,
log_pwd varchar2(30),
log_state number default 1
);
create sequence seq_log ;

insert into tbl_login values(seq_log.nextval,'admin','admin',1);

select * from tbl_login;