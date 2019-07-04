package com.csw.lottery;

public class DrawController {

	public static void main(String[] args) {
		DrawConfiguration drawConfiguration 
			= new DrawConfiguration(6, 1, 49, 49);
		LotteryTicket lotteryTicket = new LotteryTicket();
		
		TicketGenerator ticketGenerator = new TicketGenerator(drawConfiguration);
		
		ticketGenerator.generateTicket(lotteryTicket);
		
		DrawGenerator drawGenerator = new DrawGenerator(drawConfiguration);
		
		for (int i=0; i<=1000; i++) {
			DrawNumbers drawNumbers = new DrawNumbers();
			drawGenerator.generateDraw(drawNumbers);
			System.out.println(drawNumbers);
		}
		
	}
}
