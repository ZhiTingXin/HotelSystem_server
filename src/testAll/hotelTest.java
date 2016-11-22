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
		hotel.setHotelStrict("ƒœæ©");
		hotel.setHotelName("jinling");
		hp.add(hotel);
		//≤È—Øhotel≤‚ ‘
//		Hotel hotel =hp.get("183542746");
//		System.out.println(hotel);
		//…æ≥˝æ∆µÍ≤‚ ‘
//		System.out.println(hp.del(hotel));
		//≤È—Øæ∆µÍ≤‚ ‘
//		List<HotelPO> hot = hp.getHotels("ƒœæ©", "Hotelstrict");
//		System.out.println(hot.size());
		
	}
}
