package data.service.impl;

import java.rmi.RemoteException;

import PO.LoginPO;
import data.dao.LoginDao;
import data.dao.impl.LoginDaoImpl;
import data.service.LoginDataService;


public class LoginDataServiceImpl implements LoginDataService{
    LoginDao login;
    
    public LoginDataServiceImpl(){
    	login = new LoginDaoImpl();
    }

	public boolean confirm(String userId, String userPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean add(LoginPO login) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(LoginPO login) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(LoginPO login) {
		// TODO Auto-generated method stub
		return false;
	}
    
	

}
