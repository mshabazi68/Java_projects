
	import java.awt.Graphics;

	import javax.swing.JPanel;

	public class Renderer extends JPanel
	{

		private static final long serialVersionUID = 1L;

		// paint the back ground and panel 
		@Override
		protected void paintComponent(Graphics g)
		{
			super.paintComponent(g);

			FlappyBird.flappyBird.repaint(g);
		}
		
	}

