/***************************************************************************
 * Purpose : Test cases for the cab invoice generator
 * @author Rosy Rupali
 * @Since 01-07-2021
 * @Version 1.0 
 ***************************************************************************/
package javapractice.invoicegenerator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import service.InvoiceService;

public class InvoiceServiceTest {
	InvoiceService invoiceService;

	@Before
	public void setup() {
		invoiceService = new InvoiceService();
	}
	/**
	 * method to return fare, distance and time given
	 */
	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {
		double distance = 2.0;
		int time = 5;
		double fare = invoiceService.calculateFare(distance, time);
		Assert.assertEquals(25.0, fare, 0.0);
	}

	/**
	 * method to return minimum fare, less distance and time is given
	 */
	@Test
	public void givenLessDistanceOrTime_ShouldReturnMinimumFare() {
		double distance = 0.2;
		int time = 1;
		double fare = invoiceService.calculateFare(distance, time);
		Assert.assertEquals(5.0, fare, 0.0);
	}

}
