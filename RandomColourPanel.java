import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//*When you click on the panel it will change to another random colour. */

public class RandomColourPanel extends JFrame {
	JPanel panel; //component in frame that holds other things
	
	public RandomColourPanel() {
		panel = new JPanel();
		panel.setBackground(randomColor()); //background colour
		add(panel); //adds panel to the frame
		
		event e = new event();
		panel.addMouseListener(e); //MouseListener keeps track of mouse actions
	}
	
	public Color randomColor() { //method: rgb values for colors --> 256 possible combinations of red, green, and blue
		int r = (int)(Math.random()*256); //red
		int g = (int)(Math.random()*256); //green
		int b = (int)(Math.random()*256); //blue
		
		return(new Color(r, g, b));
	}
	
	public class event implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			panel.setBackground(randomColor()); // TODO Auto-generated method stub	
		}

		@Override
		public void mousePressed(MouseEvent e) { // TODO Auto-generated method stub	
		}

		@Override
		public void mouseReleased(MouseEvent e) { // TODO Auto-generated method stub	
		}

		@Override
		public void mouseEntered(MouseEvent e) { // TODO Auto-generated method stub	
		}

		@Override
		public void mouseExited(MouseEvent e) { // TODO Auto-generated method stub	
		}
	}
	
	public static void main(String[] args) { 
		RandomColourPanel frame = new RandomColourPanel(); //creates window frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Click Panel To Change Its Colour!");
		frame.setSize(400, 400);
	}
}
