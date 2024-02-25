//superClass
public class Employee {
protected String ID;
protected double age;
public int day;
public double hour;
private int Elist[];
public int numOfE;
///////////////////////////method 

public Employee(String id,double A) {
ID=id;
age=A;
numOfE=0;
Elist=new int [50];

}//constructer

public double getPaid() {
return 0.0;
}


public void addEmployee() {
	if(numOfE<Elist.length) {
if(age>=18) {
	numOfE++;
	System.out.println("You Have Been employed Succesfully ");}
else 
	System.out.println("Sorry Your Underage");
	}
	else 
		System.out.println("Sorry We Are Full Staffed");
	
}//addEmployee
		
public String toString() {	
	return "ID"+ID+"Age"+age+ "the slary"+getPaid();
}

}//class


