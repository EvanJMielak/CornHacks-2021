package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import backend.WeekCalendar;

public class EventHandler implements ActionListener {
	
	
	JTextField tf;
	WeekCalendar calendar;
	
	public EventHandler(WeekCalendar calendar) {
		this.calendar = calendar;
	}
	
	
	public void createQuestion() {
    	//Option for inputting schedule times
		/*
		 * JOptionPane startClass = new JOptionPane("What time does your class start?");
		 * JOptionPane.showInputDialog(startClass);
		 */
     
     //Creating the Frame
     JFrame frame = new JFrame("Scheduler");
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setSize(500, 75);

     //Creating the MenuBar and adding components
		/*
		 * JMenuBar mb = new JMenuBar(); JMenu m1 = new JMenu("FILE"); JMenu m2 = new
		 * JMenu("Help"); mb.add(m1); mb.add(m2); JMenuItem m11 = new JMenuItem("Open");
		 * JMenuItem m22 = new JMenuItem("Save as"); m1.add(m11); m1.add(m22);
		 */

     //Creating the panel at bottom and adding components
     JPanel panel = new JPanel(); // the panel is not visible in output
     JLabel label = new JLabel("What does your class start?");
     tf = new JTextField(10); // accepts up to 10 characters
     JButton enter = new JButton("Enter");
     JButton reset = new JButton("Clear");
     panel.add(label); // Components Added using Flow Layout
     panel.add(tf);
     panel.add(enter);
     panel.add(reset);
     
     
     // Text Area at the Center
     //JTextArea ta = new JTextArea();

     //Adding Components to the frame.
		 frame.getContentPane().add(BorderLayout.SOUTH, panel);
			/*
			 * frame.getContentPane().add(BorderLayout.NORTH, mb);
			 * frame.getContentPane().add(BorderLayout.CENTER, ta); 
			 */
			 frame.setVisible(true);		
			//Event Listeners
			  enter.addActionListener(this);
			  tf.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		String text = tf.getText();
		System.out.println(text);
	}
}
