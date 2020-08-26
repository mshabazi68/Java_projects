/*
 * Mohammadreza shahbazi jalali
 * 
 * professor : Mani Heravi
 * Class : Thursday 
 * project 4
 * Graph
 * 
 */
public class Node {

	int data; 
	Node nextNode;

	// constructor
	public Node() {
		nextNode = null;
		data = 0;
	}
	// constructor
	public Node(int d){
		data = d;
		nextNode = null;
	}

	// constructor
	public Node(int d, Node n) {
		data = d;
		nextNode = n;
	}
// set data 
	public void setData(int d) {
		data = d;
	}
// getting data 
	public int getData() {
		return data;
	}
// setting node 
	public void setnextNode(Node n) {
		nextNode = n;
	}
// getting node 
	public Node getnextNode() {
		return nextNode;
	}


}
