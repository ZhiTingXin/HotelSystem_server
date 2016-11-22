//package data.dao.impl;
//
//import java.util.ArrayList;
//
//import PO.SystemStrategy1PO;
//import PO.SystemStrategyPO;
//import data.dao.SystemStrategyDao;
//import other.ResultMessage;
//
//public class SystemStrategyDaoImpl implements SystemStrategyDao{
//    
//	private ArrayList<SystemStrategyPO> listsystem;
//	private ArrayList<SystemStrategy1PO> list;
//	
//	public ResultMessage addSystemStrategy(SystemStrategyPO systemstrategy) {
//		listsystem.add(systemstrategy);
//		return null;
//	}
//
//	public ResultMessage addSystemStrategy1(SystemStrategy1PO systemstrategy) {
//		list.add(systemstrategy);
//		return null;
//	}
//
//	public ArrayList<SystemStrategy1PO> getSystemStrategy1s(String systemStaffId) {
//		
//		return list;
//	}
//
//	public ResultMessage updateSystemStrategy(SystemStrategyPO systemstrategy) {
//		for(int i=0;i<listsystem.size();i++){
//			SystemStrategyPO stemp = listsystem.get(i);
//			if(stemp.getSystemStrategy_name()==systemstrategy.getSystemStrategy_name()){
//				listsystem.remove(i);
//				listsystem.add(i, systemstrategy);
//			}
//		}
//		return ResultMessage.SUCCESSFUL;
//	}
//
//	public ResultMessage updateSystemStrategy1(SystemStrategy1PO systemstrategy) {
//		for(int i=0;i<list.size();i++){
//			SystemStrategy1PO stem  = list.get(i);
//			if(stem.getSystemStrategy_name()==systemstrategy.getSystemStrategy_name()){
//				list.remove(i);
//				list.add(i,systemstrategy);
//			}
//		}
//		return ResultMessage.SUCCESSFUL;
//	}
//
//	public SystemStrategyPO getSystemStrategy(String systemStrategy_name) {
//		SystemStrategyPO stem = new SystemStrategyPO();
//		for(int i=0;i<listsystem.size();i++){
//			stem = listsystem.get(i);
//			if(stem.getSystemStrategy_name().equals(systemStrategy_name)){
//				break;
//			}
//		}
//		return stem;
//	}
//	public SystemStrategy1PO getSystemStrategy1(String systemStrategy_name) {
//		SystemStrategy1PO stem = new SystemStrategy1PO();
//		for(int i=0;i<list.size();i++){
//			stem = list.get(i);
//			if(stem.getSystemStrategy_name().equals(systemStrategy_name)){
//				break;
//			}
//		}
//		return stem;
//	}
//	public ResultMessage deleteSystemStrategy(String systemStrategy_name) {
//		for(int i=0;i<listsystem.size();i++){
//			SystemStrategyPO stemp = listsystem.get(i);
//			if(stemp.getSystemStrategy_name()==systemStrategy_name){
//				listsystem.remove(i);
//			}
//		}
//		return ResultMessage.SUCCESSFUL;
//	}
//
//	public ArrayList<SystemStrategyPO> getSystemStrategys(String systemStaffId) {
//		return listsystem;
//	}
//
//}
