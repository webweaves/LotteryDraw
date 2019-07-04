package com.csw.lottery;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * a simple class to store main and bonus ball numbers
 * @author csw
 *
 */
public class LotteryTicket {

	private Set<Integer> mainNumbers = new TreeSet<>();
	private Set<Integer> bonusBallNumbers = new TreeSet<>();
	
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

	public Set<Integer> getMainNumbers() {
		return mainNumbers;
	}

	public void setMainNumbers(Set<Integer> mainNumbers) {
		this.mainNumbers = mainNumbers;
	}

	public Set<Integer> getBonusBallNumbers() {
		return bonusBallNumbers;
	}

	public void setBonusBallNumbers(Set<Integer> bonusBallNumbers) {
		this.bonusBallNumbers = bonusBallNumbers;
	}

}
