package user_js;


public class userService_js {
	private userDao_js userDao;
	public userService_js() throws Exception{
		userDao=new userDao_js();
	}
	
	// 회원가입
	public int create(user_js user) throws Exception{
		//1.아이디중복체크
		if(userDao.countByUserId(user.getUser_id())>=1) {
			//중복
			return -1;
	}else {
		// 가입
		int rowCount = userDao.insert(user);
		return rowCount;
	}
	
 }
	
	// 회원로그인
	public int login(String user_id, String user_pw) throws Exception {
		// 0:실패, 1:성공
		int result=0;
		if(userDao.countByUserId(user_id)==1) {
			//아이디존재하는경우
			user_js loginUser = userDao.findByPrimaryKey(user_id);
			if(loginUser.getUser_pw().equals(user_pw)) {
				//패쓰워드일치
				result=1;
			}else {
				//패쓰워드불일치
				result=0;
			}
		}else {
			//회원이아닌경우
			result=0;
		}
		return result;
	}

	
	// 회원로그아웃
	public void logout() {
		// 로그아웃시 db작업이 필요하면 기술
	}
	
	// 로그인한 회원의 정보보기
	public user_js findUser(String userId) throws Exception {
		return userDao_js.findByPrimaryKey(user_id);
	}
	
	// 회원 수정
	public int update(user_js user)throws Exception{
		return userDao.update(user);
	}
	
	// 아이디 중복체크
	public boolean isDuplicateId(String userId) throws Exception{
		if(userDao.countByUserId(userId)>=1) {
			return true;
		}else {
			return false;
		}
	}
	
	// 회원탈퇴
	public int remove(String userId) throws Exception{
		return userDao.delete(userId);
	}
	
}
