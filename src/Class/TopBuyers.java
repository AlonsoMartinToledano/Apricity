package Class;

public class TopBuyers { //Singleton Class
	private static TopBuyers TOP_BUYER;
	private User topBuyer;
	private TopBuyers() {
	}
	
	public static TopBuyers getTopBuyers() {
		if (TOP_BUYER == null) {
			TOP_BUYER = new TopBuyers();
		}
		return TOP_BUYER;
	}
	
	//topBuyer Getter and Setter
	public void setTopBuyer(User topBuyer) {
		this.topBuyer = topBuyer;
	}
	
	public User getTopBuyer() {
		return topBuyer;
	}
}
