package com.cg.ohms.dao;

public class HotelDetailsDTO {
	String hotelId;
	String hotelName;
	String hotelAddress;
	int numOfRooms;
	public HotelDetailsDTO() {
		
	}
	
	public HotelDetailsDTO(String hotelId, String hotelName, String hotelAddress, int numOfRooms) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelAddress = hotelAddress;
		this.numOfRooms = numOfRooms;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelAddress() {
		return hotelAddress;
	}
	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}
	public int getNumOfRooms() {
		return numOfRooms;
	}
	public void setNumOfRooms(int numOfRooms) {
		this.numOfRooms = numOfRooms;
	}
	@Override
	public String toString() {
		return " hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelAddress=" + hotelAddress
				+ ", numOfRooms=" + numOfRooms ;
	}
	
	

}
