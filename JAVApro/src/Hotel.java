
public class Hotel extends Carnival { 
 private int days;
 private String email;
 private String phoneNumber;
 private double coast;
 private numOfCustomer;


 public Hotel(int Days, String Email, String PN, double Coast ){
 days=Days;
 email= Email;
 phoneNumber= PN;
 coast=Coast;
  numOfCustomer=0;
 }

 public boolean isFull(){
 if(numOfCustomer==CList.length)
  return true;
  return false;
 }
 
 public boolean addCustomer(Customer C) {
 if(isFull()==false){
 CList[numOfCustomer++]= C;
  return true;
 }
  return false;
 } 

 
 

 

 

 
 
 
  

}
