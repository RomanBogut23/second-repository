package helloComp;

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner console = new Scanner(System.in);
	    System.out.print("Enter your number: ");
	    int number = console.nextInt();
	    for(int i=1;i<number+1;i++){
	        if (i%3==0){
	            System.out.print(Integer.toString(i) + ' ');
	        }
	    }
	    System.out.println();
		System.out.println("Total = " + number/3);
	}
}
