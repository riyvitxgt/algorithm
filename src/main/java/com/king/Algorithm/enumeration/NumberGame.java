package com.king.Algorithm.enumeration;

/**
 * 完成这样一个猜字游戏
 * 	算法的问题
 * X     算
 * －－－－－－
 * 题题题题题题
 * @author King
 *
 */

public class NumberGame {
	public int result;
	public int num;
	public void find(){
		for(int f1 = 1; f1 <= 9;f1++){
			for(int f2 = 0; f2 <= 9; f2++){
				for(int f3 = 0; f3 <= 9; f3++){
					for(int f4 = 0; f4 <= 9; f4++){
						for( int f5 = 1; f5 <= 9; f5++){
							result = f5*111111;
							num = f1*10000 + f2*1000 + f3*100 + f4*10 + f5;
							if(result == (num*f1)){
								System.out.println(" " + num);
								System.out.println("X    " + f1);
								System.out.println("-------");
								System.out.println(result);
							}
						}
					}
				}
				
			}
		}
	}
}
