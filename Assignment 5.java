import java.util.*;

interface Vehicles{
	void gearchange();
	void speed();
	void brakes();
}

class Bicycle implements Vehicles{
	static int gear=0;
	static int speed=0;
	boolean start=false;
	Scanner sc = new Scanner(System.in);
	void menu(){
		System.out.println("Enter the Operation you want to perform : \n1. Gear Change \n2. Speed Change \n3. Brakes \n4. Exit \n");
	}
	public void gearchange(){
		if(gear==5) {
			System.out.println("Bicycle already at maximum gear.");
			System.out.println("Bicycle is moving at it's maximum speed : "+speed);
		}
		else if(gear <5) {
			gear++;
			System.out.println("Bicycle is at "+gear+"th gear. \n");
			speed+=5;
			System.out.println("Bicycle is running at "+speed+" speed. \n");
			start=true;
		}
	}
	public void speed(){
		gearchange();
	}
	public void brakes(){
		if(gear==0 && start==false) {
			System.out.println("Bicycle is already at rest! \n");
		}
		else if(gear==0 && start==true) {
			System.out.println("Bicycle has come to rest! \n");
		}
		else {
			speed-=5;
			gear-=1;
			System.out.println("Bicycle is at "+gear+"th gear.");
			System.out.println("Bicycle is moving at "+speed+" speed");
		}
	}
	void drive(){
		int ch=0;
		while(ch!=4){
			menu();
			ch=sc.nextInt();
			switch(ch){
			case 1:
				gearchange();
				break;
			case 2:
				speed();
				break;
			case 3:
				brakes();
				break;
			case 4:
				System.out.println("CHOOSE ANOTHER VEHICLE!!!!");
				break;
			default:
				System.out.println("Invalid Input!!!!");
				break;
			}
		}
		
	}
}

class Bike implements Vehicles{
	static int gear=0;
	static int speed=0;
	boolean start=false;
	Scanner sc = new Scanner(System.in);
	void menu(){
		System.out.println("Enter the Operation you want to perform : \n1. Gear Change \n2. Speed Change \n3. Brakes \n4. Exit \n");
	}
	public void gearchange(){
		if(gear==5) {
			System.out.println("Bike already at maximum gear.");
			System.out.println("Bike is moving at it's maximum speed : "+speed);
		}
		else if(gear <5) {
			gear++;
			System.out.println("Bike is at "+gear+"th gear. \n");
			speed+=20;
			System.out.println("Bike is running at "+speed+" speed. \n");
			start=true;
		}
	}
	public void speed(){
		gearchange();
	}
	public void brakes(){
		if(gear==0 && start==false) {
			System.out.println("Bike is already at rest! \n");
		}
		else if(gear==0 && start==true) {
			System.out.println("Bike has come to rest! \n");
		}
		else {
			speed-=20;
			gear-=1;
			System.out.println("Bike is at "+gear+"th gear.");
			System.out.println("Bike is moving at "+speed+" speed");
		}
	}
	void drive(){
		int ch=0;
		while(ch!=4){
			menu();
			ch=sc.nextInt();
			switch(ch){
			case 1:
				gearchange();
				break;
			case 2:
				speed();
				break;
			case 3:
				brakes();
				break;
			case 4:
				System.out.println("CHOOSE ANOTHER VEHICLE!!!!");
				break;
			default:
				System.out.println("Invalid Input!!!!");
				break;
			}
		}
		
	}
}

class Car implements Vehicles{
	static int gear=0;
	static int speed=0;
	boolean start=false;
	Scanner sc = new Scanner(System.in);
	void menu(){
		System.out.println("Enter the Operation you want to perform : \n1. Gear Change \n2. Speed Change \n3. Brakes \n4. Exit \n");
	}
	public void gearchange(){
		if(gear==5) {
			System.out.println("Car already at maximum gear.");
			System.out.println("Car is moving at it's maximum speed : "+speed);
		}
		else if(gear <5) {
			gear++;
			System.out.println("Car is at "+gear+"th gear. \n");
			speed+=25;
			System.out.println("Car is running at "+speed+" speed. \n");
			start=true;
		}
	}
	public void speed(){
		gearchange();
	}
	public void brakes(){
		if(gear==0 && start==false) {
			System.out.println("Car is already at rest! \n");
		}
		else if(gear==0 && start==true) {
			System.out.println("Car has come to rest! \n");
		}
		else {
			speed-=25;
			gear-=1;
			System.out.println("Car is at "+gear+"th gear.");
			System.out.println("Car is moving at "+speed+" speed");
		}
	}
	void drive(){
		int ch=0;
		while(ch!=4){
			menu();
			ch=sc.nextInt();
			switch(ch){
			case 1:
				gearchange();
				break;
			case 2:
				speed();
				break;
			case 3:
				brakes();
				break;
			case 4:
				System.out.println("CHOOSE ANOTHER VEHICLE!!!!");
				break;
			default:
				System.out.println("Invalid Input!!!!");
				break;
			}
		}
		
	}
}

public class Driver{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int opt=0;
		while(opt!=4){
			System.out.println("Enter Your Choice : \n1. Bicycle \n2. Bike \n3. Car \n4. Exit \n");
			opt=sc.nextInt();
			switch(opt){
			case 1:
				Bicycle a=new Bicycle();
				a.drive();
				break;
			case 2:
				Bike b=new Bike();
				b.drive();
				break;
			case 3:
				Car c=new Car();
				c.drive();
				break;
			case 4:
				System.out.println("THANK YOU FOR USING THIS PROGRAM!!!!! \n");
				break;
			default:
				System.out.println("Invalid Input!!!! \n");
			}
		}
	}

}
