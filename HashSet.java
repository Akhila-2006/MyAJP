package study1;
import java.util.HashSet;

import java.util.Scanner;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Object>  sIDs = new HashSet<Object>();
		int ch;
		Scanner s= new Scanner(System.in);
		do{
			System.out.println("ADD StudentIDs");
			System.out.println("Remove StudentIDs");
			System.out.println("Checking StudentIDs");
			System.out.println("All StudentIDs");
			System.out.println("Exit");
			System.out.println("Enter your choice : ");
			ch = s.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter student id : ");
				int addid=s.nextInt();
                  sIDs.add(addid);
                  System.out.println(sIDs);
                  break;
			case 2:
				System.out.println("Enter  remove student id : ");
				int rID=s.nextInt();
				sIDs.remove(rID);
				System.out.println(sIDs);
				break;
			case 3:
				int cIDS=s.nextInt();
				if(sIDs.contains(cIDS))
					System.out.println(cIDS+ " Present in StudentIDs");
					else
						System.out.println("Not present");
				break;
			case 4:
				System.out.println( "All StudentIDs : " +sIDs);
				break;
			}	
		}while(ch!=5);
}}
