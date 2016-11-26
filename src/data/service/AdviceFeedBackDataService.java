package data.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import PO.AdviceFeedBackPO;

public interface AdviceFeedBackDataService extends Remote{

	public boolean addAdvice(AdviceFeedBackPO advicefeedback)throws RemoteException;
	public boolean modiffiAdvice(AdviceFeedBackPO advicefeedback)throws RemoteException;
	public ArrayList<AdviceFeedBackPO> getAll(String userId)throws RemoteException;
	public ArrayList<AdviceFeedBackPO> getUnProcessed(String staffId)throws RemoteException;
	public ArrayList<AdviceFeedBackPO> getProcessed(String staffId)throws RemoteException;
	
}
