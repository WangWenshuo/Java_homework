package fifth;

public class SaleWindow extends Thread{
	Tickets tickets;
	
	public SaleWindow(Tickets tickets,String name) {
		// TODO Auto-generated constructor stub
		super(name);
		this.tickets=tickets;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
			tickets.sale();			
	}
}
