package tutorials;

import javax.swing.JOptionPane;

public class HelloNameDialoge {

	public static void main(String[] args) {
		// This asks your name and then says Hello to you
		String result;
		result = JOptionPane.showInputDialog(null, "What is your name?");
		JOptionPane.showMessageDialog(null, "Hello, " + result + "!");

		}
	
}
