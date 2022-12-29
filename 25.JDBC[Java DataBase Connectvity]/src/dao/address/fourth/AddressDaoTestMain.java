package dao.address.fourth;

import java.util.List;

public class AddressDaoTestMain {

	public static void main(String[] args) throws Exception{
		/*
		
		 */
		AddressDao4 addressDao=new AddressDao4();
		System.out.println("1.insert");
		Address newAddress=
				new Address(0, "허영지", "111-3333", "대구시민");
		int rowCount=addressDao.insert(newAddress);
		System.out.println(">> insert row count:"+ rowCount);
		System.out.println("2.update");
		Address updateAddress=
				new Address(10, "오주원", "000-0000", "주소변경");
		rowCount=addressDao.update(updateAddress);
		System.out.println(">> update row count:"+ rowCount);
		System.out.println("3.delete");
		rowCount=addressDao.delete(16);
		System.out.println(">> delete row count:"+ rowCount);
		System.out.println("3.findByPrimaryKey");
		Address findAddress=addressDao.findByPrimaryKey(10);
		if(findAddress!=null) {
			System.out.println(">> "+findAddress);
		}else {
			System.out.println(">> 조건에 만족하는 주소록 존재안함");
		}
		System.out.println(">>"+addressDao.findByPrimaryKey(1));
		System.out.println(">>"+addressDao.findByPrimaryKey(2));
		System.out.println(">>"+addressDao.findByPrimaryKey(3));
		
		System.out.println("4.findAll");
		List<Address> addressList=
				addressDao.findAll();
		System.out.println(addressList);
		
	}

}