/*
 * Mohammadreza shahbazi jalali
 * 
 * professor : Mani Heravi
 * Class : Thursday 
 * project 4
 * Graph
 * 
 */
public class Stack {

	LinkList s;

	public Stack() {
		s = new LinkList();
	}

	public void push(int val) {
		s.insertEnd(val);
	}

	public void pop() {
		s.deleteEnd();
	}

	public int peek() {
		return s.tail.data;
	}

	// @Override
	public boolean isEmpty() {
		return s.isEmpty();
	}

}
