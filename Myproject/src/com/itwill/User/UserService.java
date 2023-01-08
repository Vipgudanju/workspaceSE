package com.itwill.User;

public class UserService {
	private UserDao userDao;
	
	public UserService() throws Exception{
		userDao = new UserDao();
	}
	
	/*
	 * 회원가입(아이디가 중복되는 경우에는 메세지를 띄운다.)
	 */
	public boolean addUser(User user) throws Exception{
		boolean isSuccess = false;
		
		// 아이디 존재여부 체크(존재하면 메시지, 존재X-> 가입)
		if(userDao.findByPrimaryKey(user.getUser_id()) == null) {
			int rowCount = userDao.insert(user);
			isSuccess = true;
		}else {
			isSuccess = false;
		}
		return isSuccess;
	}
	
	/*
	 * 회원 로그인
	 */
	public int login(String user_id, String user_pw) throws Exception{
		/*
		 * 0: 성공 , 1: 아이디 존재 x , 2: 패스워드 불일치
		 */
		int loginResult = -9999;
		User findUser = userDao.findByPrimaryKey(user_id);
		if(findUser == null) {
			// 아이디 존재 x
			loginResult = 1;
		}else {
			// 아이디 존재 O
			if(user_pw.equals(findUser.getUser_pw())) {
				// 패스워드 일치
				loginResult = 0;
			}else {
				// 패스워드 불일치
				loginResult = 2;
			}
		}
		return loginResult;
	}
	
	
	/*
	 * 회원아이디 중복체크(추가 기능)
	 */
	public boolean isDuplicateId(String user_id) throws Exception {
		User findUser = userDao.findByPrimaryKey(user_id);
		if(findUser == null) {
			return false;
		}else {
			return true;
		}
	}
	
	
	/*
	 * 회원패스워드 중복체크(추가 기능)
	 */
	public boolean isDuplicatePw(String user_pw) throws Exception{
		User findUser = userDao.findByPrimaryKey(user_pw);
		if(findUser == null) {
			return false;
		}else {
			return true;
		}
	}
	
	
	/*
	 * 이메일 중복체크(추가 기능)
	 */
	public boolean isDuplicateEmail(String user_email) throws Exception {
		User findUser = userDao.findByPrimaryKey(user_email);
		if(findUser == null) {
			return false;
		}else {
			return true;
		}
	}
	
	
	/*
	 * 회원상세 보기
	 */
	public User userDetail(String user_id) throws Exception {
		return userDao.findByPrimaryKey(user_id);
	}
	
	
	
	
}
