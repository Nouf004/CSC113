public class Restaurant extends themePark {

   public String [] Rlist ;//Restaurant List

   DailyP[]dEmpList;
   public int numOfEmployeeD;//Daily

   HourlyP[]hEmpList;
   public int numOfEmployeeH;//Hourly


   public Restaurant(){
      Rlist = new String []{ "Shiro" , "Burgerizzer" , "Shawarmer" , "ALbaik" , "Maestro"} ; 
      dEmpList=new DailyP[50];
      numOfEmployeeD=0;
      hEmpList=new HourlyP[50];
      numOfEmployeeH=0;
   
   }///


   public int SearchRestaurant (String name ){
   
      for ( int i =0 ; i < Rlist.length ; i++ )
         if ( Rlist[i].equalsIgnoreCase(name) ) 
            return i ;
      return -1 ;
   }////

   public boolean removeRestaurant( String name ) {
      int loc = SearchRestaurant (name ) ;
      if ( loc != -1 )
      {
         Rlist[loc] = Rlist[ Rlist.length -1 ];
         Rlist[ Rlist.length -1 ] = null ;
         return true ; 
      }
      return false; 
   
   }////
 
 


   public boolean AddEmployeeD(DailyP emD){
      if(numOfEmployeeD<dEmpList.length && emD.getAge()>18){
         dEmpList[numOfEmployeeD++]=emD;
         return true;}
      return false;}//AddEmployeeDailyPaid

   public boolean AddEmployeeH(HourlyP emH){
      if(numOfEmployeeH<hEmpList.length && emH.getAge()>18){
         hEmpList[numOfEmployeeH++]=emH;
         return true;}
      return false;}//AddEmployeeHourlyPaid


   public void disPlayEmployeeH(){
      System.out.println("****Hourly Employee Info****");
      for(int i =0;i<numOfEmployeeH;i++)
         System.out.println(hEmpList[i]);
   }
  
   public void disPlayEmployeeD(){
      System.out.println("****Daily Employee Info****");
      for(int i =0;i<numOfEmployeeD;i++)
         System.out.println(dEmpList[i]);
   } 

   public void appInfo(){
      System.out.println("the number of Cities:"+CityList.length+"\nthe number of Restaurant:"+Rlist.length+
         "\nthe number of Hourly Employees is:"+numOfEmployeeH+"\nthe number of Daily Employees is:"+numOfEmployeeD);
   }

  
}///class
