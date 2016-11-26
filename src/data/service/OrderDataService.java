package data.service;

import java.rmi.Remote;
import java.util.List;

import PO.OrderPO;

public interface OrderDataService extends Remote {
	public boolean add(OrderPO order);
	public boolean update(OrderPO order);
	public boolean dalete(OrderPO order);
	public OrderPO findorder(String orderId);
	public List<OrderPO> findOrders(String userId,String type);
}
