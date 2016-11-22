package data.dao;

import PO.SystemManagerPO;

public interface SystemManagerDao {
	public SystemManagerPO findManager(String managerID);
	public boolean addManager(SystemManagerPO managerPO);
	public boolean deleteManager(String managerID);
	public boolean updateManager(SystemManagerPO managerPO);
}
