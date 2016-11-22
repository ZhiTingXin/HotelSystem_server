package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import PO.AdviceFeedBackPO;
import PO.LoginPO;
import PO.SystemStrategyPO;
import data.service.AdviceFeedBackDataService;
import data.service.HotelDataService;
import data.service.HotelStrategyDataService;
import data.service.LoginDataService;
import data.service.OrderDataService;
import data.service.RegisterDataService;
import data.service.SystemStrategyDataService;
import data.service.impl.AdviceFeedBackDataServiceImpl;
import data.service.impl.HotelDataServiceImpl;
import data.service.impl.HotelStrategyDataServiceImpl;
import data.service.impl.LoginDataServiceImpl;
import data.service.impl.OrderDataServiceImpl;
import data.service.impl.RegisterDataServiceImpl;
import data.service.impl.SystemStrategyDataServiceImpl;
import other.ResultMessage;

public class DataRemoteObject extends UnicastRemoteObject implements RegisterDataService,LoginDataService
,OrderDataService,HotelStrategyDataService,SystemStrategyDataService,HotelDataService,AdviceFeedBackDataService{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RegisterDataService register;
	private LoginDataService login;
	private OrderDataService orderdata;
	private HotelStrategyDataService hotelstrategy;
	private SystemStrategyDataService systemstrategy;
	private HotelDataService hotel;
	private AdviceFeedBackDataService advice;
	protected DataRemoteObject() throws RemoteException {
		register = new RegisterDataServiceImpl();
		login = new LoginDataServiceImpl();
		orderdata = new OrderDataServiceImpl();
		hotelstrategy = new HotelStrategyDataServiceImpl();
		systemstrategy = new SystemStrategyDataServiceImpl();
		hotel = new HotelDataServiceImpl();
		advice = new AdviceFeedBackDataServiceImpl();
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
	public ResultMessage add(SystemStrategyPO systemstrategy) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	public ResultMessage delete(SystemStrategyPO systemstrategy) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	public ResultMessage modify(SystemStrategyPO systemstrategy) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	public ResultMessage confirm(String userId, String password)throws RemoteException {
		// TODO Auto-generated method stub
		return login.confirm(userId, password);
	}
	public ResultMessage add(LoginPO login)throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	

}
