
public class Customer {
private int ID;
private int numOfCustomer;
private char Level;
private Customer [] cList;

  public Customer ( int id , char Level ){
    ID = id ;
    this.Level = Level ;
    numOfCustomer = 0 ;
    cList = new Customer[300] ;
  }////


  public void addCustomer(Customer C){
if( numOfCustomer < cList.length ){
  cList [ numOfCustomer++] =C;
  System.out.println("You have been added successfully");
}
    else 
    System.out.println("Sorry We Are Full"); 
  }//////

  public void  discount( char L ){
   
    switch ( L ){
      case 'G' : case 'g' :
     System.out.println( " You have discount 50% ") ; 
	case 'S' : case 's' :
		System.out.println( " You have discount 30% ") ; 
	case 'B' : case 'b' :
		System.out.println( " You have discount 15% ") ;
		default:
		System.out.println("Sorry you don't have discount");
    }//switch

  }/////
}////class
