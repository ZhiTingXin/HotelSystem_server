package data.dao;

import PO.LoginPO;
import other.ResultMessage;

public interface LoginDao {

	public ResultMessage confirm(String userId,String userPassword);
	
	public ResultMessage add(LoginPO login);
	
	public ResultMessage delete(LoginPO login);
	
	public ResultMessage update(LoginPO login);
}
