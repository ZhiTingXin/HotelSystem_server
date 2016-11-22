package data.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import PO.AdviceFeedBackPO;
import other.ResultMessage;

public interface AdviceFeedBackDataService extends Remote{

	public ResultMessage addAdvice(AdviceFeedBackPO advicefeedback)throws RemoteException;
	public ResultMessage modiffiAdvice(AdviceFeedBackPO advicefeedback)throws RemoteException;
	public ArrayList<AdviceFeedBackPO> getAll(String userId)throws RemoteException;
	public ArrayList<AdviceFeedBackPO> getUnProcessed(String staffId)throws RemoteException;
	public ArrayList<AdviceFeedBackPO> getProcessed(String staffId)throws RemoteException;
	
}
