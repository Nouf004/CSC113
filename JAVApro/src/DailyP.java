//subclass that count the salary
public class DailyP extends Employee {
private int day;
public DailyP(String id,int A,int d) {
	super(id,A);
	day=d;
}
public double getPaid() {
	if(day>30)
		return day*100;
	return day*60;
}//method 

public String toString() {
	return super.toString()+"\n day equals="+day+", The salary is equals= "+getPaid();
}//method toString
}//class

