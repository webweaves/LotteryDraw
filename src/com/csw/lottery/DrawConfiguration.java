package com.csw.lottery;

public class DrawConfiguration {

	private Integer numberOfBalls;
	private Integer numberOfBonusBalls;
	private Integer maxBallNumber;
	private Integer maxBonusBallNumber;

	public DrawConfiguration(Integer numberOfBalls, Integer numberOfBonusBalls, Integer maxBallNumber,
			Integer maxBonusBallNumber) {
		super();
		this.numberOfBalls = numberOfBalls;
		this.numberOfBonusBalls = numberOfBonusBalls;
		this.maxBallNumber = maxBallNumber;
		this.maxBonusBallNumber = maxBonusBallNumber;
	}
	
	public Integer getNumberOfBalls() {
		return numberOfBalls;
	}
	public void setNumberOfBalls(Integer numberOfBalls) {
		this.numberOfBalls = numberOfBalls;
	}
	public Integer getNumberOfBonusBalls() {
		return numberOfBonusBalls;
	}
	public void setNumberOfBonusBalls(Integer numberOfBonusBalls) {
		this.numberOfBonusBalls = numberOfBonusBalls;
	}
	public Integer getMaxBallNumber() {
		return maxBallNumber;
	}
	public void setMaxBallNumber(Integer maxBallNumber) {
		this.maxBallNumber = maxBallNumber;
	}
	public Integer getMaxBonusBallNumber() {
		return maxBonusBallNumber;
	}
	public void setMaxBonusBallNumber(Integer maxBonusBallNumber) {
		this.maxBonusBallNumber = maxBonusBallNumber;
	}
}
