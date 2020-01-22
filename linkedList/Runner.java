package linkedList;

public class Runner {

	public static void main(String[] args) {
		MyLinkedList mylist = new MyLinkedList();

		mylist.insert(1);
		mylist.insert(2);
		mylist.insert(3);
		mylist.insert(4);

		mylist.insert(6);
		mylist.insert(7);
		mylist.insert(8);
		mylist.insert(9);
		mylist.insert(10);
		mylist.insertAt(5, 5);
		mylist.displayList();
		System.out.println("LinkedList Size" + mylist.size());

	}
}
