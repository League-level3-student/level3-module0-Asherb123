package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    	// 1. make a main method
	public static void main(String[] args) {
		
	
        // 2. create an array of 5 robots.
		Robot [] robots = new Robot [5] ;
		
	 	

	
	// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			}
        // 4. make each robot start at the bottom of the screen, side by side, facing up
		for (int i = 0; i < robots.length; i++) {
			Random random = new Random();
			robots [i].setY(400);
			robots [i].setX(random.nextInt(800));
		}
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
		Boolean getHigh = false;
		
		while (!getHigh) {
			
				
			
			for (int i = 0; i < robots.length; i++) {
				Random rand = new Random();
				robots [i].move(rand.nextInt(50));
				
				if (robots [i].getY()<=50) {
					getHigh=true;
				break;
				}
				
			}
      }  
			// 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
			
        // 7. declare that robot the winner and throw it a party!
		
			if (getHigh=true) {
				JOptionPane.showMessageDialog(null, "We have a winner!");
			
		}
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.
		
}
}