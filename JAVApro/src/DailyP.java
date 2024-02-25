//subclass that count the salary
public class DailyP extends Employee {
private int day;
public DailyP(String id,double A,int d) {
	super(id,A);
	day=d;
}
public double getPaid() {
	if(day>30)
		return day*100;
	return day*60;
}//method 

public String toString() {
	return super.toString()+"day equals"+day+"The Salary is equals "+getPaid();
}//method toString
}//class
