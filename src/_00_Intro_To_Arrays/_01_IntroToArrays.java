package _00_Intro_To_Arrays;

import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
    	String [] bodyParts = new String[5];
    	
    	bodyParts[0] = "Head";
    	bodyParts[1] = "Arms";
    	bodyParts[2] = "Legs";
    	bodyParts[3] = "Feet";
    	bodyParts[4] = "Hands";
        // 2. print the third element in the array
    	
		
        // 3. set the third element to a different value
            bodyParts[2]="Nose";
        // 4. print the third element again
            System.out.println(bodyParts[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
            for(int i = 0; i < bodyParts.length; i++){
                String s = bodyParts[i];
                bodyParts[i]="deez";
      System.out.println(bodyParts[i]);
            }         
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE

        // 7. make an array of 50 integers
            int [] ints = new int[49];
        // 8. use a for loop to make every value of the integer array a random
        //    number
           
            for (int i = 0; i < ints.length; i++) {
				Random rand = new Random();
           rand.nextInt(50);
            	
 ints [i]= rand.nextInt(50);
		  System.out.println(ints [i]);
            }
          
        // 9. without printing the entire array, print only the smallest number
        //    on the array
         int small = 50;
            for (int j = 0; j < ints.length; j++) {
			if (ints [j] < small) {
				small= ints [j];
			
			}
			System.out.println(small);
		}	
        // 10 print the entire array to see if step 8 was correct

        // 11. print the largest number in the array.
           int big = 50;
            for (int i = 0; i < ints.length; i++) {
			if (ints [i]> big) {
				big = ints [i];
			} 
            	
            	System.out.println(big);
			}
        // 12. print only the last element in the array
          for (int i = 0; i < ints.length; i++) {
			
		
            System.out.println(ints [49]);
    }
    	}
    }

