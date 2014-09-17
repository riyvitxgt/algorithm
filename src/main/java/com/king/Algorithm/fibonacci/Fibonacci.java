package com.king.Algorithm.fibonacci;

public class Fibonacci {
	/**
	 * 	斐波纳契数列
	 * 	前两个数字之和为下一下数字的内容
	 * 	所以我们可以使用fibonacci(i) = fibonacci(i-1) + fibonacci(i-1)这
	 *个式子去求每一个值方法是使用递归，当我们要示第i个数时，我们先求出第i-1和i-2个数，他们的和
	 *即为第i个数，前提是里面必须要有连续两个数字是已知的
	 * @param i
	 * @return
	 */
	public int fibonacci(int i){
		if(i < 2){
			return 1;
		}else{
			return fibonacci(i-1) + fibonacci(i-2);
		}
	}
}
