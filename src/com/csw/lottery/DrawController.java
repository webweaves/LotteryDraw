package com.csw.lottery;

public class DrawController {

	public static void main(String[] args) {
		DrawConfiguration drawConfiguration 
			= new DrawConfiguration(6, 1, 49, 49);
		LotteryTicket lotteryTicket = new LotteryTicket();
		
		TicketGenerator ticketGenerator = new TicketGenerator(drawConfiguration);
		
		ticketGenerator.generateTicket(lotteryTicket);
		
	}
}
