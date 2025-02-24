package sal;
import java.util.Scanner;


public class DynamicScanner {

	public static void main(String[] args) {

		        Scanner scan=new Scanner(System.in);
		                System.out.print("Enter the Serial no: ");

		        int sln=scan.nextInt();
		        System.out.println("Serial no: "+sln);
		        System.out.println("Enter the Name:");

		        String name=scan.nextLine();
		         name=scan.nextLine();

		        System.out.println("The Name:"+name);
		        System.out.println("Enter The inital :");
                char initial=scan.next().charAt(0);
		        System.out.println("The initial:"+initial);
		        System.out.println("EnterThe Float:");
		        float digit=scan.nextFloat();
		        System.out.println("The floatNo:"+digit);
		        System.out.println("EnterThe Double:");

		        double digits=scan.nextDouble();
		        System.out.println("the Double"+digits);
		    
			}
		}
	
