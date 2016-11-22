package data.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.LoginPO;
import other.ResultMessage;

public interface RegisterDataService extends Remote {

	public ResultMessage add(LoginPO login) throws RemoteException;
}
