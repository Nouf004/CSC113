public class Restaurant {
private String nameOfRestaurant ;
private String [] Rlist ;



public Restaurant( String name  , int num){
nameOfRestaurant =name;
numberSection = num ;
Rlist = new String []{ "shiro sushi  " , "burgerizzer" , "Shawarmer" , "ALbaik" , "Maestro Pizza"} ; 
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

  

  
  
}///class
