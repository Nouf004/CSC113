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
            
            
               System.out.println("Enter 1 if you want to participate as Daily Employee or 2 if you want to participate as Hourly Employee");
               int choose=in.nextInt();
            
               switch(choose) {
               
                  case 1:
                  
                     System.out.println("Enter the number of days you want to work:");
                     int days=in.nextInt();
                     DailyP emD=new DailyP(IDemployee,ageEmployee,days);//emD=Employee that's works daily
                     
                     if(R1.AddEmployeeD(emD)){
                        System.out.println("You have been added successfully");
                     
                     }
                     else
                        System.out.println("We are sorry, you have been rejected");
                  
                     break;
               
                  case 2:
                     System.out.println("Enter number of hours you want to work:");
                     double hours=in.nextDouble();
                     HourlyP emH=new HourlyP(IDemployee,ageEmployee,hours);//emH=Employee thats works hourly
                                       
                     if(R1.AddEmployeeH(emH))
                        System.out.println("You have been added successfully");
                     
                     
                     else
                        System.out.println("We are sorry, you have been rejected");
                     break;
               
               }//Switch case for hour and day employee work
            
               break;
            case 2:
            
               System.out.println("Enter your ID please:");
               int id=in.nextInt();
               System.out.println("Enter your level weather it's Gold as G or Silver as S or Bronze as B");
               char level=in.next().charAt(0);
            
               Customer c1=new Customer(id,level);
               if(City.addCustomer(c1)){
            
            
            
               int number;
               System.out.println("1-Check Prize?");
            
               System.out.println("2-Search for City?");
            
               System.out.println("3-Search for Restaurant?");
            
               System.out.println("4-Do you have any complaints about any Restaurant?");
            
               System.out.println("5-Do you want to book a room ?");
            
               System.out.println("6-Do you want to Display your info?");
            
               System.out.println("7-Do you want to cancel your booking at the Hotel?");
            
               System.out.println("enter 0 if you don't have anything to do.");
               number=in.nextInt();
             
               while(number!=0){
                  switch(number) {
                  
                     case 1:
                        System.out.println("Please enter your score:");
                        int numOfScore=in.nextInt();
                     
                        City.prize(numOfScore);                       
                        
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
                           System.out.println("Sorry , There is no city called like this.");
                        break;
                  
                     case 3:
                        System.out.println("Enter the name of the Restaurant:");
                        String nameOfRestaurant=in.next();
                        int loc=R1.SearchRestaurant(nameOfRestaurant);
                        if(loc!=-1)
                           System.out.println("The Restaurant is in gate :"+(loc+1));
                        else System.out.println("Sorry , There is no Restaurant called like this.");
                     
                        break;
                  
                     case 4:
                        System.out.println("Enter the name of the Restaurant that you recommend to remove:");
                     
                        System.out.println("Shiro,Burgerizzer,Shawarmer,ALbaik ,Maestro");
                     
                        String Rname=in.next();
                     
                     //Rname =remove name of the Restaurant.
                     
                        if(R1.removeRestaurant(Rname))
                           System.out.println("We have listend to your request.");
                        else 
                        
                           System.out.println("You might have misspelled the name. please, check again");
                        break;
                  
                  
                     case 5:
                        if(CsHotel.isFull())
                           System.out.println("Sorry, you can't book in CS Hotel");
                        else {
                           System.out.println("***Please enter the dates***");
                           System.out.println(" Check in:");
                           int date_Checkin = in.nextInt();
                           System.out.println("Check out:");
                           int date_Checkout = in.nextInt();
                        
                           System.out.println("Enter the number of the room that you want to check in:");
                           int numOfRoom = in.nextInt();
                        
                           if (CsHotel.AddRoom(CsHotel.Clist[CsHotel.CounterOfRoooms])) 
                              System.out.println("Congrats, you have booked a room");
                           System.out.println("The total cost = " + CsHotel.calculatePrice(date_Checkout, date_Checkin));
                        }
                          
                        
                        break;
                        
                     case 6:
                     
                        System.out.println("*****Your Info*****");
                        System.out.println(c1.toString());
                        System.out.println("==================");
                        break;
                        
                     case 7:
                        System.out.println("***Enter your booking date***");
                        System.out.println("Check in Date:");
                        int dateCheck_in=in.nextInt();
                        
                        System.out.println("Check out Date:");
                        int dateCheck_out=in.nextInt();
                     
                        if(CsHotel.removeRoom(dateCheck_out,dateCheck_in))
                           System.out.println("Your booking has been canceled");
                        else
                           System.out.println("We are sorry, but you can't cancel your booking due to our policy");
                        
                  }//switch cus number
               
                  System.out.println("1-Check Prize?");
               
                  System.out.println("2-Search for City?");
               
                  System.out.println("3-Search for Restaurant?");
               
                  System.out.println("4-Do you have any complaints about any Restaurant?");
               
                  System.out.println("5-Do you want to have a book a room ?");
               
                  System.out.println("6-Do you want to Display your info?");
               
                  System.out.println("7-Do you want to cancel your booking at the Hotel?");
               
                  System.out.println("enter 0 if you don't have anything to do.");
                  number=in.nextInt();
               
               }//while
         }
         else 
         System.out.println("Sorry, but we are full today make sure to come again next time to have some fun!");
         
         }//first switch 
      
      }while(num!=-1);//do while the first
      
      System.out.println("Now we are going to display all info");
      System.out.println();
      
   System.out.println("****Info of Customers**** ");
      for(int i=0;i<City.numOfCustomer;i++){
         System.out.println(City.customerlist[i]);}
      System.out.println("==========================");
   
      R1.disPlayEmployeeH();
      System.out.println();
      R1.disPlayEmployeeD();
      System.out.println();
    System.out.println("The CS World Materials"); 
      R1.appInfo();
   
   }//main 
}//class
