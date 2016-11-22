package data.dao.impl;

import java.util.ArrayList;
import PO.HotelStrategyPO;
import data.dao.HotelStrategyDao;
import other.ResultMessage;
import other.hibernateUtil;

public class HotelStrategyDaoImpl implements HotelStrategyDao {

	public ResultMessage add(HotelStrategyPO hotelstrategy) {
		try{
			hibernateUtil.add(hotelstrategy);
			return ResultMessage.SUCCESSFUL;
		}catch(Exception e){
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
	}

	public ResultMessage delete(HotelStrategyPO hotelstrategy) {
		try{
			hibernateUtil.delete(hotelstrategy);
			return ResultMessage.SUCCESSFUL;
		}catch(Exception e){
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
		
	}

	public ResultMessage modify(HotelStrategyPO hotelstartegy) {
		try{
			hibernateUtil.update(hotelstartegy);
			return ResultMessage.SUCCESSFUL;
		}catch(Exception e){
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
	}

	public HotelStrategyPO get(String hotelstrategyId) {
		HotelStrategyPO hotelstrategy = null;
		try{
			hotelstrategy = (HotelStrategyPO)hibernateUtil.findById(HotelStrategyPO.class, hotelstrategyId);
		    return hotelstrategy;
		}catch(Exception e){
		    return hotelstrategy;
		}
	}

	public ArrayList<HotelStrategyPO> getAll(String hotelId) {
		ArrayList<HotelStrategyPO> hotelstrategy = null;
		try{
			hotelstrategy = (ArrayList<HotelStrategyPO>)
					hibernateUtil.findbySome("hotelstrategypo", "hotelid", hotelId);
			return hotelstrategy;
		}catch(Exception e){
			e.printStackTrace();
			return hotelstrategy;
		}
	}

}
