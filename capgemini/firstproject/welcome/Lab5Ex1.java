package capgemini.firstproject.welcome;

import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Lab5Ex1 extends JFrame implements ActionListener {
	JRadioButton r1 = new JRadioButton("RED");
	JRadioButton r2 = new JRadioButton("YELLOW");
	JRadioButton r3 = new JRadioButton("GREEN");
	JButton b;

	public static void main(String[] args) {
		Lab5Ex1 lab = new Lab5Ex1();
		lab.traffic();
	}

	public void traffic() {
//		JRadioButton r1 = new JRadioButton("RED");
		r1.setBounds(100, 100, 80, 30);
//		JRadioButton r2 = new JRadioButton("YELLOW");
		r2.setBounds(100, 130, 80, 30);
//		JRadioButton r3 = new JRadioButton("GREEN");
		r3.setBounds(100, 160, 80, 30);

		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		b = new JButton("click");
		b.setBounds(100, 200, 80, 30);
		b.addActionListener(this);
		add(r1);
		add(r2);
		add(r3);
		add(b);

		setSize(400, 400);
		setLayout(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (r1.isSelected()) {
			JOptionPane.showMessageDialog(this, "STOP");
		} else if (r2.isSelected()) {
			JOptionPane.showMessageDialog(this, "WAIT");
		} else if (r3.isSelected()) {
			JOptionPane.showMessageDialog(this, "GO");
		}
	}

}
//import javax.swing.*;
//import java.awt.event.*;
//
//@SuppressWarnings("serial")
//class Lab5Ex1 extends JFrame implements ActionListener {
//	JRadioButton rb1, rb2;
//	JButton b;
//
//	Lab5Ex1() {
//		rb1 = new JRadioButton("Male");
//		rb1.setBounds(100, 50, 100, 30);
//		rb2 = new JRadioButton("Female");
//		rb2.setBounds(100, 100, 100, 30);
//		ButtonGroup bg = new ButtonGroup();
//		bg.add(rb1);
//		bg.add(rb2);
//		b = new JButton("click");
//		b.setBounds(100, 150, 80, 30);
//		b.addActionListener(this);
//		add(rb1);
//		add(rb2);
//		add(b);
//		setSize(300, 300);
//		setLayout(null);
//		setVisible(true);
//	}
//
//	public void tick(ActionEvent e) {
//		if (r1.isSelected()) {
//			JOptionPane.showMessageDialog(this, "STOP");
//		} else if (r2.isSelected()) {
//			JOptionPane.showMessageDialog(this, "WAIT");
//		} else if (r3.isSelected()) {
//			JOptionPane.showMessageDialog(this, "GO");
//		}
//	}
//
//	public static void main(String args[]) {
//		new Lab5Ex1();
//	}
//}