public class Restaurant {
private String nameOfRestaurant ;
private int numOfR;//number of restaurant
////private Restaurant [] Rlist ; 
private String [] Rlist ;


public Restaurant( String name ){
nameOfRestaurant =name;
numOfR = 0 ;
///Rlist = new Restaurant[10] ;
Rlist = new String []{ "shiro sushi  " , "burgerizzer" , "Shawarmer" , "ALbaik" , "Maestro Pizza"} ; 
}///


public int  SearchRestaurant (String name ){

  for ( int i =0 ; i < Rlist.length ; i++ )
  if ( Rlist[i].equalsIgnoreCase(name) ) 
  return (i+1) ;
  return -1 ;
   


  
}////
  





  
}///class
