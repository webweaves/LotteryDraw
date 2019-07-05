package com.csw.lottery;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.csw.lottery.utils.NumberComparator;

public class DrawNumbers {

	private Set<Integer> drawNumbers = new TreeSet<>(new NumberComparator());
	
	@Override
	public String toString() {
		String numbers = "";
		for (Integer i: getDrawNumbers()) {
			numbers += " "+i+" ";
		}
		return numbers;
	}

	public Set<Integer> getDrawNumbers() {
		return drawNumbers;
	}

	public void setDrawNumbers(Set<Integer> drawNumbers) {
		this.drawNumbers = drawNumbers;
	}
}