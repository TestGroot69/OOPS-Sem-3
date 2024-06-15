import java.util.*;
public class Assn6 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter the size of the array : \n");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Elements of array : \n");
		for(int i=0;i<n;i++) {
			try
			{
			arr[i]=sc.nextInt();
			}
			catch(Exception e)
			{
				System.out.println(" number format ");
			}
			
			
		}
		int opt=1;
		while(opt!=2) {
			System.out.println("Choose the operation you want to perform : \n1. Dividing the numbers \n2. Exit \n");
			opt=sc.nextInt();
			switch(opt) {
			case 1:
				System.out.println("Enter Numerator Index : ");
				String s1=sc.next();
				System.out.println("Enter Denominator Index " );
				String s2=sc.next();
				try {
					int a=Integer.parseInt(s1);
					int b=Integer.parseInt(s2);
					try {
						int c=arr[a];
						int d=arr[b];
						try {
							System.out.println(c/d);
						}
						catch(Exception ae) {
							System.out.println("cannt divide by zero");
						}
					}
					catch(Exception aiobe) {
						System.out.println("array out of bound");
					}
				}
				catch(Exception nfe) {
					System.out.println("number format");
				}
				break;
			case 2:
				System.out.println("THANK YOU FOR USING THIS PROGRAM !!!!");
				break;
			}
		}
	}
}
