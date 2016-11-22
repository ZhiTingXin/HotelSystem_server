package data.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import PO.SystemStrategyPO;
import other.ResultMessage;

public interface SystemStrategyDataService extends Remote {

	public ResultMessage add(SystemStrategyPO systemstrategy)throws RemoteException;
	public ResultMessage delete(SystemStrategyPO systemstrategy)throws RemoteException;
	public ResultMessage modify(SystemStrategyPO systemstrategy)throws RemoteException;
}
