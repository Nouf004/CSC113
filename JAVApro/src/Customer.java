
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

  public String  discount( Char L ){
   
    switch ( L ){
      case 'G' : case 'g' :
     return " You have discount 50% " ; 
        break;
      case 'S' : case 's' :
     return " You have discount 30% " ; 
        break;
      case 'B' : case 'b' :
      return " You have discount 15% " ; 
        break ;
    }//switch

  }/////
}////class
