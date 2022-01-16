package pp1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		        double num1, num2;
		  
		        // Take input from the user
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the numbers");
		  
		     
		        num1 = sc.nextDouble();
		        num2 = sc.nextDouble();
		  
		        System.out.println("Enter the operator (+,-,*,/)");
		  
		        char ch = sc.next().charAt(0);
		  
		        double res = 0;
		  
		        switch (ch){
		  
		            case '+':
		  
		              res= num1 + num2;
	                   break;
		  
		        
		              case '-':
		  
		              res= num1 - num2;
		              break;
		  
		        
		              case '*':
		  
		              res= num1 * num2;
		              break;
		  
		        
		               case '/':
		  
		            res = num1 / num2;
		            break;
		  
		           default:
		  
		            System.out.println("You enter wrong input number");
		            break;
		        }
		  
		        System.out.println("The final result is :"+res);
		       
		    }
	

	}


