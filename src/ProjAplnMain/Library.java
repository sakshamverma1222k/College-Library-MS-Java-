package ProjAplnMain;

import java.util.Scanner;

public class Library {

		public void addBook() {
			System.out.println("Enter Book Name you want to add-");
			Scanner obj2 = new Scanner(System.in);
			String str = obj2.nextLine();
			System.out.println("Enter Book Price you want to add.");
			float price = obj2.nextInt();
			System.out.println("Enter Book Id you want to add.");
			float Bookno = obj2.nextInt();
			System.out.println("You have sucessfully added Book:"+str+", its price is "+price+"Rs & its Id is-"+Bookno);
			obj2.close();
		}
	
}