package com.zhxy.test;

public class NodeChain {
	Node head;// 头节点
	Node tail; // 尾节点
	private int size;

	public void addNode(Node node) {
		if (head == null) {
			head = node;
			tail = node;
			tail.next = null;
		} else {
			tail.next = node;
			node.pre = tail;
			tail = tail.next;
			tail.next = null;
		}
	}

	public void printChain() {
		for (Node temp = head; temp != null; temp = temp.next) {
			temp.printNode();
		}
		System.out.println();
	}

	public void removeRepeatedNode() {
		Node curr = head;
		while (curr != null) {
			for (Node temp = curr.next; temp != null; temp = temp.next) {
				if (curr.value == temp.value) {
					if (temp.next != null) {
						// 移除该node
						temp.pre.next = temp.next;
						temp.next.pre = temp.pre;
					} else {
						temp.pre.next = null;
					}
				}
			}
			curr = curr.next;
		}
		printChain();

	}

	public static void main(String[] args) {
		NodeChain nodeChain = new NodeChain();
		Node node = null;
		for (int i = 0; i < 10; i++) {
			node = new Node();
			node.setValue(i % 2);
			nodeChain.addNode(node);
		}
		nodeChain.printChain();
		System.out.println("*****");
		nodeChain.removeRepeatedNode();

	}

}

class Node {
	Node pre;
	Node next;
	int value;

	public Node getPre() {
		return pre;
	}

	public void setPre(Node pre) {
		this.pre = pre;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void printNode() {
		System.out.print(this.value + "\t");
	}

}
