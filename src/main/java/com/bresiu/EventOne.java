package com.bresiu;

/**
 * @author Michal Brewczak
 */
public class EventOne extends Event {
	@Override
	public void printMessage() {
		System.out.println(this.getClass().toString());
	}
}
