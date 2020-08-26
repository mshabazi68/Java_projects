/*
 * Mohammadreza shahbazi jalali
 * 
 * professor : Mani Heravi
 * Class : Thursday 
 * project 4
 * Graph
 * 
 */
public class Graph {

	LinkList[] adjList;
	int size;
	boolean[] visitedV;
	private int nVerts; // current number of vertices
	private int adjMat[][];
	
	public Graph(int size) {
		this.size = size;
		adjList = new LinkList[size];
		for (int i = 0; i < size; i++) {
			adjList[i] = new LinkList();
		}
		visitedV = new boolean[size];
	}

	// here we adding the edge of the graph
	public void addEdge(int start, int end) {
		if (start <= size && start >= 0 && end <= size && end >= 0) {
			adjList[start].insertEnd(end);
			adjList[end].insertEnd(start);
		} else {
			System.out.println("Error: Invalid Edge");
		}
	}

	// here we checking if the vertex has been visted or not
	public int visitedV(int data, boolean[] visitedV) {
		Node current = adjList[data].head;

		while (current != null) {
			if (visitedV[current.data] == true) {
				current = current.nextNode;
			} else {
				return current.data;
			}
		}
		return -1;

	}

	// here we do the traversing for our dfs
	public void dfs(int data) {
		LinkList dfs = new LinkList();

		Stack s = new Stack();
		s.push(data);
		System.out.println("Pushed " + data);

		dfs.insertEnd(data);

		visitedV[data] = true;

		int current = data;
		while (!s.isEmpty()) {
			current = visitedV(current, visitedV);

			// Found an unvisited neighbor
			if (current != -1) {
				s.push(current);
				System.out.println("Pushed " + current);

				dfs.insertEnd(current);

				visitedV[current] = true;
			}
			// No more unvisited neighbors
			else {
				System.out.println("Popped " + s.peek());
				s.pop();

				if (!s.isEmpty())
					current = s.peek();
			}
		}

		System.out.print("DFS: ");
		dfs.printList();

		// Call other method to check for disconnected graphs
		if (isUnvisitedV()) {
			disconnected();
		}
	}
// here we check unvisited neighbors 
	public boolean isUnvisitedV() {
		for (int i = 0; i < visitedV.length; i++) {
			if (visitedV[i] == false) {
				return true;
			}
		}
		return false;
	}
// method for the disconected graph  
	public void disconnected() {
		for (int i = 0; i < visitedV.length; i++) {
			if (visitedV[i] == false) {
				System.out.println("\nDisconnected Graph:");
				dfs(i);
				break;
			}
		}
	}
	public int noEntery(){
		boolean isEdge; 
		for(int row =0; row<nVerts; row++){ 
		isEdge = false; 
		for(int col=0; col<nVerts; col++)
		{
		if( adjMat[row][col] > 0 ) // if edge to
		{ // another,
		isEdge = true;
		break; // this vertex
		} // found one 
		} 
		if( !isEdge ) // if no edges,
		return row; // has no successors
		}
		return -1; // no such vertex
		} // end noEntery
	
	public void totp() 
	{
		int orig_nVerts = nVerts; // remember how many verts
		while(nVerts > 0) // while vertices remain,
		{
		// get a vertex with no successors, or -1
		int currentVertex = noEntery();
		if(currentVertex == -1) // must be a cycle
		{
		System.out.println("ERROR: Graph has cycles");
		return;
		}
//		// insert vertex label in sorted array (start at end)
//		sortedArray[nVerts-1] = vertexList[currentVertex].label;
//		deleteVertex(currentVertex); // delete vertex
		} // end while
		// vertices all gone; display sortedArray
		System.out.print("Topologically sorted order: ");
		for(int j=0; j<orig_nVerts; j++)
		//System.out.print( sortedArray[j] );
		System.out.println("");
		} // end topo

	
	

}
