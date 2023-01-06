package user_js;


public class userService_js {
	private userDao_js userDao;
	
	public userService_js() throws Exception {
		userDao = new userDao_js();
	}
	
	// 회원가입(아이디가 중복되는 경우에 메세지 뜸)
	public boolean adduser_js(user_js user) throws Exception {
		boolean isSuccess = false;
			// 아이디 존재여부체크(존재하면 메세지, 존재 안하면 가입)
		if(userDao.findByPrimaryKey(user.getUser_id()) == null) {
			int rowCount = userDao.insert(user);
			isSuccess = true;
		}else {
			isSuccess = false;
		}
		return isSuccess;
	}
	
	// 회원 로그인
	public int login(String user_id, String user_pw) throws Exception {
		// 0:성공, 1:아이디 존재x, 2:패스워드 불일치
		int loginResult = -999;
		user_js finduser_js = userDao.findByPrimaryKey(user_id);
		if(finduser_js == null) {
			loginResult = 1;
		} else {
			// 아이디 존재
			if(user_pw.equals(finduser_js.getUser_pw())) {
				// 패스워드 일치
				loginResult = 0;
			}else {
				// 패스워드 불일치
				loginResult = 2;
			}
		}
		return loginResult;
	}
	
	
	// 회원아이디 중복체크
	public  boolean isDuplicateId(String user_id)throws Exception {
		user_js finduser_js=userDao.findByPrimaryKey(user_id);
		if(finduser_js == null) {
			return false;
		}else {
			return true;
		}
	}
	
	
	// 회원 상세히 보기
	public user_js memberDetail(String user_id) throws Exception{
		return userDao.findByPrimaryKey(user_id);
	}
	
	// 회원아이디 수정
	public int user_jsUpdate(user_js user) throws Exception {
		return userDao.update(user);
	}
	
	
	
}
