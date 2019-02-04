import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstFrame {

	public static void main(String[] args) 
	{
		JFrame myFrame = new JFrame();
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setBounds(300, 200, 500, 250);
		myFrame.setLayout(null);
		JLabel lbl1 = new JLabel("woooo");
		lbl1.setBounds(40, 30, 100, 30);
		myFrame.add(lbl1);
		JButton button1 = new JButton("Yayyyy");
		button1.setSize(new Dimension(100, 30));
		button1.setLocation(new Point(180, 30));
		button1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{ 
				lbl1.setText("^_^");
				button1.setLocation((int) (Math.random()*500 + 100), (int)(Math.random()*200 + 100));
			}
		});
		myFrame.add(button1);
		
		
	}

}
