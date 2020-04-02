package blog.root.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import blog.root.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

	@Inject
	private UserMapper mapper;

	@Override
	public int Singup(String id, String pw, String email, String nickname) throws Exception {
		return mapper.Singup(id, pw, email, nickname);
	}

	@Override
	public int Login(String id, String pw) throws Exception {
		// TODO Auto-generated method stub
		return mapper.Login(id, pw);
	}

	@Override
	public String nicknameCheck(String nickname) throws Exception {
		// TODO Auto-generated method stub
		return mapper.nicknameCheck(nickname);
	}

	@Override
	public String idCheck(String id) throws Exception {
		// TODO Auto-generated method stub
		return mapper.idCheck(id);
	}

	@Override
	public String emailCheck(String email) throws Exception {
		return mapper.emailCheck(email);
	}

}
