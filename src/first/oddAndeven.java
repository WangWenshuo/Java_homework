package first;

public class oddAndeven {
	private int odd_n;
	private int even_n;
	private int odd_sum;
	private int even_sum;
	
	public oddAndeven(int odd_n, int even_n, int odd_sum, int even_sum) {
		super();
		this.odd_n = odd_n;
		this.even_n = even_n;
		this.odd_sum = odd_sum;
		this.even_sum = even_sum;
	}
	public int getOdd_n() {
		return odd_n;
	}
	public void setOdd_n(int odd_n) {
		this.odd_n = odd_n;
	}
	public int getEven_n() {
		return even_n;
	}
	public void setEven_n(int even_n) {
		this.even_n = even_n;
	}
	public int getOdd_sum() {
		return odd_sum;
	}
	public void setOdd_sum(int odd_sum) {
		this.odd_sum = odd_sum;
	}
	public int getEven_sum() {
		return even_sum;
	}
	public void setEven_sum(int even_sum) {
		this.even_sum = even_sum;
	}	
}
