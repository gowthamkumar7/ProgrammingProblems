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
			//
			tempNode.next = node;

		}
	}

	/**
	 * 
	 * @return
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

	/**
	 * Insert at 1 to n-1 location.
	 * 
	 * @param data
	 *            data to be inserted
	 * @param location
	 *            data at the location
	 */
	public void insertAt(int data, int location) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		// If head is Empty
		if (head == null) {
			head = node;
		} else if (location == 1) {
			insertAtFirst(data);
		} else {
			Node tempNode = head;
			int counter = 1;
			while (tempNode.next != null) {
				if (counter == (location - 1)) {
					Node newNode = new Node();
					newNode.data = data;
					newNode.next = tempNode.next;
					tempNode.next = newNode;
					break;
				}
				counter++;
				tempNode = tempNode.next;
			}

		}
	}

	/**
	 * Delete specific data from the LL
	 * 
	 * @param data
	 */
	public void delete(int data) {

		Node tempNode = head;
		Node previousNode = null;
		if (head != null) {
			while (tempNode.next != null) {
				if (tempNode.data == data) {
					// If deletion is at head
					if (previousNode == null) {
						head = tempNode.next;
						break;
					}

					previousNode.next = tempNode.next;
					break;
				}
				previousNode = tempNode;
				// Traversing to next node.
				tempNode = tempNode.next;

			}
			if (tempNode.next == null) {
				previousNode.next = null;
			}
		} else {
			throw new NullPointerException();
		}

	}

	/**
	 * Insert the data at first location
	 * 
	 * @param data
	 */
	public void insertAtFirst(int data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
	}

	/**
	 * Insert the data at the last
	 * 
	 * @param data
	 */
	public void insertAtLast(int data) {
		// Creation of new node
		Node node = new Node();
		node.data = data;
		node.next = null;

		Node tempNode = head;
		while (tempNode.next != null) {
			// Traversing to next node
			tempNode = tempNode.next;
		}
		// After iteration, tempNode.next is last. Being pointed to new node.
		tempNode.next = node;

	}

	/**
	 * Print the entire list
	 */
	public void displayList() {
		Node tempNode = head;
		while (tempNode.next != null) {
			System.out.println(tempNode.data);
			tempNode = tempNode.next;

		}
		System.out.println(tempNode.data);

	}

	public void displayReverseLL() {

		reverse(head);

	}

	/**
	 * Prints the LL in reverse
	 * 
	 * @param head
	 */
	private void reverse(Node head) {
		if (head.next != null) {
			reverse(head.next);
		}
		System.out.println("" + head.data);
	}
}
