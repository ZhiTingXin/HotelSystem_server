package testAll;

import static org.junit.Assert.assertEquals;

import java.rmi.RemoteException;

import org.junit.Test;
import PO.LoginPO;
import data.dao.impl.LoginDaoImpl;
import data.service.LoginDataService;
import data.service.impl.LoginDataServiceImpl;
import other.ResultMessage;

public class Testlogin {
	LoginDataService a;
	
	@Test
	public void testAdd() throws RemoteException{
		a = new LoginDataServiceImpl();
		LoginPO login = new LoginPO("151250170","xzt970828");
//		login.setId(151255654);
//		login.setUserPassword("helloword");
		assertEquals(ResultMessage.SUCCESSFUL,a.confirm("151250170", "xzt970828"));
	}
//	@Test
//	public void testCofirm(){
//		int id = 151250170;
//		String password = "helloword";
//		assertEquals(true, logindao.confirm(id, password));
//	}
////	@Test 
////	public void testdele(){
////		Login login = new Login(151250170,"helloword");
////		assertEquals(true,logindao.delete(login));
////	}
//	@Test
//	public void testup(){
//		Login lo = new  Login(151250170,"123");
//		assertEquals(true,logindao.update(lo));
//	}
}
