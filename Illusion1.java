import java.util.Random;
import java.awt.*;

import javax.swing.*;

public class Illusion1 extends JFrame {

	public Illusion1() {
		super("Optical Illusion");
		setSize(600, 600);
		setVisible(true);
		repaint();
	}

	public void paint(Graphics g) {

		super.paint(g);
		g.setColor(Color.black);
		g.fillRect(0, 0, 600, 600);
		g.setColor(Color.white);
		
		for (int i = 0; i <= 600; i += 50) {
			g.fillRect(i, 0, 10, 600);
		}
		
		for (int i = 0; i <= 600; i += 50) {
			g.fillRect(0, i, 600, 10);
		}
		
		
		try {
			Thread.currentThread().sleep(200);
		}
			catch (InterruptedException e)   {
				e.printStackTrace();
			}
		
		
		}

	

	public static void main(String args[]) {
		Illusion1 application = new Illusion1();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
