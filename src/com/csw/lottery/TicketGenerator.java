package com.csw.lottery;

import java.util.Random;

public class TicketGenerator {

	private DrawConfiguration drawConfiguration;
	
	public TicketGenerator(DrawConfiguration drawConfiguration) {
		this.drawConfiguration = drawConfiguration;
	}

	public void generateTicket(LotteryTicket lotteryTicket) {

		if (drawConfiguration == null) {
			return;
		}
		
		//generate the main numbers
		while (lotteryTicket.getMainNumbers().size() 
				!= drawConfiguration.getNumberOfBalls()) {
			Integer number = generateRandomNumber(drawConfiguration);
			if (!lotteryTicket.getMainNumbers().contains(number)) {
				lotteryTicket.getMainNumbers().add(number);
			}
		}
		
		//generate the bonus ball numbers
		while (lotteryTicket.getBonusBallNumbers().size() 
				!= drawConfiguration.getNumberOfBonusBalls()) {
			Integer number = generateRandomNumber(drawConfiguration);
			if (!lotteryTicket.getMainNumbers().contains(number)
					&& !lotteryTicket.getBonusBallNumbers().contains(number)) {
				lotteryTicket.getBonusBallNumbers().add(number);
			}
		}
	}
	
	private Integer generateRandomNumber(DrawConfiguration drawConfiguration) {
		return new Random().nextInt(drawConfiguration.getMaxBallNumber());
	}
}
