
public class Hotel extends Carnival { 

public int numOfRooms;

 public Hotel(){
 Clist=new Customer[300];
 numOfRooms=0;
 }

 public boolean isFull(){
 if(numOfRooms==Clist.length)
  return true;
  return false;
 }
 
 public boolean AddRoom(Customer c,int num) {
 if(searchRoom(num)!=-1){
 Clist[num-1]= c;
  numOfRooms++;
  return true;
 }
  return false;
 } 

 public int searchRoom(int num){
  if( Clist[num-1]==null)
   return num;
   return -1;
 }
 
public double calculatePrice(int check_outDay,int check_inDay){
  double total;
  total=(check_outDay-check_inDay)*300;
  return total;
}


 public void removeRoom(int Rnum,int check_outDay,int check_inDay){
  int count=0;
  int duration= check_outDay-check_inDay;
  for(int i=0; i<duration; i++)
   count++;
  if(count>duration) 
  Clist[Rnum-1]=null;
  numOfRooms--;
 }
  
}//class
