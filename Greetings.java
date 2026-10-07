import java.awt.*;
import javax.swing.*;

public class Greetings extends JPanel {
	
   private int myWindowWidth = 300;
   private int myWindowHeight = 400;
	
   public Greetings() {
      JFrame easel = new JFrame();		
      easel.setSize (myWindowWidth, myWindowHeight);
      easel.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      easel.add (this);
      easel.setVisible (true);
   }
	
   public void paintComponent (Graphics g) {
      g.drawString ("Hi there!", 150, 200);	
      g.drawRect(125, 170, 100, 50);
   }
}