package data.service;

import java.rmi.Remote;
import java.util.ArrayList;

import PO.HotelPO;

public interface HotelDataService extends Remote{
	public boolean add(HotelPO hotel);
	public boolean del(HotelPO hotel);
	public HotelPO get(String hotelId);
	public ArrayList<HotelPO> getHotels(String strict,String type);
}
