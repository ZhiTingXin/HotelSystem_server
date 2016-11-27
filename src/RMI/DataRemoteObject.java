package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import PO.AdviceFeedBackPO;
import PO.HotelPO;
import PO.HotelStrategyPO;
import PO.LoginPO;
import PO.OrderPO;
import PO.SystemStrategyPO;
import data.service.AdviceFeedBackDataService;
import data.service.HotelDataService;
import data.service.HotelStrategyDataService;
import data.service.LoginDataService;
import data.service.OrderDataService;
import data.service.SystemStrategyDataService;
import data.service.impl.AdviceFeedBackDataServiceImpl;
import data.service.impl.HotelDataServiceImpl;
import data.service.impl.HotelStrategyDataServiceImpl;
import data.service.impl.LoginDataServiceImpl;
import data.service.impl.OrderDataServiceImpl;
import data.service.impl.SystemStrategyDataServiceImpl;

public class DataRemoteObject extends UnicastRemoteObject implements LoginDataService
,OrderDataService,HotelStrategyDataService,SystemStrategyDataService,HotelDataService,AdviceFeedBackDataService{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private LoginDataService login;
	private OrderDataService orderdata;
	private HotelStrategyDataService hotelstrategy;
	private SystemStrategyDataService systemstrategy;
	private HotelDataService hotel;
	private AdviceFeedBackDataService advice;
	protected DataRemoteObject() throws RemoteException {
		login = new LoginDataServiceImpl();
		orderdata = new OrderDataServiceImpl();
		hotelstrategy = new HotelStrategyDataServiceImpl();
		systemstrategy = new SystemStrategyDataServiceImpl();
		hotel = new HotelDataServiceImpl();
		advice = new AdviceFeedBackDataServiceImpl();
	}
	public boolean addAdvice(AdviceFeedBackPO advicefeedback) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean updateAdvice(AdviceFeedBackPO advicefeedback) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public ArrayList<AdviceFeedBackPO> getAdvices(String userId, String type) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean add(HotelPO hotel) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean del(HotelPO hotel) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public boolean update(HotelPO hotel) {
		// TODO Auto-generated method stub
		return false;
	}
	public ArrayList<HotelPO> getHotels(String strict, String type) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean add(SystemStrategyPO systemstrategy) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean delete(SystemStrategyPO systemstrategy) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean modify(SystemStrategyPO systemstrategy) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean add(HotelStrategyPO hotelstrategy) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean delete(HotelStrategyPO hotelstrategy) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean modify(HotelStrategyPO hotelstartegy) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public ArrayList<HotelStrategyPO> getAll(String hotelId) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean add(OrderPO order) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean update(OrderPO order) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean dalete(OrderPO order) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public OrderPO findorder(String orderId) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	public List<OrderPO> findOrders(String userId, String type) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean confirm(String userId, String userPassword) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean add(LoginPO login) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean delete(LoginPO login) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean update(LoginPO login) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
	public HotelPO find(String hotelId) {
		// TODO Auto-generated method stub
		return null;
	}
	public HotelStrategyPO get(String hotelstrategyId) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}
	public SystemStrategyPO getSstrategy(String strategyName) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	

}
