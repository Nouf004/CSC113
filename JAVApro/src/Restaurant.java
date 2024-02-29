
public class Restaurant {
private String nameOfRestaurant ;
private int numOfR;//number of restaurant
private Restaurant [] Rlist ; //////////////?
private String [] Rlist ;


public Restaurant( String name ){
nameOfRestaurant =name;
numOfR = 0 ;
Rlist = new Restaurant[10] ; /////////?
Rlist = new String [] = { "shiro sushi  " , "burgerizze" , "Shawarmer" , "ALbaik" , "Maestro Pizza"} ; 
}///


public void SearchRestaurant (String name ){

  for ( int i =0 ; i < Rlist.length ; i++ )
  if ( Rlist[i].equalsIgnoreCase(name) ) 
    System.out.println("yes we Found it in section " +  (i+1) ); 
  else 
    System.out.println("yes we can*t Found it  " ); 


  
}////
  





  
}///class
