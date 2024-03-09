import java.util.*;

public class TestC {
public static void main(String []args) {
Scanner in=new Scanner(System.in);
System.out.println("Welcome to CS world)");
int num;
themePark City=new themePark();
Restaurant R1=new Restaurant();
Hotel CsHotel=new Hotel();
do {
	System.out.println("Choose the following options:");
	System.out.println("==============================");
	System.out.println("1-Do you want to enter as an employee?");
	System.out.println("2-Do you want to enter as an Customer");
	 num=in.nextInt();
	 
	switch(num) {
	case 1:
	System.out.println("Enter your ID:");
	String IDemployee=in.next();
	System.out.println("Enter your Age:");
		double ageEmployee=in.nextDouble();
		
		System.out.println("Do you want to participate as Daily Employee  enter 1 or Hourly Employee enter 2");
		int choose=in.nextInt();
		
		switch(choose) {
		
		case 1:
			System.out.println("Enter the number of days you want to work:");
			int days=in.nextInt();
			Employee emD=new DailyP(IDemployee,ageEmployee,days);
			R1.addEmployee(emD);
			System.out.println("the salary going to be=\n"+emD.getPaid());
			System.out.println(emD.toString());
			break;
			
		case 2:
			System.out.println("Enter number of hours you want to work:");
			double hours=in.nextDouble();
			Employee emH=new HourlyP(IDemployee,ageEmployee,hours);
			R1.addEmployee(emH);
			System.out.println("the salary going to be=\n"+emH.getPaid());
			System.out.println(emH.toString());
			break;
			
		}//Switch case for hour and day employee work
		
		break;
		
		
	case 2:
		System.out.println("Enter your ID pleas:");
		int id=in.nextInt();
			System.out.println("Enter your level weather it's Gold as G or Silver as S or Bronze as B");
			char level=in.next().charAt(0);
			Customer cus1=new Customer(id,level);
		
			City.addCustomer(cus1);
			String answer;
			int number;
			do {
				System.out.println("1-Check Prize?");
				
				System.out.println("2-Search for City?");
				
				System.out.println("3-Search for Restaurant?");
				
				System.out.println("4-Do you have any complaints about any Restaurant?");
				
				System.out.println("5-Do you want to have a book a room ?");
				
				System.out.println("6-Do you want to Display your info?");
				
				System.out.println("enter x if you don't have anything to do.");
				 number=in.nextInt();
			
				switch(number) {
	
				case 1:
					System.out.println("Please enter your score:");
					int numOfScore=in.nextInt();
					
					City.prize(numOfScore);///check if there is any error
					break;
					
				case 2:
			System.out.println("Enter the name of city you want to check:");
			String nameOfCity=in.next();
			City.SearchNC(nameOfCity);
			break;
			
				case 3:
					System.out.println("Enter the name of the Restaurant:");
					String nameOfRestaurant=in.next();
					R1.SearchRestaurant(nameOfRestaurant);
					break;
					
				case 4:
					System.out.println("Enter the name of the Restaurant that you recommend to remove:");
					System.out.println("shiro sushi ,burgerizzer,Shawarmer ,ALbaik ,Maestro Pizza");
					String Rname=in.next();
					//Rname =remove name of the Restaurant.
					R1.removeRestaurant(Rname);
					break;
					
				case 5:
				if(CsHotel.isFull())
					System.out.println("Sorry you can't book in this CS Hotel");
				else {
					
				System.out.println("Please enter the date of check in and the check out:");	
				int date_Chekin=in.nextInt();
				int date_Checkout=in.nextInt();
			
				
				System.out.println("Enter number of the room that you want to check in:");
				int numOfRoom=in.nextInt();
				
				if(CsHotel.AddRoom(cus1, numOfRoom)==true) {
					System.out.println("Congrats you have booked a room");
					System.out.println("the total coast=\n"+CsHotel.calculatePrice(date_Checkout, date_Chekin));
				}
				else 
					System.out.println("We are sorry there is no room available");
				
				}//else
				System.out.println("your info");
				System.out.println("==================");
			
				System.out.println(cus1.toString());
				break;
			}//switch cus number
				
			}while(number=='x');
			break;
	}//first switch 
	
}while(num!=-1);//do while the first
	
}//main
}//class


/*if(answer.equalsIgnoreCase("yes")) {

System.out.println("Enter your score :");
int numScore=in.nextInt();
////
City.prize(numScore);}
else
	System.out.println("see you next time");
////*/