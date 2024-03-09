
public class Customer {
private int ID;

private char Level;


  public Customer ( int id , char Level ){
    ID = id ;
    this.Level = Level ;
   
  }////

  

 /* public void addCustomer(Customer C){
if( numOfCustomer < cList.length ){
  cList [ numOfCustomer++] =C;
  System.out.println("You have been added successfully");
}
    else 
    System.out.println("Sorry We Are Full"); 
  }//////
*/
 
  
  
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

public int getID() {
	return ID;}

public char getLevel(){
	return Level;
}
public String toString() {
	return "ID: "+ID+"\n Level:"+Level;
}
}////class
