
public class themePark {
private String nameOfCity;
public String[]cList;
private int Score;

public themePark(String nameOfCity,int Score ) {
	this.nameOfCity=nameOfCity;
	this.Score=Score;
	cList=new String[]{"Italy","Japan","France","India","Riyadh"};

}


public String SearchNC(String name) {
	
	for(int i=0;i<cList.length;i++) 
		
if(cList[i].equals(name))
	
return "In gate number "+(i+1);
	
	return "We Are Sorry There Is No City Called Like That";	
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
}//numS=number of score



}
