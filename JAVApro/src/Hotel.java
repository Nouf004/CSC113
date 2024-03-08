
public class Hotel extends Carnival { 
 private int days;
 private double coast;
 private numOfCustomer;
 private int num;
 private int check_inDay;
 private int check_outDay;


 public Hotel(int Days, String Email, String PN, double Coast, int checkIn, int checkOut ){
 days=Days;
 email= Email;
 phoneNumber= PN;
 coast=Coast;
 numOfCustomer=0;
 check_inDay=checkIn;
 check_outDay=checkOut;
 }

 public boolean isFull(){
 if(numOfCustomer==CList.length)
  return true;
  return false;
 }
 
 public boolean addCustomer(Customer c , int num ) {
 if(searchRoom(num)!=-1){
 CList[num-1]= C;
  numOfCustomer++;
  return true;
 }
  return false;
 } 

 public int searchRoom(int num){
  if( Clist[num-1]==null)
   return num;
   retrun -1;
 }

 public void removeCustomer(int Rnum){
  int count=0;
  int duration= check_outDay-check_inDay;
  for(int i=0; i<duration; i++)
   count++;
  if(count>duration) 
  Clist[Rnum-1]=null;
  numOfCustomer--;
 }
   
   

  
  
   

 
 

 

 

 
 
 
  

}
