--guest
/*
�̸�             ��?       ����             
-------------- -------- -------------- 
GUEST_NO       NOT NULL NUMBER(10)     
GUEST_NAME              VARCHAR2(50)   
GUEST_DATE              DATE           
GUEST_EMAIL             VARCHAR2(50)   
GUEST_HOMEPAGE          VARCHAR2(50)   
GUEST_TITLE             VARCHAR2(100)  
GUEST_CONTENT           VARCHAR2(4000) 
*/
desc guest;

--insert

insert into guest values(guest_guest_no_seq.nextval,'�����',sysdate,'guard@gmail.com','http://www.itwill.co.kr','���ϻ���','����ó�� ����Ͻø�˴ϴ�.');
--pk update
update guest set guest_name='�̸�����',guest_date=sysdate,guest_email='change@gmail.com',guest_homepage='http://www.change.com',guest_title='Ÿ��Ʋ����',guest_content='���뺯��' where guest_no=1;

--pk delete 
delete from guest where guest_no=1;

select* from guest where guest_no=2;
select * from guest;