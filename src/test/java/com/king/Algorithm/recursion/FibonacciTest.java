package com.king.Algorithm.recursion;

import static org.junit.Assert.*;

import org.junit.Test;

import com.king.Algorithm.fibonacci.Fibonacci;

public class FibonacciTest {

	@Test
	public void testFibonacci() {
		Fibonacci f = new Fibonacci();
		for(int i = 1; i < 10; i++){
			System.out.println(f.fibonacci(i));
		}
	}

}
