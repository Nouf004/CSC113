
public class Hotel extends Carnival { 
 private int days;
 private String email;
 private String phoneNumber;
 private double coast;


 public Hotel(int Days, String Email, String PN, double Coast ){
 days=Days;
 email= Email;
 phoneNumber= PN;
 coast=Coast;
 }

 public boolean isFull(){
 if(nOfR==RList.length)
  return true;
  return false;
 }
 
 public boolean addGuest(Customer C) {
 if(isFull()==false){
 RList[nOfR++]= C;
  return true;
 }
  return false;
 } 
 

 

 

 
 
 
  

}
