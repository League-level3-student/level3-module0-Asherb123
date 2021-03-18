package _01_Simple_Array_Algorithms;

import java.util.ArrayList;
import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
public static void main(String[] args) {
	
	//MoreArrayFun c = new MoreArrayFun();
	
	MoreArrayFun a = new MoreArrayFun();

	
	String [] dope = new String [4];
	
	dope [0] = "Bike";
	dope [1] = "Car";
	dope [2] = "Plane";
	dope [3] = "Train";
	
	a.randPrint(dope);
	
	
//	String [] revArray = new String[3];
	
	//revArray [0] = "Joe Father";
	//revArray [1] = "Joe Mamma";
	//revArray [2]= "Joe Sister";
	
	//a.revPrint(revArray);

	
	//	String [] names = new String[3];
	//names [0] = "Johnny";
	//names[1]="Cody";
//	names [2] = "Joe Mamma";
	
	
	
	
	
}
    //2. Write a method that takes an array of Strings and prints all the Strings in the array.


 
void name (String [] names ) {
	
	 
	
	for (int i = 0; i < names.length; i++) {
		System.out.println(names[i]);
	}
	
	
	
}

    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
void revPrint (String [] revArray ) {
	
	for (int i = revArray.length-1 ; i >= 0; i--) {
		System.out.println(revArray [i]);
	}
}


    //4. Write a method that takes an array of Strings and prints every other String in the array.
void dopeStuff (String [] dope ) {
	
	for (int i = 0; i < dope.length; i+=2) {
		System.out.println(dope[i]);
	}
	
}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.


void randPrint(String [] randArray ) {
	
	Random rand = new Random();
	
	ArrayList <String> randArray1 = new ArrayList<>();
	
	
	for (int i = 0; i < randArray.length; i++) {
		randArray1.add(randArray [i]);
	}
	for (int i = randArray1.size()-1; i >= 0; i--) {
		System.out.println(randArray1.remove(rand.nextInt(randArray1.size())));
	}
}

}
