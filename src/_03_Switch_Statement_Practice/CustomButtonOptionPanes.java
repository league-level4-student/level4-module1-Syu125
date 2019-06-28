package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];

		// use a switch statement to do something cool for each option
		switch (choice) {
		case "Sunday":
			JOptionPane.showMessageDialog(null, "Today at the bank a lady asked me to check her balance.");
			JOptionPane.showMessageDialog(null, "So I pushed her over.");
			break;
		case "Monday":
			JOptionPane.showMessageDialog(null, "My boss told me to have a good day.");
			JOptionPane.showMessageDialog(null, "So I went home.");
			break;
		case "Tuesday":
			JOptionPane.showMessageDialog(null, "Once my dog ate all the Scrabble tiles.");
			JOptionPane.showMessageDialog(null, "He kept leaving messages around the house.");
			break;
		case "Wednesday":
			JOptionPane.showMessageDialog(null, "I told my sister she was drawing her eyebrows too high.");
			JOptionPane.showMessageDialog(null, "She looked surprised.");
			break;
		case "Thursday":
			JOptionPane.showMessageDialog(null, "What do you get from a pampered cow?");
			JOptionPane.showMessageDialog(null, "Spoiled milk!");
			break;
		case "Friday":
			JOptionPane.showMessageDialog(null, "What do you call a cow with no legs?");
			JOptionPane.showMessageDialog(null, "It doesn't matter what you call him. He's not coming.");
			break;
		case "Saturday":
			JOptionPane.showMessageDialog(null, "What did the traffic light say to the car?");
			JOptionPane.showMessageDialog(null, "Don't look! I'm about to change!");
			break;
		}

	}
}
