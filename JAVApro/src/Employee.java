//superClass
public class Employee {
protected String ID;
protected double age;

///////////////////////////method 

public Employee(String id,double A) {
ID=id;
age=A;

}//constructer

public double getPaid() {
return 0.0;
}
public double getAge() {
	return age;}



/*public void addEmployee(Employee e) {
	if(numOfE<Elist.length) {
if(e.getAge()>=18) {
	numOfE++;
	System.out.println("You Have Been employed Succesfully ");}
else 
	System.out.println("Sorry Your Underage");
	}
	else 
		System.out.println("Sorry We Are Full Staffed");
	
}//addEmployee*/
		
public String toString() {	
	return "ID"+ID+"Age"+age+ "the slary"+getPaid();
}


}//class


