package data.service;

import PO.SystemManagerPO;

public interface SystemManagerDataService {
	public SystemManagerPO findManager(String managerID);
	public boolean addManager(SystemManagerPO managerPO);
	public boolean deleteManager(String managerID);
	public boolean updateManager(SystemManagerPO managerPO);
}
