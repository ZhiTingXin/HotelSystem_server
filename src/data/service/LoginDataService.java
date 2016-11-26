package data.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.LoginPO;
import other.ResultMessage;

public interface LoginDataService extends Remote {

	public ResultMessage confirm(String userId,String userPassword);
	
	public ResultMessage add(LoginPO login);
	
	public ResultMessage delete(LoginPO login);
	
	public ResultMessage update(LoginPO login);
}
