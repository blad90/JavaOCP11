public enum Season {
	
	WINTER {
		public String getHours() { return "10am-3pm"; }
	}, 
	SPRING{
		public String getHours() { return "9am-5pm"; }
	}, 
	SUMMER, FALL;
	public String getHours() { return "9am-7pm"; }
}

class TestSeason {
	static public void main(String[] args){
		System.out.println(Season.FALL.getHours());
	}
	
}