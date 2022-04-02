package com.lti.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.Dao.LoginDao;
import com.lti.beans.Login;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

		@Autowired
		private LoginDao logindao ;
		
	public LoginDao getLogindao() {
			return logindao;
		}

		public void setLogindao(LoginDao logindao) {
			this.logindao = logindao;
		}

	@Override
		public String addLogin(Login L) {
			//System.out.println("login service " +L);
			//String l=logindao.addLogin(L);
			// TODO Auto-generated method stub
			return logindao.addLogin(L);
		}

	
}
