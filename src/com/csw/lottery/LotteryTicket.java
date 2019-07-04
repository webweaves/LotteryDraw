package com.csw.lottery;

import java.util.ArrayList;
import java.util.List;

/**
 * a simple class to store main and bonus ball numbers
 * @author csw
 *
 */
public class LotteryTicket {

	private List<Integer> mainNumbers = new ArrayList<>();
	private List<Integer> bonusBallNumbers = new ArrayList<>();
	
	/**
	 * add a number to the main ticket numbers
	 * @param number
	 */
	public void addMainNumber(Integer number) {
		mainNumbers.add(number);
	}
	
	/**
	 * add a number to the ticket bonus ball numbers
	 * @param number
	 */
	public void addBonusBallNumber(Integer number) {
		bonusBallNumbers.add(number);
	}

	
	public List<Integer> getBonusBallNumbers() {
		return bonusBallNumbers;
	}

	public void setBonusBallNumbers(List<Integer> bonusBallNumbers) {
		this.bonusBallNumbers = bonusBallNumbers;
	}

	public List<Integer> getMainNumbers() {
		return mainNumbers;
	}

	public void setMainNumbers(List<Integer> mainNumbers) {
		this.mainNumbers = mainNumbers;
	}
}
