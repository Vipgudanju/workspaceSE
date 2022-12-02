package com.itwill03;
public class BookMember {

	/*
	- 캡슐화
	
	<<속성>>
	 회원번호
	 회원이름
	 전화번호
	 빌린책
	*/
	private int no;
	private String name;
	private int num;
	private Book books;
	
	public void BookmMember() {
		
	}
	
	
	public BookMember(int no, String name, int num, Book books) {
		super();
		this.no = no;
		this.name = name;
		this.num = num;
		this.books = books;
	}


	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Book getBooks() {
		return books;
	}

	public void setBooks(Book books) {
		this.books = books;
	}
	
	
	
	/*
	<<기능>>
	  회원정보출력 
	 */
}
 