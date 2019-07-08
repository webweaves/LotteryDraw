package com.csw.lottery;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LotteryTicketTest {

	@Test
	public void testAddingBalls() {
		LotteryTicket ticket = new LotteryTicket();
		ticket.addMainNumber(1);
		ticket.addMainNumber(2);
		ticket.addMainNumber(3);
		ticket.addMainNumber(4);
		ticket.addMainNumber(5);
		ticket.addMainNumber(6);
		
		assertEquals("1,2,3,4,5,6", ticket.toString().trim());
	}
}
