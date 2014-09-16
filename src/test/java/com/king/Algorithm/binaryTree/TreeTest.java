package com.king.Algorithm.binaryTree;

import org.junit.Test;


public class TreeTest{
	
	@Test
	public void testTree(){
		Tree tree = new Tree();
		
		tree.addNode(5);
		tree.addNode(1);
		tree.addNode(6);
		tree.addNode(0);
		tree.addNode(11);
		tree.addNode(2);
		
		tree.printNode();
	}
}
