/*
 * Mohammadreza shahbazi jalali
 * 
 * professor : Mani Heravi
 * Class : Thursday 
 * project 4
 * Graph
 * 
 */
public class Driver {

	public static void main(String[] args) {

		Graph g = new Graph(12);

		g.addEdge(0, 1);
		g.addEdge(0, 3);
		g.addEdge(0, 5);
		g.addEdge(1, 4);
		g.addEdge(4, 2);
		g.addEdge(3, 6);

		g.addEdge(7, 8);
		g.addEdge(9, 10);
		g.addEdge(10, 11);
		
		g.dfs(0);

	}

}
