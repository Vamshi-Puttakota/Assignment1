package Users;
import java.util.*;
public class Purchase 
{
	static Scanner sc = new Scanner(System.in);
	public void purchaseDisplay() 
	{
			
			String p="Washing Power",q="Suppliments",r="Protien capsules";
			System.out.println();
			System.out.println("The available items are listed below: ");
			System.out.println();
			System.out.println("A. Washing Power     Cost: Rs.3,000/- ");
			System.out.println("B. Suppliments		 Cost: Rs.5,000/-");
			System.out.println("C. Protien capsules	 Cost: Rs.2,500/-");
			
			System.out.println();
			int qty, total;
			
				
			System.out.println("Press ProductID(A/B/C) to Buy Items and x to Exit to Main Menu");
				int xx=0;
				do
				{
					
					char c = sc.next().charAt(0);
					switch(c)
					{
						case 'A':
						System.out.println("Enter the Quantity");
						qty = sc.nextInt();
						total = qty*3000;
						System.out.println("Total amount: "+total);
						System.out.println("you have purchased "+qty+" "+p+"'s with amount :"+total);
						break;
						case 'B':
							System.out.println("Enter the Quantity");
							qty = sc.nextInt();
							total = qty*3000;
							System.out.println("Total amount: "+total);
							System.out.println("you have purchased "+qty+" "+p+"'s with amount :"+total);
							break;
						case 'C':
							System.out.println("Enter the Quantity");
							qty = sc.nextInt();
							total = qty*3000;
							System.out.println("Total amount: "+total);
							System.out.println("you have purchased "+qty+" "+p+"'s with amount :"+total);
							break;
						default:
							xx=1;
							System.out.println("Please enter valid ID(A/B/C) ");
							break;
							
					}
				}while(xx==1);
				System.out.println("Enter '1' for Main menu or '2' for purchase menu and '0' for 'SignOut' for Purchase Menu");
				
	}
}