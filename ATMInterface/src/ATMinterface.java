import java.util.Scanner;

public class ATMinterface
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to XYZ bank");
		System.out.println();
		int ch=0;

		int bal=5000,withdraw,deposit;

		do
		{
			System.out.println("Which action do you want to perform ?");
			System.out.println("\n1.Withdrwal\n2.Deposit\n3.Display Balance\n4.Exit");
			System.out.println("Which operation do you want to perform?");
			int choice=sc.nextInt();

			switch(choice)
			{
			case 1:
				System.out.println("Enter amount you want to withdraw: ");
				withdraw=sc.nextInt();

				if(withdraw>bal) 
				{
					System.out.println("Oops....You have insufficient balanace");
				}

				else
				{
					bal=bal-withdraw;
					System.out.println("Withdrawl of money is successful");
				}
				break;

			case 2:
				System.out.println("Enter amount you want to deposit: ");
				deposit=sc.nextInt();
				bal=bal+deposit;
				break;

			case 3:
				System.out.println("------------------------------------");
				System.out.println("The account balance is: "+bal);
				System.out.println("------------------------------------");
				break;

			case 4:
				System.exit(0);
				break;
			}

			System.out.println("Thank you for using the ATM....");
			System.out.println();
			System.out.println("Do you want to do operations again then press 1");
			ch=sc.nextInt();


		}while(ch==1);
	}

}
