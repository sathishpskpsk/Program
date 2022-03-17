package Assignment;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		int n,temp,r,a = 0,d;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the digits:");
		d=s.nextInt();
			if(d!=0) {
			
			System.out.println("Enter the Number:");
			n=s.nextInt();
			temp=n;
			while(temp!=0) {
				r=temp%10;
				a+=Math.pow(r, d);
				temp=temp/10;
			}
			if(a==n) {
				System.out.println(n+" is Armstrong");
			}else {
				System.out.println(n+" is not Armstrong");
			}
			
			}else {
				System.out.println("Enter valid digits.");
			}
	}
}
