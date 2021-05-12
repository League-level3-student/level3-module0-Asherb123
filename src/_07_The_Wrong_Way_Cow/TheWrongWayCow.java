/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

public class TheWrongWayCow {

    public static int[] findWrongWayCow(final char[][] field) {
        // Fill in the code to return the [col, row] coordinate position of the
        // head (letter 'c') of the wrong way cow!
        int up = 0;
        int down = 0;
        int left = 0;
        int right = 0;
        
        int [] u  = new int [2];
        int [] d = new int [2];
        int [] l = new int [2];
        int [] r = new int [2];
        
        for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
			if (field [i] [j] == 'c' ) {
				if (i>=2 && field [i-1][j] == 'o' && field [i-2][j] == 'w' ) {
					left = left +1;
					l [0]=j;
					l [1] = i;
					
					
					
				}
			if ( i<=field.length-3 && field [i+1][j] == 'o' && field [i+2][j]=='w') {
				
				right=right+1;
				
				r [0]=j;
				r [1] = i;
			}
			if (j>= 2 && field [i][j-1]== 'o' && field [i][j-2] == 'w') {
				up=up+1;
				u [0]=j;
				u [1] = i;
			}
			if (j<=field[i].length-3 && field [i][j+1] == 'o' &&  field [i][j+2] == 'w') {
				down = down+1;	
				d [0]=j;
				d [1] = i;
			}
			
			}
				
				
			}
		}
       if (up==1) {
		return u;
	}
      if (down==1) {
		return d;
	}  
      if (left==1) {
		return l;
	}
      if (right == 1) {
	 return r;
	}
      
      
      
        return null;
    }
}
