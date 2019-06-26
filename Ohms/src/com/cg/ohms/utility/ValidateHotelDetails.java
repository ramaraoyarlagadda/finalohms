package com.cg.ohms.utility;

import com.cg.ohms.exceptions.InValidHotelAddressException;
import com.cg.ohms.exceptions.InValidHotelIdException;
import com.cg.ohms.exceptions.InValidHotelNameException;
import com.cg.ohms.exceptions.InValidNumberOfRoomsException;

public class ValidateHotelDetails {
	
	public boolean isValidHotelId(String hotelId) throws InValidHotelIdException{
		
		if(!hotelId.matches("^[0-9]{2,5}$")) {
			throw new InValidHotelIdException("Enter numbers upto 5 digits only");
		}
		return true;
	}
	public boolean isValidHotelName(String hotelName) throws InValidHotelNameException{
		if (!hotelName.matches("^[a-zA-Z]*$") || hotelName.isEmpty()) {
			throw new InValidHotelNameException("Enter Valid Hotel Name in alphabets ");
		}

		return true;

	}
	public boolean isValidHotelAddress(String hotelAddress) throws InValidHotelAddressException{
		if (!hotelAddress.matches("^[\\\\$#\\\\+{}:\\\\?\\\\.,~@\\\"a-zA-Z0-9 ]+$") || hotelAddress.isEmpty()) {
			throw new InValidHotelAddressException("Enter Valid Hotel Address ");
		}
		return true;
	}
	public boolean isValidNumberOfRooms(int numOfRooms) throws InValidNumberOfRoomsException{
		String rooms=Integer.toString(numOfRooms);
		if(!(rooms.matches("[0-9]{1,3}"))||rooms.isEmpty()) {
			throw new InValidNumberOfRoomsException("Enter Valid Number For Rooms");
		}
		return true;
	}
	
	

}
