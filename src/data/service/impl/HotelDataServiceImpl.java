package data.service.impl;

import java.rmi.RemoteException;
import java.util.ArrayList;

import PO.HotelPO;
import data.dao.DataFactory;
import data.dao.HotelDao;
import data.dao.impl.DataFactoryImpl;
import data.service.HotelDataService;

public class HotelDataServiceImpl implements HotelDataService{

	private DataFactory dataFactory;
	private HotelDao hotelDao;
	
	public HotelDataServiceImpl(){
		dataFactory = new DataFactoryImpl();
		hotelDao = dataFactory.getHotelDao();
	}
	public boolean add(HotelPO hotel) throws RemoteException {
		return hotelDao.add(hotel);
	}

	public boolean del(HotelPO hotel) throws RemoteException {
		return hotelDao.del(hotel);
	}

	public HotelPO get(String hotelId) throws RemoteException {
		return hotelDao.get(hotelId);
	}

	public ArrayList<HotelPO> getHotels(String strict, String type) throws RemoteException {
		// TODO Auto-generated method stub
		return hotelDao.getHotels(strict, type);
	}

	

}
