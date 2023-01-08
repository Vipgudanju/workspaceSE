package com.itwill.test;

import javax.swing.JOptionPane;

import com.itwill.User.User;
import com.itwill.User.UserService;

public class UserServiceTestMain {

	public static void main(String[] args) throws Exception{
		UserService userService = new UserService();
		System.out.println("1. 회원가입");
		boolean addSuccess1 = 
							userService.addUser(new User("book5", "5555","장원영","010-5555-5555","경기도 구리시", "book5@korea.com"));
		if(addSuccess1) {
			System.out.println("로그인화면으로 이동");
		}else {
			JOptionPane.showMessageDialog(null, "중복된아이디입니다.");
		}
		boolean addSuccess2 = 
							userService.addUser(new User("book6", "6666","안유진","010-6666-6666","경기도 남양주시", "book6@korea.com"));
		if(addSuccess2) {
			System.out.println("로그인화면으로 이동");
		}else {
			JOptionPane.showMessageDialog(null, "중복된아이디입니다.");
		}
	
		System.out.println("2.login");
		System.out.println(">>>" + userService.login("book1", "1111"));
		System.out.println(">>>" + userService.login("book1", "1212"));
		System.out.println(">>>" + userService.login("book5", "5555"));
		System.out.println();
		System.out.println("3.duplicateId:");
		System.out.println(">>>" +userService.isDuplicateId("book1"));
		System.out.println(">>>" +userService.isDuplicateId("book2"));
	
	}
	

}
