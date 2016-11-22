package PO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import other.RoomType;


@Entity
@Table(name="room")
public class RoomPO {

	/*
	 * price ����ĵ���
	 * type ���������
	 * hotelId ���������ľƵ��id
	 * number ���������
	 * id �洢ʱ��������
	 */
	private int price;
	private RoomType type;
	private String hotelId;
	private int number;
	private int id;
	
	//room �Ĺ��췽��
	public RoomPO(){}
	public RoomPO(int pric,RoomType type,String hotelid,int number){
		super();
		this.price = pric;
		this.hotelId = hotelid;
		this.type = type;
		this.number = number;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public RoomType getType() {
		return type;
	}
	public void setType(RoomType type) {
		this.type = type;
	}
	
}
