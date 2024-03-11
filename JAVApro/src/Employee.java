//superClass

public class Employee {
protected String ID;
protected int age;
////method 

public Employee(String id,int A) {
ID=id;
age=A;
}//constructer

public double getPaid() {
return 0.0;
}
public int getAge() {
	return age;}
		
public String toString() {	
	return "\n ID="+ID+"\nAge="+age;
}


}//class




