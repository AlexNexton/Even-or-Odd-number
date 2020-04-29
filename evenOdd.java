import java.util.Scanner;
public class evenOdd {

	public static void main(String[] args) {
		
		
				int number; 
				
				
				System.out.println("Enter a number.");
				Scanner input = new Scanner(System.in);
				number = input.nextInt();
				int b = 0;
					
				while(b <= number) {
						
						if(b%2 == 0) { //change the zero to 1 to print odd numbers
							
							System.out.print(b + " ");
							}
						b ++;
						}
				}
	}
