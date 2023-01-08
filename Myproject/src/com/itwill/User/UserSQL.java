package com.itwill.User;

public class UserSQL {
	public static final String  USER_INSERT=
			"insert into User(user_id,user_pw, user_name, user_phone, user_address, user_email) values(?,?,?,?,?,?)";
			
			public static final String  USER_UPDATE=
			"update user_js set user_pw=?,user_name=?,user_phone=?,user_address=?,user_email=? where user_id=?";
			
			public static final String  USER_DELETE=
			"delete from user where user_id=?";
			
			public static final String  USER_SELECT_BY_ID=
			"select user_id, user_pw, user_name, user_phone, user_address, user_email,m_regdate from User where user_id=?";
			
			public static final String  USER_SELECT_ALL=
			"select user_id,user_pw, user_name, user_phone, user_address, user_email from User";
}
