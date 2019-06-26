package com.cg.ohms.sevice.impl;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.cg.ohms.exceptions.InValidHotelAddressException;
import com.cg.ohms.exceptions.InValidHotelIdException;
import com.cg.ohms.exceptions.InValidHotelNameException;
import com.cg.ohms.exceptions.InValidNumberOfRoomsException;
import com.cg.ohms.utility.ValidateHotelDetails;

public class HotelDetailsImplTest {

	ValidateHotelDetails validation= new ValidateHotelDetails();

	@Test
	public void testHotelIdValidation() throws InValidHotelIdException {
		boolean actual= validation.isValidHotelId("12354");
		assertEquals(true, actual);
	}
	@Test(expected = InValidHotelIdException.class)
	public void testForWrongid() throws InValidHotelIdException {
		validation.isValidHotelId("1235477");
		
	}
	@Test
	public void testHotelNameValidation() throws InValidHotelNameException{
		boolean actual=validation.isValidHotelName("royalparl");
		assertEquals(true, actual);
	}
	@Test(expected = InValidHotelNameException.class)
	public void testForWrongHotelName() throws InValidHotelNameException{
		validation.isValidHotelName("09865546");
	}
	@Test
	public void testHotelAddressValidation() throws InValidHotelAddressException{
		boolean actual=validation.isValidHotelAddress("kakinada,andharpradesh");
		assertEquals(true, actual);
	}
	@Test(expected = InValidHotelAddressException.class)
	public void testForWrongHotelAddress() throws InValidHotelAddressException{
		validation.isValidHotelAddress("568,/gya,");
	}
	@Test
	public void testForNumberOfRooms() throws InValidNumberOfRoomsException{
		boolean actual=validation.isValidNumberOfRooms(789);
		assertEquals(true, actual);
	}
	@Test(expected = InValidNumberOfRoomsException.class)
	public void testForWrongNumberOfRooms() throws InValidNumberOfRoomsException{
		validation.isValidNumberOfRooms(467788);
	}
}
