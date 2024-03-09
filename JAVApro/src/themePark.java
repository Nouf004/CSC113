
public class themePark {
public String[]cList;
//private int Score;
Customer[]customerlist;
private int numOfCustomer;

public themePark() {
	cList=new String[]{"Italy","Japan","France","India","Riyadh"};
	customerlist=new Customer[300];
	numOfCustomer=0;
}


public String SearchNC(String name) {
	
	for(int i=0;i<cList.length;i++) 
		
if(cList[i].equals(name))
	
return "In gate number "+(i+1);
	
	return "We Are Sorry There Is No City Called Like That";	
}//NC=name of city


public void prize(int numS) {
	if(numS>1500)
		System.out.println("Congratulations you won Car");
	else
		if(numS>1000&&numS<1500)
			System.out.println("Congratulations you won London");
		else
			if(numS<1000)
				System.out.println("Congratulations you won 200K");
}//numS=number of score

 public void addCustomer(Customer C){
if( numOfCustomer < customerlist.length ){
	customerlist [ numOfCustomer++] =new Customer(C.getID(),C.getLevel());

 System.out.println("You have been added successfully");
}
  else 
   System.out.println("Sorry We Are Full"); 
 }//////


}
