import java.util.*;
public class TestC {
public static void main(String []args) {
Scanner in=new Scanner(System.in);
int num;
themePark City=new themePark();
Restaurant R1=new Restaurant();
Hotel CsHotel=new Hotel();


do {
   System.out.println("********* Welcome to CS world *********");
	System.out.println("Choose the following options:");
	System.out.println("==============================");
	System.out.println("1-Do you want to enter as an employee?");
	System.out.println("2-Do you want to enter as an Customer?");
   System.out.println("3-Enter -1 to log out from the application");
   
	 num=in.nextInt();

	switch(num) {
	case 1:
	System.out.println("Enter your ID:");
	String IDemployee=in.next();
	System.out.println("Enter your Age:");
		int ageEmployee=in.nextInt();
     

		System.out.println("Do you want to participate as Daily Employee  enter 1 or Hourly Employee enter 2");
		int choose=in.nextInt();
		
		switch(choose) {
		
		case 1:
     
			System.out.println("Enter the number of days you want to work:");
			int days=in.nextInt();
			Employee emD=new DailyP(IDemployee,ageEmployee,days);
			R1.addEmployee(emD);
         if(R1.addEmployee(emD)){
         System.out.println("You have been added successfully");
			System.out.println(emD.toString());}
         else
         System.out.println("We are sorry you have been rejected");
        
			break;
			
		case 2:
			System.out.println("Enter number of hours you want to work:");
			double hours=in.nextDouble();
			Employee emH=new HourlyP(IDemployee,ageEmployee,hours);
			R1.addEmployee(emH);
         
         if(R1.addEmployee(emH)){
         System.out.println("You have been added successfully");
			System.out.println(emH.toString());}
         else
         System.out.println("We are sorry you have been rejected");
			break;
			
		}//Switch case for hour and day employee work
		
		break;
	case 2:
   
		System.out.println("Enter your ID pleas:");
		int id=in.nextInt();
			System.out.println("Enter your level weather it's Gold as G or Silver as S or Bronze as B");
			char level=in.next().charAt(0);
         
         Customer c1=new Customer(id,level);
         City.addCustomer(c1);
        
      
         
			String answer;
      
         int number;
         System.out.println("1-Check Prize?");
				
				System.out.println("2-Search for City?");
				
				System.out.println("3-Search for Restaurant?");
				
				System.out.println("4-Do you have any complaints about any Restaurant?");
				
				System.out.println("5-Do you want to have a book a room ?");
				
				System.out.println("6-Do you want to Display your info?");
				
				System.out.println("enter 0 if you don't have anything to do.");
				 number=in.nextInt();
             
         while(number!=0){
            switch(number) {
	
				case 1:
					System.out.println("Please enter your score:");
					int numOfScore=in.nextInt();
					
					City.prize(numOfScore);///check if there is any error
					break;
					
				case 2:
           String nameOfCity;
			System.out.println("Enter the name of city you want to check:");
         in.nextLine();
			 nameOfCity=in.nextLine();
         
			int place=City.SearchNC(nameOfCity);
         
         if(place!=-1)
         
         System.out.println("The place is at section:"+(place+1));
         
         else 
         System.out.println("There is no city called like this.");
			break;
			
				case 3:
					System.out.println("Enter the name of the Restaurant:");
					String nameOfRestaurant=in.next();
               int loc=R1.SearchRestaurant(nameOfRestaurant);
               if(loc!=-1)
               System.out.println("The Restaurant is in gate :"+(loc+1));
               else System.out.println("There is no Restaurant called like this.");

					break;
					
				case 4:
					System.out.println("Enter the name of the Restaurant that you recommend to remove:");
               
					System.out.println("Shiro,Burgerizzer,Shawarmer,ALbaik ,Maestro");
             
					String Rname=in.next();
               
					//Rname =remove name of the Restaurant.
               
					if(R1.removeRestaurant(Rname))
               System.out.println("We have listend to your request.");
               else 
               
               System.out.println("You might misspelled the name, check again");
					break;
					
				case 5:
				if(CsHotel.isFull())
					System.out.println("Sorry you can't book in this CS Hotel");
				else {
					
				System.out.println("***Please enter the dates***");
            System.out.println(" Check in:");
           	
				int date_Chekin=in.nextInt();
            System.out.println("Check out:");
				int date_Checkout=in.nextInt();
			
				
				System.out.println("Enter number of the room that you want to check in:");
				int numOfRoom=in.nextInt();
				
             for(int i=0;i<CsHotel.numOfRooms;i++)
            if(CsHotel.Clist[i]==null)
				if(CsHotel.searchRoom(numOfRoom)!=-1) {
            CsHotel.AddRoom(City.customerlist[City.numOfCustomer], numOfRoom);
					System.out.println("Congrats you have booked a room");
					System.out.println("the total coast="+CsHotel.calculatePrice(date_Checkout, date_Chekin));
               
				}
				else 
					System.out.println("We are sorry there is no room available");
				
				}//else
            
				break;
            
            case 6://work on it
            System.out.println("*****Your Info*****");
				System.out.println("==================");
				System.out.println(City.customerlist[City.numOfCustomer].toString());
            break;
			}//switch cus number
				
				System.out.println("1-Check Prize?");
				
				System.out.println("2-Search for City?");
				
				System.out.println("3-Search for Restaurant?");
				
				System.out.println("4-Do you have any complaints about any Restaurant?");
				
				System.out.println("5-Do you want to have a book a room ?");
				
				System.out.println("6-Do you want to Display your info?");
				
				System.out.println("enter 0 if you don't have anything to do.");
				 number=in.nextInt();
             
			}//while(number=='x');
			
	}//first switch 
	
}while(num!=-1);//do while the first

  for(int i=0;i<City.numOfCustomer;i++){
   System.out.println(City.customerlist[i]);}
   
  System.out.println("==========================");
 
   for(int i=0;i<R1.numOfEmployee;i++){
 System.out.println(R1.empList[i]);}
// System.out.println(R1.toString());
}//main 
}//class
