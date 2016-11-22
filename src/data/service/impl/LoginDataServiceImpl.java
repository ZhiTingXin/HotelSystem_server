package data.service.impl;

import java.rmi.RemoteException;

import data.dao.LoginDao;
import data.dao.impl.LoginDaoImpl;
import data.service.LoginDataService;
import other.ResultMessage;

public class LoginDataServiceImpl implements LoginDataService{
    LoginDao login;
    
    public LoginDataServiceImpl(){
    	login = new LoginDaoImpl();
    }
    
	public ResultMessage confirm(String userId, String password)throws RemoteException {
		return login.confirm(userId, password);
	}

}
