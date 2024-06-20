package javatestsmaven;

import java.util.Scanner; //package is java.util. Scanner is the class inside package

public class ScanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=obj.nextLine();
		System.out.println("My name is "+name);
	}

}
