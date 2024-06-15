package Publication;

import java.util.*;
public class Publication {
	public class Pub{
		Scanner sc = new Scanner(System.in);
		String title;
		float price;
		int copies;
		float totalSale=0;
		void saleCopy(int qty,float price){
			totalSale+=(qty*price);
		}
		void menu(){
			System.out.println("#MENU#\n1. Press 1 to Order Book \n2. Press 2 to Order Magazine \n3. Press 3 to Restock Books \n4. Press 4 to Restock Magazines \n5. Press 5 to Find Total Book Sales \n6. Press 6 to Find Total Magazine Sales \n7. Press 7 to Find Total Publication Sales \n8. Press 8 for Any further order(0/1) \n");
		}
		void initialbooks(book b){
			System.out.println("Enter Initial Stock of Books :\n");
			b.copies=sc.nextInt();
		}
		void initialmagazines(magazine m){
			System.out.println("Enter Initial Stock of Magazines :\n");
			m.copies=sc.nextInt();
		}
	}

	public class book extends Pub{
		String author;
		int order;
		Scanner sc = new Scanner(System.in);
		float totalSale = 0;
		void saleCopy(int qty,float price){
			totalSale+=(qty*price);
		}
	}
	public class magazine extends Pub{
		int orderQty;
		float totalSale=0;
		void receiveIssue(int qty){
			copies+=qty;
		}
		void saleCopy(int qty,float price){
			totalSale+=(qty*price);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Publication pb = new Publication();
		Pub p = pb.new Pub();
		p.menu();
		book b = pb.new book();
		b.initialbooks(b);
		magazine m = pb.new magazine();
		m.initialmagazines(m);		
		int a = 1;
		while(a==1){
			System.out.println("Enter Your Choice :\n");
			int choice = sc.nextInt();
			switch(choice){
			case 1:
				
				System.out.println("Enter the name of the Author :\n");
				b.author=sc.next();
				System.out.println("Enter the Title of the Book :\n");
				b.title=sc.next();
				System.out.println("Enter the Price of the Book :\n");
				b.price=sc.nextFloat();
				System.out.println("Enter Order Quantity :\n");
				b.order=sc.nextInt();
				if(b.copies<b.order){
					System.out.println("Out of stock!!!");
				}
				else{
					b.saleCopy(b.order,b.price);
					p.saleCopy(b.order,b.price);
					b.copies-=b.order;
				}
				System.out.println("No. of Copies Available :\n");
				System.out.println(b.copies);
				break;
			case 2:
				
				System.out.println("Enter the Title of the Magazine :\n");
				m.title=sc.next();
				System.out.println("Enter the Price of the Magazine :\n");
				m.price=sc.nextFloat();
				System.out.println("Enter the Order Quantity of Magazine :\n");
				m.orderQty=sc.nextInt();
				if(m.orderQty>m.copies){
					System.out.println("Out of stock!!!\n");
				}
				else {
					m.saleCopy(m.orderQty, m.price);
					p.saleCopy(m.orderQty,m.price);
					m.copies-=m.orderQty;
				}
				System.out.println("No. of Copies Available :\n");
				System.out.println(m.copies);
				break;
			case 3:
				System.out.println("Enter the Name of Author :\n");
				b.author=sc.next();
				System.out.println("Enter the Title of the Book :\n");
				b.title=sc.next();
				System.out.println("Enter the Price of the Book :\n");
				b.price=sc.nextFloat();
				System.out.println("Enter the Order Quantity of Books :\n");
				b.copies+=sc.nextInt();
				System.out.println("No. of Available Copies :\n");
				System.out.println(b.copies);
				break;
			case 4:
				System.out.println("Enter the Title of the Magazine :\n");
				m.title=sc.next();
				System.out.println("Enter the Price of the Magazine :\n");
				m.price=sc.nextFloat();
				System.out.println("Enter the Order Quantity of Magazine :\n");
				m.copies+=sc.nextInt();
				System.out.println("No. of Available Copies :\n");
				System.out.println(m.copies);
				break;
			case 5:
				System.out.println("Total Sales of Books :\n");
				System.out.println(b.totalSale);
				break;
			case 6:
				System.out.println("Total Sale of Magazines :\n");
				System.out.println(m.totalSale);
				break;
			case 7:
				System.out.println("Total Publication Sales :\n");
				System.out.println(p.totalSale);
				break;
			}
			System.out.println("Any Further Orders :\n");
			a=sc.nextInt();
			if(a==0){
				System.out.println("THANK YOU FOR USING THE PROGRAM!!!");
				break;
			}
		}
	}
}