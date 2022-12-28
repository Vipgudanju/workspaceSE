DROP TABLE TABLE_1 CASCADE CONSTRAINTS;

CREATE TABLE TABLE_1(
		guest_no                      		NUMBER(10)		 	NOT NULL,
		guest_name                    		VARCHAR2(50)		 NULL ,
		guest_date                    		DATE		 		NULL ,
		guest_email                   		VARCHAR2(50)		 NULL ,
		guest_homepage                		VARCHAR2(50)		 NULL ,
		guest_title                   		VARCHAR2(100)		 NULL ,
		guest_content                 		VARCHAR2(4000)		 NULL 
);



ALTER TABLE TABLE_1 ADD CONSTRAINT IDX_TABLE_1_PK PRIMARY KEY (guest_no);

