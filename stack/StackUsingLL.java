package d_s_stack;

import d_s.Node;

/**
 * @author gowtham pr Stack using
 */
public class StackUsingLL {

	Node head;

	public void push(int data) {

		if (head == null) {
			Node tempNode = new Node();
			tempNode.data = data;
			tempNode.next = null;
			head = tempNode;

		} else {
			Node tempNode = new Node();
			tempNode.data = data;
			tempNode.next = head;
			head = tempNode;
		}

	}
	/*
	 * public static void main(String[] args) {
	 * 
	 * }
	 */

	public void print() {

		if (head != null) {
			Node node = head;
			while (node.next != null) {
				System.out.print("Data is -->" + node.data);
				node = node.next;
			}
			System.out.println("Data is -->" + node.data);
		}

	}

}
