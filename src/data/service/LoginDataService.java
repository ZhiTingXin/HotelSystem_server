package data.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.LoginPO;

public interface LoginDataService extends Remote {

	public boolean confirm(String userId,String userPassword);
	
	public boolean add(LoginPO login);
	
	public boolean delete(LoginPO login);
	
	public boolean update(LoginPO login);
}
