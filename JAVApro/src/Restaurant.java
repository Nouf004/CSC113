public class Restaurant {
//private String nameOfRestaurant ;
public String [] Rlist ;//Restaurant List
 Employee [] empList;
public int numOfEmployee;
 


public Restaurant(){
Rlist = new String []{ "Shiro" , "Burgerizzer" , "Shawarmer" , "ALbaik" , "Maestro"} ; 
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
 
 
 
 public boolean addEmployee(Employee e) {
	if(numOfEmployee<empList.length){
if(e.getAge()>=18) {
	empList[numOfEmployee++]=e;
	return true;}
	return false;}
	 
return false;	
}//addEmployee

  
  public String toString(){
  String st="****Info of employee****"+"\n";
  for(int i=0;i<numOfEmployee;i++)
  st+=empList[i].toString();
  return st;}
  
}///class
