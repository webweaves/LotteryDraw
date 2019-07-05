package com.csw.lottery;

public class TicketChecker {

	/**
	 * check the ticket for the number of matching balls in the draw
	 * @param ticket
	 * @param drawNumbers
	 * @return
	 */
	public int checkTicketAgainstDrawNumbers(LotteryTicket ticket, DrawNumbers drawNumbers) {
		int matchedNumbers = 0;
		for (Integer number: ticket.getMainNumbers()) {
			if (drawNumbers.getDrawNumbers().contains(number)) {
				matchedNumbers++;
			}
		}
		return matchedNumbers;
	}
}
