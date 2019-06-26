package com.cg.ohms.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.cg.ohms.dao.HotelDetailsDTO;
import com.cg.ohms.exceptions.EmptyHotelListException;
import com.cg.ohms.exceptions.InValidHotelAddressException;
import com.cg.ohms.exceptions.InValidHotelIdException;
import com.cg.ohms.exceptions.InValidHotelNameException;
import com.cg.ohms.exceptions.InValidNumberOfRoomsException;
import com.cg.ohms.service.IHotel;
import com.cg.ohms.staticdb.HotelDetailsStaticDb;

public class HotelDetailsImpl implements IHotel {
	boolean flag=false;
	public HotelDetailsDTO addHotelDetails(HotelDetailsDTO hotelDetailsEntity) throws InValidHotelIdException,
	InValidHotelNameException, InValidHotelAddressException, InValidNumberOfRoomsException {
    //int hotelId=hotelDetailsEntity.getHotelId();
    //String hotelName=hotelDetailsEntity.getHotelName();
    //String hotelAddress=hotelDetailsEntity.getHotelAddress();
    //int noofRooms=hotelDetailsEntity.getNumOfRooms();


    return hotelDetailsEntity;
   }
    public List<HotelDetailsDTO>\
    viewHotelDetails() throws EmptyHotelListException {
//    for(HotelDetailsDTO view : HotelDetailsStaticDb.getHotellist()) {
//	System.out.println(view);
//    }
    	if(!HotelDetailsStaticDb.getHotelList().isEmpty()) {
    		List<HotelDetailsDTO> hotelList=new ArrayList<HotelDetailsDTO>();
    		hotelList.addAll(HotelDetailsStaticDb.getHotelList());
    		return hotelList;
    	}
    	else {
    		throw new EmptyHotelListException("Hotel list is Empty");
    	}
    }
    public int deleteHotelDetails(String hotelId) throws EmptyHotelListException{
    	
    	
    	

     return 0;
      }
	@Override
	public boolean modifyByHotelName(String hotelId, String hotelName) throws EmptyHotelListException {
		
		List<HotelDetailsDTO> hotelList=HotelDetailsStaticDb.getHotelList();
		if(hotelList==null||hotelList.isEmpty()) {
			throw new EmptyHotelListException("Hotellist is Empty");
			}
			else
			{
				for(HotelDetailsDTO hotel: hotelList)
				{
					
					if(hotel.getHotelId().equals(hotelId))
					{
						hotel.setHotelName(hotelName);
						flag=true;
						break;
					}
				}
			}
		
		return flag;
	}
	@Override
	public boolean modifyByHotelAddress(String hotelId, String hotelAddress) throws EmptyHotelListException {
		
		List<HotelDetailsDTO> hotelList=HotelDetailsStaticDb.getHotelList();
		if(hotelList==null||hotelList.isEmpty()) {
			 throw new EmptyHotelListException("Hotellist is Empty");
			}
			else
			{
				for(HotelDetailsDTO hotel: hotelList)
				{
					
					if(hotel.getHotelId().equals(hotelId))
					{
						hotel.setHotelAddress(hotelAddress);
						flag=true;
						break;
					}
				}
			}
		
		return flag;
	}
	@Override
	public boolean modifyByNumOfRooms(String hotelId, int numOfRooms) throws EmptyHotelListException {
		List<HotelDetailsDTO> hotelList=HotelDetailsStaticDb.getHotelList();
		if(hotelList==null||hotelList.isEmpty()) {
			 throw new EmptyHotelListException("Hotellist is Empty");
			}
			else
			{
				for(HotelDetailsDTO hotel: hotelList)
				{
					
					if(hotel.getHotelId().equals(hotelId))
					{
						hotel.setNumOfRooms(numOfRooms);
						flag=true;
						break;
					}
				}
			}
	
		
		return flag;
	}


}
