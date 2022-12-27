-- insert

insert into address values(address_no_SEQ.nextval, '장원영', '123-4567', '경기도 구리시');
insert into address values(address_no_SEQ.nextval, '안유진', '123-4568', '경기도 성남시');
insert into address values(address_no_SEQ.nextval, '사쿠라', '123-4569', '경기도 안양시');
insert into address values(address_no_SEQ.nextval, '허윤진', '123-4565', '경기도 남양주시');
insert into address values(address_no_SEQ.nextval, '윤보미', '123-4565', '경기도 하남시');
insert into address values(address_no_SEQ.nextval, '박초롱', '123-4565', '경기도 안산시');
insert into address values(address_no_SEQ.nextval, '정은지', '123-4565', '경기도 평택시');
insert into address values(address_no_SEQ.nextval, '오하영', '123-4565', '경기도 수원시');
insert into address values(address_no_SEQ.nextval, '김남주', '123-4565', '경기도 시흥시');

-- update(pk update)
update address set name = '박규리', phone = '123-4567', address = '서울시 강동구' where no = 6;

-- delete(pk delete)
delete address where no = 1;

-- select(pk select )
select no, name, phone, address
from address
where no = 3;

-- select (all select)
select no, name, phone, address 
from address;