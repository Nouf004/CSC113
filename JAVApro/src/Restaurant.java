public class Restaurant {
//private String nameOfRestaurant ;
private String [] Rlist ;
 Employee [] empList;
private int numOfEmployee;
 


public Restaurant(){
Rlist = new String []{ "shiro sushi  " , "burgerizzer" , "Shawarmer" , "ALbaik" , "Maestro Pizza"} ; 
empList=new Employee[50];
numOfEmployee=0;
}///


public int SearchRestaurant (String name ){

  for ( int i =0 ; i < Rlist.length ; i++ )
  if ( Rlist[i].equalsIgnoreCase(name) ) 
  return i ;
  return -1 ;
}////

 public boolean removeRestaurant( String name ) {

int loc = SearchRestaurant (name ) ;

   if ( loc != -1 )
   {
     Rlist[loc] = Rlist[ Rlist.length -1 ];
     Rlist[ Rlist.length -1 ] = null ;
     return true ; 
   }
   return false; 

 }////
 
 
 
 public void addEmployee(Employee e) {
	if(numOfEmployee<empList.length) {
if(e.getAge()>=18) {
	empList[numOfEmployee++]=e;
	System.out.println("You Have Been employed Succesfully ");}
else 
	System.out.println("Sorry Your Underage");
	}
	else 
		System.out.println("Sorry We Are Full Staffed");
	
}//addEmployee

  

  
  
}///class
