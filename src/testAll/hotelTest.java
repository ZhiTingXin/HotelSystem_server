package testAll;

import java.util.List;

import PO.HotelPO;
import data.dao.impl.HotelDaoImpl;

public class hotelTest {

	public static void main(String[] args){
		HotelDaoImpl hp = new HotelDaoImpl();
		HotelPO hotel = new HotelPO();
		hotel.setHotelId("183272");
		hotel.setHotelStaffId("183456");
		hotel.setHotelStrict("�Ͼ�");
		hotel.setHotelName("jinling");
		hp.add(hotel);
		//��ѯhotel����
//		Hotel hotel =hp.get("183542746");
//		System.out.println(hotel);
		//ɾ���Ƶ����
//		System.out.println(hp.del(hotel));
		//��ѯ�Ƶ����
//		List<HotelPO> hot = hp.getHotels("�Ͼ�", "Hotelstrict");
//		System.out.println(hot.size());
		
	}
}
