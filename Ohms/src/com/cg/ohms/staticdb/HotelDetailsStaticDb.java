package com.cg.ohms.staticdb;

import java.util.ArrayList;
import java.util.List;

import com.cg.ohms.dao.HotelDetailsDTO;
import com.cg.ohms.exceptions.EmptyHotelListException;

public class HotelDetailsStaticDb {
	
	
	private static List<HotelDetailsDTO> hotelList=new ArrayList<HotelDetailsDTO>();

	public static List<HotelDetailsDTO> getHotelList() throws EmptyHotelListException {
		if(!hotelList.isEmpty())
		{
		return hotelList;
		}
		else {
			throw new EmptyHotelListException("Hotel List is Empty");
		}
	}
	public void hotelList() {
		//hotelList.add(hotelDetailsDTO);
		hotelList.add(new HotelDetailsDTO("1234", "royalpark", "kakinada", 50));
		hotelList.add(new HotelDetailsDTO("7896", "HotelGrand", "Hyderabad", 150));
		
		//return hotelDetailsDTO;
	}
//	public void 
	public void setHotelList(HotelDetailsDTO hotelDetailsDTO) {
		hotelList.add(hotelDetailsDTO);
		
	}

}
