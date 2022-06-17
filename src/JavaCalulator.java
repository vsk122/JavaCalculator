import java.util.Scanner;


public class JavaCalulator {

	public static void main(String[] args) {
		
		double num1;
		double num2;
		double ans;
		
		char op;
		
		Scanner read = new Scanner(System.in);
		
		System.out.print("Enter any two numbers of your choice =  ");
		
		num1 = read.nextDouble();
		num2 = read.nextDouble();
		
		System.out.print("Enter any operator, for exapmle +, -, /, *");
		
		op = read.next().charAt(0);
		
		switch(op)
		{
		 
		case '+': ans = num1 + num2;
		break;
		
		case '*': ans = num1 * num2;
		break;
		
		case '/': ans = num1 / num2;
		break;
		
		case '-': ans = num1 - num2;
		break;
		
		default: System.out.print("Please enter any correct opperator as follows: +, -, /, * ");
		
		return;
		
		
		}
		
		System.out.print("\n The result is as follows: \n");
		System.out.print(num1 + "" + op + "" + num2 + "=" + ans);
		

	}

}
