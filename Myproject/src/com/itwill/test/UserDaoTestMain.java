package com.itwill.test;

import com.itwill.User.User;
import com.itwill.User.UserDao;

public class UserDaoTestMain {

	public static void main(String[] args) throws Exception{
		UserDao userDao = new UserDao();
		System.out.println("0.delete   --> "+userDao.delete("book1"));
		System.out.println("1.insert   --> "+userDao.insert(new User("book1", "4444", "장원영", "010-4444-4444", "경기도 구리시", "book4@korea.com")));
		System.out.println("2.update   --> "+userDao.update(new User("book1", "3333", "윤보미", "010-3434-3434", "서울시 중랑구", "book5@korea.com")));
		System.out.println("3.selectById-> "+userDao.findByPrimaryKey("book1"));
		System.out.println("4.selectAll--> "+userDao.findAll());
	}

}
