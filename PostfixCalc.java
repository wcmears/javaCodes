import java.util.Scanner;
import java.util.Stack;

public class PostfixCalc {
	public static void main(String[] args) {

		boolean test = true;
		
		while (test == true){
			
			Scanner myObj = new Scanner(System.in); //User input
			System.out.println("type expression >");
			String expression = myObj.nextLine();
			
			if (expression.equals("quit")){ //changes test to false and ends code when quit is entered
				System.out.println("Goodbye!");
				test = false;
				break;
			}
			
			Stack<Double> stack=new Stack<>(); //Creates stack
			
			int m = 0;
			int n = 0;
			
			for(int i=0;i<expression.length();i++){ //goes through each character in the stack and identifies whether its a space, operand, or operator.
				char c=expression.charAt(i);        // This caused the biggest problem in my code. Although I know how to prevent an error message, 
													// I could not figure out how to have the program recognize either two simultaneous digits, or a decimal inbetween two digits,
				if(c == ' '){						//as a single character(double). Because of this, only whole numbers 0-9 operate. Aside from this, the rest of the code should
					continue;						//work as intended.
				}else if(Character.isDigit(c)){
					m = m + 1;
				}else{
					
					if (c == '+'){
						n = n + 1;
					}
					else if (c == '-'){
						n = n + 1;
					}
					else if (c == '*'){
						n = n + 1;
					}
					else if (c == '/'){
						n = n + 1;
					}
				}
			} // There should be one less operator than operand. If m =! n-1, code produces an error message
			
			int q = n + 1;
			
			if (q == m){
          
				for(int i=0;i<expression.length();i++){ //Iterates through each character in stack, operating on each one as user input intends
					char c=expression.charAt(i);
				
					if(c == ' '){
						continue;
					}else if(Character.isDigit(c)){
						double x = (double)c;
						stack.push(x - '0');
					}else{
						double x = stack.pop();
						double y = stack.pop();
						
					
						if (c == '+'){
							stack.push(y + x);
						}
						else if (c == '-'){
							stack.push(y - x);
						}
						else if (c == '*'){
							stack.push(y * x);
						}
						else if (c == '/'){
							stack.push(y / x);
						}
					}
				}	
				
			double a = stack.pop(); //Pops result to be shown in answer
			System.out.println("result > " + a);
			
			}else{
			System.out.println("Enter a valid equation"); //Error message if more operators than operands
			}
		}
	}
}