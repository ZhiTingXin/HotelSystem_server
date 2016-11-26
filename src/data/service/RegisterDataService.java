package data.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.LoginPO;

public interface RegisterDataService extends Remote {

	public boolean add(LoginPO login) throws RemoteException;
}
