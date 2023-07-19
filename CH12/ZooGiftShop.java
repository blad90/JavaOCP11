public class ZooGiftShop {
	interface SalesTodayOnly {
		int dollarsOff();
	}
	
	public int admission(int basePrice){
		SalesTodayOnly sale = new SalesTodayOnly(){
			public int dollarsOff() { return 3; }
		};
		return basePrice - sale.dollarsOff();
	}
	
	public static void main(String[] args){
		System.out.println(new ZooGiftShop().admission(100));
	}
}