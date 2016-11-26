package data.service;

import PO.SystemStaffPO;

public interface SystemStaffDataService {
	public boolean addStaff(SystemStaffPO staffPO);
	public boolean updateStaff(SystemStaffPO staffPO);
	public boolean deleteStaff(SystemStaffPO staffPO);
	public SystemStaffPO findStaff(String staffID);
}
