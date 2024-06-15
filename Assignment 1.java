package complex;
import java.util.*;

public class complex {
	float real;
	float img;
	public void getdata() {
		float x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Real part of number :");
		x=sc.nextFloat();
		while(x<1 || x>100) {
			System.out.println("Invalid Input!!!");
			System.out.println("Enter Real part of number :");
			x=sc.nextFloat();
		}
		System.out.println("Enter imaginary part of number :");
		y=sc.nextFloat();
		while(y<1 || y>100) {
			System.out.println("Invalid Input!!!");
			System.out.println("Enter imaginary part of number :");
			y=sc.nextFloat();
		}
		real=x;
		img=y;
	}
	public void putdata() {
		System.out.println(real+"+i("+img+")");
		
	}
	
	public void add(complex c1,complex c2) {
		System.out.println("Addition is :");
		real=c1.real+c2.real;
		img=c1.img+c2.img;
	}
	public void sub(complex c1,complex c2) {
		System.out.println("Subtraction is :");
		real=c1.real-c2.real;
		img=c1.img-c2.img;
	}
	public void multi(complex c1,complex c2) {
		System.out.println("Multiplication is :");
		real=(c1.real*c2.real)-1*(c1.img*c2.img);
		img=(c1.real*c2.img)+(c2.real*c1.img);
	}
	public void div(complex c1,complex c2) {
		System.out.println("Division is :");
		if(c2.real==0 && c2.img==0) {
			System.out.println("Not possible.");
		}
		else{
			real=(c1.real*c2.real+c1.img*c2.img)/(c2.real*c2.real+c2.img*c2.img);
			img=(c1.img*c2.real-c1.real*c2.img)/(c2.real*c2.real+c2.img*c2.img);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		complex c1=new complex();
		complex c2=new complex();
		complex c3=new complex();
		boolean flag=true;
		while(flag==true) {
			System.out.println("Enter the Arithmetic operation you want to perform : \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division  ");
			int a=sc.nextInt();
			if(a==1) {
				c1.getdata();
				c2.getdata();
				c3.add(c1, c2);
				c3.putdata();
			}
			else if(a==2) {
				c1.getdata();
				c2.getdata();
				c3.sub(c1, c2);
				c3.putdata();
			}
			else if(a==3) {
				c1.getdata();
				c2.getdata();
				c3.multi(c1, c2);
				c3.putdata();
			}
			else if(a==4) {
				c1.getdata();
				c2.getdata();
				c3.div(c1, c2);
				c3.putdata();
			}
			System.out.println("If you want to use the program again, Enter \n 1. true for Yes \n 2. false for No \n");
			flag=sc.nextBoolean();
			if(flag==false) {
				System.out.println("Thanks for using program.");
				break;
			}
		}
		sc.close();
	}
}
