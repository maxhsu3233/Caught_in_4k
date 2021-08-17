package poopyhead;

import java.util.Scanner;//scanner is a tool of input

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner word = new Scanner (System.in);
		//create a variable that the type Scanner ,then user input something to the variable
		int number = word.nextInt();
		//turn the variable to the integer
		System.out.print(number);
		//turn the variable to the integer
		//mix with for loop and I want to print it for 12 times.
		for(int i = 0;i < 3000000; i = i+1 ) {
			System.out.println(number);
			//"i" will plus one when the for loop run once.
			if (i<3) {//if i is less than three
				System.out.println("bummer is less than three");
			}else if (i == 5) {
				System.out.println("i is not anything");
				
			}
		}
 	}

}
