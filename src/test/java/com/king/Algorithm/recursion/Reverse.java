package com.king.Algorithm.recursion;

public class Reverse {
	private final double RATE = 1 + 0.0171/12;
	public double reverse(int i){
		if(i == 48){
			return 1000;
		}else{
			return (reverse(i + 1) + 1000)/RATE;
		}
	}
}
