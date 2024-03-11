//subclass
public class HourlyP extends Employee  {
	private double hour;
	public HourlyP(String id,int A,double h) {
		super(id,A);
		hour=h;
	}//counstcuter
	
	
public double getPaid(){
	if(hour>7)
	return 50*hour;
	return 30*hour;
}

public String toString() {
	return super.toString()+"\nhour equals="+hour+",The salary equals="+getPaid();
}//method toString

}//class
