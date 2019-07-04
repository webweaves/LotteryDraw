package com.csw.lottery;

import java.util.ArrayList;
import java.util.List;

public class DrawNumbers {

	private List<Integer> drawNumbers = new ArrayList<>();

	public List<Integer> getDrawNumbers() {
		return drawNumbers;
	}

	public void setDrawNumbers(List<Integer> drawNumbers) {
		this.drawNumbers = drawNumbers;
	}
	
	@Override
	public String toString() {
		String numbers = "";
		for (Integer i: drawNumbers) {
			numbers += " "+i+" ";
		}
		return numbers;
	}
}
