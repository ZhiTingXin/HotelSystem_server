package data.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import other.ResultMessage;

public interface LoginDataService extends Remote {

	public ResultMessage confirm(String userId,String password)throws RemoteException;
}
