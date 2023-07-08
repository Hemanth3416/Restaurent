package Implimentations;
import java.util.Scanner;
public class Restaurant {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int dosa=0,idly=0,puri=0;
		int countDosa=0,countIdly=0,countPuri=0;
		int choice=1,option=0;
		do
		{
			System.out.println("          \n------- Hotel Menu-------   \n A. Dosa\n B. Idly\n C. Puri \n D. Exit  \n You want to order (1/0)");
			choice=sc.nextInt();
			do 
			{
				System.out.println(" Enter an Item");
				char item=sc.next().charAt(0);
				switch(item)
				{
				case 'A' : dosa=dosa+20;
				           countDosa++;
				           System.out.println(" Dosa x "+countDosa + " = " + dosa);
				           break;
				case 'B' : idly=idly+15;
				           countIdly++;
				           System.out.println(" Idly x "+countIdly + " = " + idly);
				           break;
				case 'C' : puri=puri+30;
				           countPuri++;
				           System.out.println(" Puri x "+countPuri + " = " + puri);
				           break;
				case 'D' : System.exit(0);
				           break;
				default : System.out.println("Invalid Item");
				}
				System.out.println(" You want to order (1/0)");
				option=sc.nextInt();
			}
			while(option!=0);
			System.out.println("  Dosa x "+countDosa + " = " + dosa +"\n" + "  Idly x "+countIdly + " = " + idly + "\n" + "  Puri x "+countPuri + " = " + puri +"\n"+ "  Total Amount = "+ (dosa+idly+puri)+ " Rs");
		}
		while(choice!=0);
		
	}
}
