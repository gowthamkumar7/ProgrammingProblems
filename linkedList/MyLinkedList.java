package linkedList;

public class MyLinkedList {

	Node head;

	public void insert(int data) {

		Node node = new Node();
		node.data = data;
		node.next = null;

		// If head is Empty
		if (head == null) {
			head = node;
		} else {
			Node tempNode = head;
			// Traverse nodes to last
			while (tempNode.next != null) {
				tempNode = tempNode.next;
			}
			// This is penultimate node.
			tempNode.next = node;

		}
	}

	/**
	 * 
	 * @return Size of the linkedlist including head and tail
	 */
	public int size() {
		if (head == null) {
			return 0;
		} else {
			Node tempNode = head;
			// Traverse nodes to last
			int nodeCount = 0;
			while (tempNode.next != null) {
				tempNode = tempNode.next;
				nodeCount++;
			}
			nodeCount++;
			return nodeCount;
		}
	}

	public void insertAt(int data, int location) {

		Node node = new Node();
		node.data = data;
		node.next = null;

		// If head is Empty
		if (head == null) {
			head = node;
		} else {
			Node tempNode = head;
			int traverseCount = 0;
			while (traverseCount <= size()) {
				tempNode = tempNode.next;
				if (traverseCount == location) {
					Node nextNode = tempNode.next;
					node.next = nextNode;
					tempNode.next = node;

				}
				traverseCount++;
			}
		}
	}

	public void displayList() {
		Node tempNode = head;
		while (tempNode.next != null) {
			System.out.println(tempNode.data);
			tempNode = tempNode.next;

		}

	}
}
