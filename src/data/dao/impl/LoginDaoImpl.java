package data.dao.impl;


import PO.LoginPO;
import data.dao.LoginDao;
import other.ResultMessage;
import other.hibernateUtil;

public class LoginDaoImpl implements LoginDao{

	public LoginDaoImpl(){
		
	}
	
	public ResultMessage confirm(String userId, String userPassword) {
		LoginPO login =  (LoginPO)hibernateUtil.findById(LoginPO.class, userId);
		if(login!=null){
			if(login.getUserPassword().equals(userPassword)){
				return ResultMessage.SUCCESSFUL;
			}else{
				return ResultMessage.FAILED;
			}
		}else{
			return ResultMessage.FAILED;
		}
	}
	public ResultMessage add(LoginPO login) {
		try{
			hibernateUtil.add(login);
			return ResultMessage.SUCCESSFUL;
		}catch(Exception e){
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
	}
	public ResultMessage delete(LoginPO login) {
		try{
			hibernateUtil.delete(login);
			return ResultMessage.SUCCESSFUL;
		}catch(Exception e){
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
	}

	public ResultMessage update(LoginPO login) {
		try{
			hibernateUtil.update(login);
			return ResultMessage.SUCCESSFUL;
		}catch(Exception e){
			e.printStackTrace();
			return ResultMessage.FAILED;
		}
	}
}
