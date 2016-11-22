package data.dao;

import java.util.ArrayList;

import PO.HotelPO;
import other.ResultMessage;



public interface HotelDao {

	public ResultMessage add(HotelPO hotel);
	public ResultMessage del(HotelPO hotel);
	public HotelPO get(String hotelId);
	public ArrayList<HotelPO> getHotels(String strict,String type);
	
}
