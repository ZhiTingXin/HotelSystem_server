package testAll;

import java.util.Date;

//import java.util.List;
import PO.OrderPO;
import data.dao.impl.OrderDaoImpl;
import other.OrderState;
import other.ResultMessage;

public class OrderTs {

	public static void main(String[] args){
		OrderDaoImpl ord = new OrderDaoImpl();
		OrderPO order = new OrderPO("1512503","256","566",OrderState.UNFINISHED,new Date(),new Date(),"∂©µ•–≈œ¢",123);
		ResultMessage a = ord.add(order);
		System.out.println(a);
//		System.out.println(a);
//		List<OrderPO> or = ord.findOrders("151250170","id");
//		System.out.println(or.size());
//		System.out.println(or.get(0).getEntryTime());
	}
}
