package com.csw.lottery;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicketCheckerTest {

	@Test
	public void testTicket() {
		LotteryTicket ticket = new LotteryTicket();
		DrawNumbers drawNumbers = new DrawNumbers();
		
		ticket.addMainNumber(1);
		ticket.addMainNumber(2);
		ticket.addMainNumber(3);
		ticket.addMainNumber(4);
		ticket.addMainNumber(5);
		ticket.addMainNumber(6);
		
		drawNumbers.getDrawNumbers().add(1);
		drawNumbers.getDrawNumbers().add(2);
		drawNumbers.getDrawNumbers().add(3);
		drawNumbers.getDrawNumbers().add(10);
		
		TicketChecker ticketChecker = new TicketChecker();
		int matchedNumbers = ticketChecker.checkTicketAgainstDrawNumbers(ticket, drawNumbers);
		assertEquals(3, matchedNumbers);
	}
}
