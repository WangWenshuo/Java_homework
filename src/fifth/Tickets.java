package fifth;

public class Tickets{
	private int tickets;
	
	public Tickets(int tickets) {
		// TODO Auto-generated constructor stub
		this.tickets=tickets;
	}
	
	public synchronized int sale() {
			while(tickets>0){
				try {
					Thread.sleep(10);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				System.out.println("--------------------------------------------------");
				tickets--;
				System.err.println("This window is the "+Thread.currentThread().getName()+" window"+" and the ticket's number is "+(tickets+1));
/*				System.err.println("Sale successfully!");
				System.err.println("The left of the tickets is"+tickets);*/
				System.out.println("--------------------------------------------------");
			}
			return tickets;
		
	}
	

}
