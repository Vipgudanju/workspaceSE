package user_js;

public class userSQL_js {
	public static final String  MEMBER_INSERT=
			"insert into member(user_id,user_pw, user_name, user_phone, user_address, user_email) values(?,?,?,?,?,?)";
			
			public static final String  MEMBER_UPDATE=
			"update user_js set user_pw=?,user_name=?,user_phone=?,user_address=?,user_email=? where user_id=?";
			
			public static final String  MEMBER_DELETE=
			"delete from user where user_id=?";
			
			public static final String  MEMBER_SELECT_BY_ID=
			"select user_id, user_pw, user_name, user_phone, user_address, user_email,m_regdate from member where user_id=?";
			
			public static final String  MEMBER_SELECT_ALL=
			"select user_id,user_pw, user_name, user_phone, user_address, user_email from user_js";
}
