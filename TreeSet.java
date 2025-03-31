package study1;

import java.util.Scanner;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Object> snames = new TreeSet<Object>();
		int ch;
		Scanner s= new Scanner(System.in);
		do{
			System.out.println("1.Adding Studentnames");
			System.out.println("2.Remove Studentnames");
			System.out.println("3.Display Studentnames in alphabeticalorder");
			System.out.println("Press 4  to Exit");
			System.out.println("Enter your choice : ");
			ch = s.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter Student name: ");
			       String sname =s.next();
                  snames.add(sname);
                  System.out.println(snames);
                  break;
			case 2:
				System.out.println(" Enter Remove Studentname: ");
				String rname=s.next();
				snames.remove(rname);
				System.out.println("After removal of students : " +snames);
				break;
			case 3:
				System.out.println( "All student names in alpbabetical order : " +snames);
				break;
			}	
			
		}while(ch!=4);
}
}
