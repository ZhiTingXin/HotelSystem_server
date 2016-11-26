package data.service.impl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.enterprise.inject.New;

import PO.AdviceFeedBackPO;
import data.dao.AdviceFeedbackDao;
import data.dao.impl.AdviceFeedbackDaoImpl;
import data.service.AdviceFeedBackDataService;
import other.ResultMessage;

public class AdviceFeedBackDataServiceImpl implements AdviceFeedBackDataService {
	
	AdviceFeedbackDao adviceFeedbackDao;
			
 	public AdviceFeedBackDataServiceImpl(){
		adviceFeedbackDao = new AdviceFeedbackDaoImpl();
	}
	
	public ResultMessage addAdvice(AdviceFeedBackPO advicefeedback) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage modiffiAdvice(AdviceFeedBackPO advicefeedback) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<AdviceFeedBackPO> getAll(String userId) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<AdviceFeedBackPO> getUnProcessed(String staffId) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<AdviceFeedBackPO> getProcessed(String staffId) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
