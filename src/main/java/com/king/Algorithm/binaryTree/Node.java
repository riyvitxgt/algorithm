package com.king.Algorithm.binaryTree;

public class Node {
	private Comparable data;
	private Node left;
	private Node right;
	
	
	public Comparable getData() {
		return data;
	}

	/**
	 * 添加的数字跟当前节点的内容进行比较，如果小于等于根节点的内容，
	 * 则添加到左子树中，如果左子树为空，则该内容为左子树的内容，否则就让左子树添加
	 * @param data
	 */
	public void add(Comparable data){
		if(data.compareTo(this.getData()) <= 0){
			if(this.getLeft() == null){
				this.setLeft(new Node(data));
			}else{
				this.getLeft().add(data);
			}
		}else{
			if(this.getRight() == null){
				this.setRight(new Node(data));
			}else{
				this.getRight().add(data);
			}
		}
	}

	//中序遍历（先左，再根，后右）
	public void printMid(){
		if(this.getLeft() != null){
			this.getLeft().printMid();
		}
		
		System.out.println(this.getData());
		
		if(this.getRight() != null){
			this.getRight().printMid();
		}
	}
	
	//先序遍历（先根，再左，后右）
	public void printLeft(){
		System.out.println(this.getData());
		
		if(this.getLeft() != null){
			this.getLeft().printLeft();
		}
		
		if(this.getRight() != null){
			this.getRight().printLeft();
		}
	}
	
	//后序遍历
	public void printRight(){
		if(this.getRight() != null){
			this.getRight().printRight();
		}
		
		System.out.println(this.getData());
		
		if(this.getLeft() != null){
			this.getLeft().printRight();
		}
		
	}
	
	public void setData(Comparable data) {
		this.data = data;
	}


	public Node getLeft() {
		return left;
	}


	public void setLeft(Node left) {
		this.left = left;
	}


	public Node getRight() {
		return right;
	}


	public void setRight(Node right) {
		this.right = right;
	}


	public Node(Comparable data){
		this.data = data;
	}
}
