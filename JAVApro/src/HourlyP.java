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
      return super.toString() + "\n hour equals=" + hour + "\nThe salary equals=" + getPaid();
   }
public void setHour(double hour){
this.hour=hour;
}
   public double getHour(){
      return hour;}
}//class
