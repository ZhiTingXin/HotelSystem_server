package data.service;

import PO.CustomerPO;

public interface CustomerDataService {
	public boolean addCustomer(CustomerPO customer);
	public boolean deleteCustomer(CustomerPO customer);
	public boolean updateCustomer(CustomerPO customer);
	public CustomerPO findCustomer(String customerID);
}
