-- insert

insert into address values(address_no_SEQ.nextval, '장원영', '123-4567', '경기도 구리시');
insert into address values(address_no_SEQ.nextval, '안유진', '123-4568', '경기도 성남시');
insert into address values(address_no_SEQ.nextval, '사쿠라', '123-4569', '경기도 안양시');


-- update(pk update)
update address set name = '류주현', phone = '899-9900', address = '경기도 수원시' where no = 1;

-- delete(pk delete)
-- select(pk select )
-- select (all select)
select no, name, phone, address 
from address;