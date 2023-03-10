
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;



public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
 Robot rob = new Robot();		
 rob.setSpeed(100);
 rob.setPenWidth(10);

 for(int i=0; i<10; i++)
 {
 String pen = JOptionPane.showInputDialog(null,"what color pen do you want");
if(pen=="red")
{
rob.setPenColor(10,0,0);
}
else if(pen=="green")
 {
 rob.setPenColor(0,10,0);
 }
else if(pen=="blue")
 {
 rob.setPenColor(0,10,0);
 }
else
{
	rob.setRandomPenColor();
}
rob.penDown();
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
rob.move(100);
rob.turn(90);
 
 }
}
}