package data.dao.impl;

import java.util.ArrayList;

import PO.AdviceFeedBackPO;
import data.dao.AdviceFeedbackDao;
import other.ResultMessage;
import other.hibernateUtil;

public class AdviceFeedbackDaoImpl implements AdviceFeedbackDao {


	public ResultMessage addAdvice(AdviceFeedBackPO advice) {
		try{
			hibernateUtil.add(advice);
			return ResultMessage.SUCCESSFUL;
		}catch(Exception e){
			e.printStackTrace();
		    return ResultMessage.FAILED;
		}
	}
	public ResultMessage updateAdvice(AdviceFeedBackPO advice) {
		try{
			hibernateUtil.update(advice);
			return ResultMessage.SUCCESSFUL;
		}catch(Exception e){
			e.printStackTrace();
		    return ResultMessage.FAILED;
		}
	}
	public ArrayList<AdviceFeedBackPO> getAdvices(String userId,String type) {
		ArrayList<AdviceFeedBackPO> list = null;
		try{
			list = (ArrayList<AdviceFeedBackPO>) hibernateUtil.findbySome("AdviceFeedBackPO", type, userId);
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
	
	
}
