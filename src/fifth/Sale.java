package fifth;

public class Sale {
	public static void main(String[] args) {
		System.out.println("Hello firends!Welocme!");
		System.out.println("The program is a system about saling tickets.");
		System.out.println("The sale system has 3 windows.");
		System.out.println("sale starts.");
		
		Tickets tickets = new Tickets(100);
		SaleWindow saleWindow1 = new SaleWindow(tickets,"first");
		SaleWindow saleWindow2 = new SaleWindow(tickets, "second");
		SaleWindow saleWindow3 = new SaleWindow(tickets, "third");
		
		saleWindow1.start();
		saleWindow2.start();
		saleWindow3.start();
		System.out.println("sale ends.");
		System.out.println("Thank you.Bye!");
	}
}
