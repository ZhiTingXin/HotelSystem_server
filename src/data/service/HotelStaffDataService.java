package data.service;

import PO.HotelStaffPO;

public interface HotelStaffDataService {
	public boolean addStaff(HotelStaffPO staffPO);
	public boolean updateStaff(HotelStaffPO staffPO);
	public boolean deleteStaff(HotelStaffPO staffPO);
	public HotelStaffPO findStaff(String staffID);
}
