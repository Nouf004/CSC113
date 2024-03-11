
public class Customer {
private int ID;

private char Level;


  public Customer ( int id , char Level ){
    ID = id ;
    this.Level = Level ;
   
  }////
  
  


public int getID() {
	return ID;}

public char getLevel(){
	return Level;
}
public String toString() {
String str="****Info of Customer**** \n";
   str+="ID: "+ID+", Level:"+Level+"\n";
   return str;
}

}////class
