import java.util.*;
abstract class AreaOf {
	double b;
	double h;
	Scanner sc=new Scanner(System.in);
	
	void getdata() {
		System.out.println("Enter Base : ");
		b=sc.nextDouble();
		System.out.println("Enter Height : ");
		h=sc.nextDouble();
	}
}

class rectangle extends AreaOf {
	public void compute_area() {
		double area=b*h;
		System.out.println("Area of Rectangle : "+area);
		System.out.println();
	}
}

class square extends AreaOf{
	public void compute_area() {
		double area=b*h;
		System.out.println("Area of Square : "+area);
		System.out.println();
	}
}

class triangle extends AreaOf{
	public void compute_area() {
		double area=0.5*b*h;
		System.out.println("Area of Triangle : "+area);
		System.out.println();
	}
}

class ellipse extends AreaOf{
	public void compute_area() {
		double area=3.14*b*h;
		System.out.println("Area of Ellipse : "+area);
		System.out.println();
	}
}

public class Area{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		rectangle r=new rectangle();
		square s=new square();
		triangle t=new triangle();
		ellipse e=new ellipse();
		int choice=0;
		System.out.println("Enter The Choice : \n1. Rectangle \n2. Square \n3. Triangle \n4. Ellipse \n5. Exit \n ");
		while(choice!=5){
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				r.getdata();
				r.compute_area();
				break;
				
			case 2:
				s.getdata();
				s.compute_area();	
				break;
				
			case 3:
				t.getdata();
				t.compute_area();
				break;
				
			case 4:
				e.getdata();
				e.compute_area();
				break;
				
			case 5:
				System.out.println("THANK YOU FOR USING THIS PROGRAM!!!!");
				break;
				
			default:
				System.out.println("Invalid Input!!!");
			}
		}
	}
}