package marketNetwork;

import java.util.Scanner;

import dataPackage.Data;
import dataPackage.DataDeserialisation;
import dataPackage.DataSerialisation;
public class UserInterface {

	static int ui=1;
	static void UserInterfaceM()
	{
		int x=0;
		
			System.out.println("                          Welcome to the **True'Market pvt Ltd**");
			System.out.println();
			System.out.println();
			System.out.println("  1)Member Purchase ");
			System.out.println("  2)Member Regestration ");
			System.out.println();
			System.out.println();
			System.out.print(" Please press 1 or 2 Which ever you want to proceed  ");
		do
		{
			int option=sc.nextInt();
			try
			{
				Data d1=DataDeserialisation.dataDS(); 
			}catch(Exception e) {}
			switch(option)
			{
				 case 1:
					 new Purchase().purchaseDisplay();
					//System.out.println("Enter your id and Password");
//					String id=sc.next();
//					String password=sc.next();
//					new MemberInterface().login(id,password);
					break;
				 case 2:
					System.out.println("Enter your Parent ID");
					int xxx=0;
					do
					{
						Integer pID=sc.nextInt();
						long tl=(long)pID;
						//System.out.println(Data.data.containsKey(tl));
						if(Data.data.containsKey(tl))
						{
							System.out.println("Enter your Name");
							String name=sc.next();
							String p1;
							String p2;
							do
							{
							System.out.println("Enter your Password");
							 p1=sc.next();
							System.out.println("Re-Enter your Password");
							 p2=sc.next();
							 if(!p1.equals(p2))
							 {
								 System.out.println("Password does not match Please re-enter2");
							 }
							}while(!p1.equals(p2));
						
							Integer tempId=(int)++(NewMember.ID);

							Data.data.put((long)tempId,new NewMember((long)tempId,pID,name,p1));
							
							System.out.println("Your Account got created. Your Id is: *"+(tempId)+"*  All the Best!");
							System.out.println();
							DataSerialisation.dataS(); 
						}
						else
						{
							System.out.println("Invalid Parent Id. Please enter valid ParentId");
							xxx=1;
						}
						
					}while(xxx==1);break;
				default:
					x=1;
					System.out.println("Please enter valid ID(1/2) ");
					break;
			}
		}while(x==1);
		System.out.println("Please enter '1' for Main menu and '0' for exit");
		ui=sc.nextInt();
	}
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		while(ui==1||ui==2)
		{
			if(ui==1)
			{
				UserInterfaceM();
			}
			else
			{
				new Purchase().purchaseDisplay();
			}
		}
		System.out.println("You are logged Out");
	}
}
