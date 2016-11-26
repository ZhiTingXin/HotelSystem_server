package data.service;

import java.rmi.Remote;
import java.util.ArrayList;

import PO.HotelPO;
import other.ResultMessage;

public interface HotelDataService extends Remote{
	public ResultMessage add(HotelPO hotel);
	public ResultMessage del(HotelPO hotel);
	public HotelPO get(String hotelId);
	public ArrayList<HotelPO> getHotels(String strict,String type);
}
