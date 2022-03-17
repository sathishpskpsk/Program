package psk;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		do {
			System.out.println("===== PSK Calculator=====");
			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Divition");
			System.out.println("5. Exit");
			System.out.println("Enter a Number: ");
	        int n = scanner.nextInt();
	        if(n==1 ||n==2||n==3||n==4 ) {
	        	System.out.println("Enter First number");
	        	int a= scanner.nextInt();
	        	System.out.println("Enter Scond number");
	        	int b= scanner.nextInt();
	        	
	        	switch(n) {
		        case 1:{
		        	int res=Cal.add(a,b);
		        	System.out.println("Result is: "+res);
		        	break;
		        }		        
		        case 2:{
		        	
		        	int res=Cal.sub(a,b);
		        	System.out.println("Result is: "+res);
		        	break;
		        }		        
		        case 3:{
		        	
		        	int res=Cal.mul(a,b);
		        	System.out.println("Result is: "+res);
		        	break;
		        }		        
		        case 4:{
		        	
		        	int res=Cal.divi(a,b);
		        	System.out.println("Result is: "+res);
		        	break;
		        }      
		        }
	        }
	        else if(n==5) {
	        	break;
	        }
	        else {
	        	System.out.println("Not valid option: ");
	        }
	        
		}while(true);	
		scanner.close();
		
	}

}
