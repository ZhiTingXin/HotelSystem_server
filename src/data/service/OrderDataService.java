package data.service;

import java.rmi.Remote;
import java.util.List;

import PO.OrderPO;
import other.ResultMessage;

public interface OrderDataService extends Remote {
	public ResultMessage add(OrderPO order);
	public ResultMessage update(OrderPO order);
	public ResultMessage dalete(OrderPO order);
	public OrderPO findorder(String orderId);
	public List<OrderPO> findOrders(String userId,String type);
}
