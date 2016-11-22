package data.dao;

import java.util.List;

import PO.OrderPO;
import other.ResultMessage;
public interface OrderDao {

	public ResultMessage add(OrderPO order);
	public ResultMessage update(OrderPO order);
	public ResultMessage dalete(OrderPO order);
	public OrderPO findorder(String orderId);
	public List<OrderPO> findOrders(String userId,String type);
	
}
