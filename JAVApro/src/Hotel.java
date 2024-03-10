
public class Hotel extends Carnival { 

private int numOfCustomer;

 public Hotel(){
 Clist=new Customer[300];
 numOfCustomer=0;
 }

 public boolean isFull(){
 if(numOfCustomer==Clist.length)
  return true;
  return false;
 }
 
 public boolean AddRoom(Customer c,int num) {
 if(searchRoom(num)!=-1){
 Clist[num-1]= c;
  numOfCustomer++;
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
  numOfCustomer--;
 }
 
public Customer [] customerList(Customer[]c){
Customer[] list=new Customer[numOfCustomer];
int j=0;
for(int i=0;i<numOfCustomer;i++)
list[j++]=new Customer(list[i].getID(),list[i].getLevel());
return list;
}  
 
}//class
