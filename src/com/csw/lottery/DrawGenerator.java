package com.csw.lottery;

import java.util.Random;

public class DrawGenerator {

	private DrawConfiguration drawConfiguration;
	
	public DrawGenerator(DrawConfiguration drawConfiguration) {
		this.drawConfiguration = drawConfiguration;
	}

	public void generateDraw(DrawNumbers draw) {

		if (drawConfiguration == null) {
			return;
		}
		
		//generate the draw numbers
		while (draw.getDrawNumbers().size() 
				!= drawConfiguration.getNumberOfBalls()) {
			Integer number = generateRandomNumber(drawConfiguration);
			if (!draw.getDrawNumbers().contains(number)) {
				draw.getDrawNumbers().add(number);
			}
		}
	}
	
	private Integer generateRandomNumber(DrawConfiguration drawConfiguration) {
		return new Random().nextInt(drawConfiguration.getMaxBallNumber());
	}
}
