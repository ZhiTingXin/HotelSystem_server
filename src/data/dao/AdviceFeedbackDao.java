package data.dao;

import java.util.ArrayList;

import PO.AdviceFeedBackPO;
import other.ResultMessage;

public interface AdviceFeedbackDao {
  
	public ResultMessage addAdvice(AdviceFeedBackPO advice);
	
	public ResultMessage updateAdvice(AdviceFeedBackPO advice);
	
	public ArrayList<AdviceFeedBackPO> getAdvices(String userId,String type);
	
}
