package data.dao.impl;

import java.util.List;

import PO.OrderPO;
import data.dao.OrderDao;
import other.ResultMessage;
import other.hibernateUtil;

public class OrderDaoImpl implements OrderDao{

	public OrderDaoImpl(){
		
	}
	public ResultMessage add(OrderPO order) {
		try{
			hibernateUtil.add(order);
			return ResultMessage.SUCCESSFUL;
		}catch(Exception e){
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
	}

	public ResultMessage update(OrderPO order) {
		try{
			hibernateUtil.update(order);
			return ResultMessage.SUCCESSFUL;
		}catch(Exception e){
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
	}

	public ResultMessage dalete(OrderPO order) {
		try{
			hibernateUtil.delete(order);
			return ResultMessage.SUCCESSFUL;
		}catch(Exception e){
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
	}

	public OrderPO findorder(String orderId) {
		OrderPO order = null;
		try{
			order =(OrderPO)hibernateUtil.findById(OrderPO.class, orderId);
			return order;
		}catch(Exception e){
			e.printStackTrace();
			return order;
		}
	}

	//获取某个用户的所有订单
	public List<OrderPO> findOrders(String userId,String type) {
		List<OrderPO> orderL = null;
		try{
		   orderL =hibernateUtil.findbySome("Order",type,userId);
		   return orderL;
		}catch(Exception e){
			e.printStackTrace();
			return orderL;
		}
	}

	
}
