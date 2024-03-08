
public abstract class Carnival {
protected Customer [] Clist;
protected int num;

public Carnival() {
	Clist=new Customer[300];
}


  public abstract boolean AddCustomer(Customer c,int num);
}