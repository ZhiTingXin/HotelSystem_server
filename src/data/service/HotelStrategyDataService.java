package data.service;

import java.rmi.Remote;
import java.util.ArrayList;

import PO.HotelStrategyPO;

public interface HotelStrategyDataService extends Remote {
	public boolean add(HotelStrategyPO hotelstrategy);
	public boolean delete(HotelStrategyPO hotelstrategy);
	public boolean modify(HotelStrategyPO hotelstartegy);
	public HotelStrategyPO get(String hotelstrategyId);
	public ArrayList<HotelStrategyPO> getAll(String hotelId);
}
