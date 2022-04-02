package com.lti.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.Dao.RegisterDao;

@Service("registerService")
public class RegisterServiceImpl implements RegisterService {
	@Autowired
	 RegisterDao registerdao ;
	
	
	public RegisterDao getRegisterdao() {
		return registerdao;
	}


	public void setRegisterdao(RegisterDao registerdao) {
		this.registerdao = registerdao;
	}


	@Override
	public int addRegister(com.lti.beans.Register R) {
		System.out.println("register service " +R);
		int r=registerdao.addRegister(R);
		// TODO Auto-generated method stub
		return r;
	}


}
