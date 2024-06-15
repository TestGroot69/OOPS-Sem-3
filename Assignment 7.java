import java.util.*;
public class Assn7 {

	static Boolean IsEven(int n) {
		if(n%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	static Boolean IsOdd(int n) {
		if(n%2==1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	static Boolean IsPrime(int n) {
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	static Boolean IsPalindrome(int n) {
		int temp=n;
		int rev=0;
		while(temp!=0) {
			rev=(rev*10)+(temp%10);
			temp=temp/10;
		}
		if(n==rev) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> coll=new ArrayList<>();
		ArrayList<Integer> even=new ArrayList<>();
		ArrayList<Integer> odd=new ArrayList<>();
		ArrayList<Integer> prime=new ArrayList<>();
		ArrayList<Integer> palindrome=new ArrayList<>();
		int opt=0,ind=-1,n;
		while(opt!=6) {
			System.out.println("Choose the Operation : \n1. Add elements to Collection \n2. Track of Even Numbers \n3. Track of Odd Numbers \n4. Track of Prime Numbers \n5. Track of Palindrome Numbers \n6. Exit");
			opt=sc.nextInt();
			switch(opt) {
			case 1:
				while(true) {
					System.out.println("Enter the Integer you want to add to the collection : ");
					n=sc.nextInt();
					coll.add(n);
					ind++;
					
					if(IsEven(n)==true) {
						even.add(ind);
					}
					if(IsOdd(n)==true) {
						odd.add(ind);
					}
					if(IsPrime(n)==true) {
						prime.add(ind);
					}
					if(IsPalindrome(n)==true) {
						palindrome.add(ind);
					}
					System.out.println("Want to Add more number : \n1. Yes \n0. No \n");
					n=sc.nextInt();
					if(n==0) {
						break;
					}
				}
				break;
			case 2:
				for(Integer it : even) {
					System.out.println("Index : "+it+" Element : "+coll.get(it));
				}
				break;
			case 3:
				for(Integer it : odd) {
					System.out.println("Index : "+it+" Element : "+coll.get(it));
				}
				break;
			case 4:
				for(Integer it : prime) {
					System.out.println("Index : "+it+" Element : "+coll.get(it));
				}
				break;
			case 5:
				for(Integer it : palindrome) {
					System.out.println("Index : "+it+" Element : "+coll.get(it));
				}
				break;
			case 6:
				System.out.println("THANKS FOR USING THIS PROGRAM!!!!");
				break;
			default:
				break;
			}
		}
	sc.close();	
	}
}
