
public class themePark {
public String[]CityList;

Customer[]customerlist;
public int numOfCustomer;

public themePark() {
	CityList=new String[]{"Italy","Japan","France","India","Riyadh"};
	customerlist=new Customer[300];
	numOfCustomer=0;
}


public int SearchNC(String name) {
	
	for(int i=0;i<CityList.length;i++) 
		
if(CityList[i].equalsIgnoreCase(name))
	
return i;
	
	return -1;	
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
            else 
            System.out.println("We are sorry but you didn't win");
            
}//numS=number of score

 public void addCustomer(Customer C){
if( numOfCustomer < customerlist.length ){
	customerlist [ numOfCustomer++] =new Customer(C.getID(),C.getLevel());
 System.out.println("You have been added successfully");
}
  else 
   System.out.println("Sorry We Are Full"); 
 }//////



public String toString(){
String str="";
for(int i=0;i<numOfCustomer;i++)
str="\n"+customerlist[i].toString();
return str; 
}//end of to string

}
