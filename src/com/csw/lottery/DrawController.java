package com.csw.lottery;

public class DrawController {

	public static void main(String[] args) {
		DrawConfiguration drawConfiguration 
			= new DrawConfiguration(6, 1, 59, 59);
		LotteryTicket lotteryTicket = new LotteryTicket();
		TicketGenerator ticketGenerator = new TicketGenerator(drawConfiguration);
		ticketGenerator.generateTicket(lotteryTicket);
		
		DrawGenerator drawGenerator = new DrawGenerator(drawConfiguration);
		
		for (int i=0; i<=100000000; i++) {
			DrawNumbers drawNumbers = new DrawNumbers();
			drawGenerator.generateDraw(drawNumbers);
			
			int numbersMatched 
				= new TicketChecker().checkTicketAgainstDrawNumbers(lotteryTicket, drawNumbers);
			
			if (numbersMatched > 5) {
				System.out.printf("(%d) Matched %s balls (%s) -> (%s)\n", i, numbersMatched, lotteryTicket, drawNumbers);
			}
			//System.out.println(drawNumbers);
		}
		
	}
}
