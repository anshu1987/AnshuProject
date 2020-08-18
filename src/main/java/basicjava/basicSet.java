package basicjava;

import java.util.Scanner;

public class basicSet {
    //Write a Java program to print 'Hello' on screen and then print your name on a separate line.

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your first name");
        String first_name = input.next();
        System.out.println("first name enter as" + first_name);
        System.out.println("Please Enter your last name");
        String last_name = input.next();
        System.out.println("Last name enter as" + last_name);
        System.out.print(first_name + "\n" + last_name);
    }
	
/*	Sample Pattern :

		   J    a   v     v  a                                                  
		   J   a a   v   v  a a                                                 
		J  J  aaaaa   V V  aaaaa                                                
		 JJ  a     a   V  a     a */


}
