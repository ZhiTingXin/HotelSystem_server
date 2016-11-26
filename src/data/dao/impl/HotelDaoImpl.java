package data.dao.impl;

import java.util.ArrayList;
import java.util.List;

import PO.HotelPO;
import data.dao.HotelDao;
import other.hibernateUtil;

public class HotelDaoImpl implements HotelDao{

	public boolean add(HotelPO hotel) {
		try{
			hibernateUtil.add(hotel);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean del(HotelPO hotel) {
		if(hotel==null){
			return false;
		}
		try{
			hibernateUtil.delete(hotel);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
		
	}

	public HotelPO get(String hotelId) {
		HotelPO hotel = null;
		try{
			hotel=(HotelPO)hibernateUtil.findById(HotelPO.class, hotelId);
			return hotel;
		}catch(Exception e){
			e.printStackTrace();
			return hotel;
		}
	}

	public ArrayList<HotelPO> getHotels(String strict, String type) {
		ArrayList<HotelPO> list = null;
		try{
			list = (ArrayList<HotelPO>)hibernateUtil.findbySome("Hotel", type, strict);
			return list;
		}catch(Exception e){
			e.printStackTrace();
			return list;
		}
	}
	

}
