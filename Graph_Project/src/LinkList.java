/*
 * Mohammadreza shahbazi jalali
 * 
 * professor : Mani Heravi
 * Class : Thursday 
 * project 4
 * Graph
 * 
 */

public class LinkList {
	Node head;
	Node tail;
	int size;

	static int count = 0;

	// constructor
	public LinkList(int data) {

		head = new Node(data);
		tail = new Node(data);
		// head.nextNode = tail;
		// tail= head;
		size = 1;
	}

	// constructor
	public LinkList() {
		head = tail = null;
		size = 0;
	}

	// check is empty or not
	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else
			return false;

	}

	/*
	 * _______ //////// methods with out Recursive///////// ______
	 * 
	 * //// add without recursive ////
	 */
	public void insertEnd(int data) {
		Node newNode = new Node(data);
		size++;
		if (isEmpty()) {
			head = newNode;
			tail = newNode;

		} else {
			tail.setnextNode(newNode);
			tail = newNode;

		}
	}

	// +++++++++++++++++++++++++ insert head++++++++++++++++++++
	public void insertFront(int data) {
		Node newNode = new Node(data);
		size++;
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {

			newNode.nextNode = head;
			head = newNode;
		}
	}

	// ++++++++ print list method +++++++++
	public void printList() {
		for (Node temp = head; temp != null; temp = temp.nextNode) {
			System.out.print(temp.data + "  ");
		}
		System.out.println();
	}

	/*
	 * 
	 * /// +++++++++ delete without recursive +++++++++++ ////
	 */
	public Node deleteEnd() {
		if (isEmpty()) {
			System.out.println("Error : The list is Empty!");
			return null;
		}

		Node curr = head;
		while (curr.getnextNode() != null) {
			if (curr.getnextNode() != tail) {
				curr = curr.getnextNode();
			} else {
				curr.setnextNode(null);

				tail = null;
				tail = curr;
			}
		}
		if(size == 1){
			head = tail = null;
		}
		size--;
		return curr;
	}

	public Node deleteStrat() {
		if (isEmpty()) {
			return null;
		} else {
			Node temp = head;
			head = head.getnextNode();
			size--;
			return temp;
		}

	}

	// here is the delete function for the linked list
	public boolean deleteM(int pos) {
		if (!isEmpty() || (pos > size || pos < 0))
			return false;
		Node prev = head;
		Node temp = head;
		int num = 0;
		if (pos == 0) {
			head = head.nextNode;
		} else {
			for (int i = 0; i < pos; i++) {
				temp = prev;
				prev = prev.nextNode;
			}
			temp.nextNode = prev.nextNode;
		}
		prev.nextNode = null;
		prev = null;
		return true;
	}

	/*
	 * 
	 * // +++++ find without recursive ++++ //
	 */
	// here is the find ( search method )
	public int findM(int data) {

		Node currNode = head;
		int i = 0;
		while (currNode != null) {
			if (currNode.getData() == data) {
				return i;
			}
			i++;
			currNode = currNode.nextNode;
		}

		System.out.println("Cannot find: " + data);
		return -1;

	}

}