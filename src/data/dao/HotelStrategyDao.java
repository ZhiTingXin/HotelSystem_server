package data.dao;

import java.util.ArrayList;

import PO.HotelStrategyPO;
import other.ResultMessage;

public interface HotelStrategyDao {

	public ResultMessage add(HotelStrategyPO hotelstrategy);
	public ResultMessage delete(HotelStrategyPO hotelstrategy);
	public ResultMessage modify(HotelStrategyPO hotelstartegy);
	public HotelStrategyPO get(String hotelstrategyId);
	public ArrayList<HotelStrategyPO> getAll(String hotelId);
	
}
