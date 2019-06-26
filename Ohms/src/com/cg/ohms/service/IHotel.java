package com.cg.ohms.service;

import java.util.List;

import com.cg.ohms.dao.HotelDetailsDTO;
import com.cg.ohms.exceptions.EmptyHotelListException;
import com.cg.ohms.exceptions.InValidHotelAddressException;
import com.cg.ohms.exceptions.InValidHotelIdException;
import com.cg.ohms.exceptions.InValidHotelNameException;
import com.cg.ohms.exceptions.InValidNumberOfRoomsException;

public interface IHotel {
	
	public HotelDetailsDTO addHotelDetails(HotelDetailsDTO hotelDetailsEntity) throws InValidHotelIdException,InValidHotelNameException,InValidHotelAddressException,InValidNumberOfRoomsException;
	public int deleteHotelDetails(String hotelId) throws EmptyHotelListException;
	public HotelDetailsDTO viewHotelDetails() throws EmptyHotelListException;
	public boolean modifyByHotelName(String hotelId, String hotelName) throws EmptyHotelListException;
	public boolean modifyByHotelAddress(String hotelId, String hotelAddress) throws EmptyHotelListException;
	public boolean modifyByNumOfRooms(String hotelId,int modifyNumOfRooms) throws EmptyHotelListException;
	

}
