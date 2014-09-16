package com.king.Algorithm.binaryTree;

public class Tree {
	private Node root;
	
	/**
	 * 添加节点
	 * 	1.先判断要节点是否为空，为空的话添加的数字就直接作为根节点的数字
	 * 	2.如果根节点不为空，那么就直接调用根节点的添加方法
	 * @param data
	 */
	public void addNode(Comparable data){
		if(root == null){
			root = new Node(data);
		}else{
			root.add(data);
		}
	}
	
	public void printNode(){
		if(root != null){
			root.printLeft();
		}
	}
}
