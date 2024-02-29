public class Restaurant {
private String nameOfRestaurant ;
private int numOfR;//number of restaurant
private String [] Rlist ;
private Customer [] tList ; 


public Restaurant( String name ){
nameOfRestaurant =name;
numOfR = 0 ;
tlist = new Customer[10] ;
Rlist = new String []{ "shiro sushi  " , "burgerizzer" , "Shawarmer" , "ALbaik" , "Maestro Pizza"} ; 
}///


public int  SearchRestaurant (String name ){

  for ( int i =0 ; i < Rlist.length ; i++ )
  if ( Rlist[i].equalsIgnoreCase(name) ) 
  return (i+1) ;
  return -1 ;
}////

  

  
  
}///class
