
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	
		String I = JOptionPane.showInputDialog(null,"Who's birthday do you want to print");
		
		if(I.equals("mom"))
	{
	JOptionPane.showMessageDialog(null, momsBirthday);
	}
	else if(I.equals("dad"))
	{
	JOptionPane.showMessageDialog(null, dadsBirthday);
	}
	else if(I.equals("Sashrik"))
	{
	JOptionPane.showMessageDialog(null, myBirthday);
	}
	else 
	{
		JOptionPane.showMessageDialog(null,"Sorry i don't remeber that persons name");
	}
	
	
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
