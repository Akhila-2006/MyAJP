package study1;
import java.util.LinkedList;

import java.util.Scanner;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Object>  Cnames = new LinkedList<Object>();
		int ch;
		Scanner s= new Scanner(System.in);
		do{
			
			System.out.println("1.Adding Customers");
			System.out.println("2. Serve and Remove Customers");
			System.out.println("3.All Customers");
			System.out.println("Press 4  to Exit");
			System.out.println("Enter your choice : ");
			ch = s.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter customer name: ");
			       String cname =s.next();
                  Cnames.addFirst(cname);
                  System.out.println(Cnames);
                  break;
			case 2:
				System.out.println("Remove Customers");
				Cnames.removeLast();
				System.out.println("After removal of customers : " +Cnames);
				break;
			case 3:
				System.out.println( "All Customers : " +Cnames);
				break;
			}	
			
		}while(ch!=4);
}
}
