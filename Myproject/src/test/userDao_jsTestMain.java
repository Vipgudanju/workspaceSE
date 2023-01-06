package test;

import user_js.userDao_js;
import user_js.user_js;

public class userDao_jsTestMain {

	public static void main(String[] args) throws Exception{
		userDao_js userDao=new userDao_js();
		//System.out.println("0.delete   --> "+userDao.delete("book1"));
		System.out.println("1.insert   --> "+userDao.insert(new user_js("book4", "4444", "장원영", "010-4444-4444", "경기도 구리시", "book4@korea.com")));
		System.out.println("2.update   --> "+userDao.update(new user_js("book3", "3333", "윤보미", "010-3434-3434", "서울시 중랑구", "book5@korea.com")));
		//System.out.println("3.selectById-> "+userDao.findByPrimaryKey("book1"));
		//System.out.println("4.selectAll--> "+userDao.findAll());

	}

}
