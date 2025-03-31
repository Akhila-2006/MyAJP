package study1;

import java.util.ArrayList;

import java.util.Scanner;

class Book{
	String name;
	int id;
	String author;
	Book(String name,int id,String author){
		this.name=name;
		this.id=id;
		this.author=author;
	}
	String getName() {
		return this.name;
	}
	int getId() {
		return this.id;
	}
	String getAuthor() {
		return this.author;
	}
}
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Book> u=new ArrayList<>();
		Scanner om =new Scanner(System.in);
		int count=0;
		int ch;
		do{
			System.out.println("LibraryCatalog.....");
			System.out.println("1.Adding Books 2.Removing Books 3.Displaying 4.exit");
			System.out.print("Enter your choice: ");
			ch=om.nextInt();
			om.nextLine();
			switch(ch) {
			case 1:
				System.out.print("Enter Book name :");
				String name=om.nextLine();
				System.out.print("Enter Book-Id : ");
				int id=om.nextInt();
				om.nextLine();
				System.out.print("Enter Author name");
				String author=om.nextLine();
				u.add( new Book(name,id,author));
				break;
			case 2:
				if(u.isEmpty())
					System.out.println("List is Empty");
				else {
				System.out.print("Enter the book id : ");
				int del=om.nextInt();
				for(int i=0;i<u.size();i++) {
					 if((u.get(i).id)==del) {
						u.remove(i); 
					 }
				}
				System.out.println("Book " +del+" is deleted.");
				}
				break;
			case 3:
				if(u.isEmpty())
					System.out.println("List is Empty");
				else {
				for(Book b:u)
					System.out.println(b.getName()+" "+b.getId()+" "+b.getAuthor());
				}
				break;
			}
		}while(ch!=4);
	}
}
