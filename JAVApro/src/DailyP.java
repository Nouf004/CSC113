//subclass that count the salary
public class DailyP extends Employee {
 private int NumOfD;
 public double getPaid(int num,double sal) {
	 return num*sal;
 }//method getPaid
@Override
public double getPaid(double s) {
	// TODO Auto-generated method stub
	return NumOfD*s;
}

}//class