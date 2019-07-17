package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	
	// 3. Make a main method to test your method
	

public static void main(String[] args) {
	Zodiac z = Zodiac.CAPRICORN;
	change(z);
}
static void change(Zodiac z) {
	switch(z) {
	case ARIES:
		JOptionPane.showMessageDialog(null, "Element: Fire");
		break;
	case TAURUS:
		JOptionPane.showMessageDialog(null, "Element: Earth");
		break;
	case GEMINI:
		JOptionPane.showMessageDialog(null, "Element: Air");
		break;
	case CANCER:
		JOptionPane.showMessageDialog(null, "Element: Water");
		break;
	case LEO:
		JOptionPane.showMessageDialog(null, "Element: Fire");
		break;
	case VIRGO:
		JOptionPane.showMessageDialog(null, "Element: Earth");
		break;
	case LIBRA:
		JOptionPane.showMessageDialog(null, "Element: Air");
		break;
	case SCORPIO:
		JOptionPane.showMessageDialog(null, "Element: Water");
		break;
	case SAGITTARIUS:
		JOptionPane.showMessageDialog(null, "Element: Fire");
		break;
	case CAPRICORN:
		JOptionPane.showMessageDialog(null, "Element: Earth");
		break;
	case AQUARIUS:
		JOptionPane.showMessageDialog(null, "Element: Air");
		break;
	case PISCES:
		JOptionPane.showMessageDialog(null, "Element: Water");
		break;
		
	}
	
}
}