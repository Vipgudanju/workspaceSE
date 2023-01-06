package user_js;

public class userSQL_js {
	public static final String  USER_JS_INSERT=
			"insert into user_js(user_id,user_pw, user_name, user_phone, user_address, user_email) values(?,?,?,?,?,?)";
			
			public static final String  USER_JS_UPDATE=
			"update user_js set user_pw=?,user_name=?,user_phone=?,user_address=?,user_email=? where user_id=?";
			
			public static final String  USER_JS_DELETE=
			"delete from user where user_id=?";
			
			public static final String  USER_JS_SELECT_BY_ID=
			"select user_id, user_pw, user_name, user_phone, user_address, user_email,m_regdate from user_js where user_id=?";
			
			public static final String  USER_JS_SELECT_ALL=
			"select user_id,user_pw, user_name, user_phone, user_address, user_email from user_js";
}
