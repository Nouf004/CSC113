
public class Hotel extends Carnival { 

   public int CounterOfRoooms;

   public Hotel(){
      Clist=new Customer[300];
      CounterOfRoooms=0;
   }

   public boolean isFull(){
      if(CounterOfRoooms==Clist.length)
         return true;
      return false;
   }

   public boolean AddRoom(Customer c) {
      if(searchRoom()){
         Clist[CounterOfRoooms++]= c;
         return true;
      }
      return false;
   } 

   public boolean searchRoom(){
      if(CounterOfRoooms<Clist.length)
         return true;
      return false;
   }
 
   public double calculatePrice(int check_outDay,int check_inDay){
      double total;
      total=(check_outDay-check_inDay)*300;
      return total;
   }


   public boolean removeRoom(int check_outDay,int check_inDay){
      int duration= check_outDay-check_inDay;
      if(duration>3){
         Clist[CounterOfRoooms--]=null;
         return true;}
      return false;}
      
   
  
  
}//class
