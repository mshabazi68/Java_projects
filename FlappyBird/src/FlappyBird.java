import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.Timer;

public class FlappyBird implements ActionListener {

	public static FlappyBird flappyBird;

	public final int WIDTH = 800, HEIGHT = 800;

	public Renderer renderer;

	public Rectangle bird;

	public ArrayList<Rectangle> columns;

	public int ticks, yMotion, score;

	// public boolean gameOver, started;

	public Random rand;

	// Constructor
	public FlappyBird() {
		JFrame jframe = new JFrame();
		Timer timer = new Timer(20, this);
		renderer = new Renderer();
		rand = new Random();
		
		jframe.add(renderer); // add the render to the Jframe
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(WIDTH, HEIGHT);
		jframe.setVisible(true);
		jframe.setResizable(false);
		jframe.setTitle("Flappy Bird");

		// we want to make it in the center of the screen so we do 2-10
		bird = new Rectangle(WIDTH / 2 - 10, HEIGHT / 2 - 10, 20, 20);
		columns = new ArrayList<Rectangle>();
		
		addColumn(true);
		addColumn(true);
		addColumn(true);
		addColumn(true);
		
		timer.start();
	}

	// repaint method
	public void repaint(Graphics g) {

		// setting the background color
		g.setColor(Color.cyan);
		g.fillRect(0, 0, WIDTH, HEIGHT);

		// setting the lower background color
		g.setColor(Color.orange);
		g.fillRect(0, HEIGHT- 120, WIDTH, 120);
		
		// setting The grass color
		g.setColor(Color.green);
		g.fillRect(0, HEIGHT - 120, WIDTH, 20);

		// Setting color for bird
		g.setColor(Color.RED);
		g.fillRect(bird.x, bird.y, bird.width, bird.height);
		
		// adding the columns 
		for(Rectangle column : columns) {
			paintColumn(g, column);
		}
	}
	
	
	// Adding the Game here
	public void addColumn(boolean start) {
		int space=300;
		int width=100;
		int height = 50 + rand.nextInt(300);
		if (start) {
		
		// subtracting 120 to put the columns on top the grass (green rectangle) 
		columns.add(new Rectangle(WIDTH + width + columns.size()* 300 , HEIGHT-height -120, width, height));
		columns.add(new Rectangle(WIDTH + width + (columns.size()-1)*300 , 0 , width , HEIGHT-height -space));
		}else {
			// get the last columns then the add the column add the 600 
			columns.add(new Rectangle(columns.get(columns.size()-1).x+600 , HEIGHT-height -120, width, height));
			columns.add(new Rectangle(columns.get(columns.size()-1).x , 0 , width , HEIGHT-height -space));
			
		}
	
	}
	public void makeColumn(Graphics g , Rectangle column) {
		g.setColor(Color.green.darker());
		g.fillRect(column.x , column.y , column.width, column.height);
	}
	
	public void paintColumn(Graphics g , Rectangle column) {
		g.setColor(Color.green.darker());
		g.fillRect(column.x, column.y, column.width, column.height);
	}

	// Button action
	@Override
	public void actionPerformed(ActionEvent e) {
		int speed = 10;
		ticks++;
		for( int i=0; i<columns.size(); i++) {
			Rectangle column = columns.get(i);
			column.x -= speed;
		}
		if(ticks %2 ==0 && yMotion <15) {
			yMotion += 2;
		}
		
		bird.y += yMotion;
		
		renderer.repaint();
	}

	// Driver method
	public static void main(String[] args) {
		flappyBird = new FlappyBird();
	}

}