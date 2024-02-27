
public class Customer {
private int ID;
private int numOfCustomer;
private char Level;
private int [] cList;

  public Customer ( int id , char Level ){
    ID = id ;
    Level = lev ;
    numOfCustomer = 0 ;
    cList = new int[300] ;
  }////


  public void addCustomer(Customer C){
if( numOfCustomer < cList.length ){
  cList [ numOfCustomer++ ] = C;
  System.out.println("You have been added successfully");
}
    else 
    System.out.println("Sorry We Are Full"); 



  }//////

}////class
