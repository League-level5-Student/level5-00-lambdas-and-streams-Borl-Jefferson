package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons implements ActionListener {
	private JFrame window = new JFrame(); 
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener( e -> {
			int numadd=0;
			Boolean broke=false;
			String add = JOptionPane.showInputDialog("Number 1 / 2");
			try {
			numadd = Integer.parseInt(add);
			System.out.print(numadd);
			}catch (NumberFormatException t) {
				JOptionPane.showMessageDialog(null, "String inputed was not an int.");
				broke=true;
			}
			if(!broke) {
				String add2 = JOptionPane.showInputDialog("Number 2 / 2");
				try {
				int numadd2 = Integer.parseInt(add2);
				System.out.println(" + " + numadd2 + " = " + (numadd+numadd2));
				}catch (NumberFormatException t) {
					JOptionPane.showMessageDialog(null, "String inputed was not an int");
				}
			}
			
		});
		
		randNumber.addActionListener( e -> {
		String mm = JOptionPane.showInputDialog("Enter the lowest and highest number seperated by a comma and space");
		String[] split = mm.split(", ");
		int min = Integer.parseInt(split[0]);
		int max = Integer.parseInt(split[1]);
		if(min>max) {
			int p = min;
			min=max;
			max=p;
		}
		System.out.println("min: "+min + " | max: "+max);
		Random r = new Random();
		System.out.println(r.nextInt(max+1-min)+min);
		});
		
		tellAJoke.addActionListener( e -> {
			String joke = JOptionPane.showInputDialog("Tell me a joke");
			System.out.println("Wanna hear a joke?\n"+joke);
		});
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
