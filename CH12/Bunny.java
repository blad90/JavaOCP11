interface Hop {
	static int getJumpHeight(){
		return 8;
	}
}

public class Bunny implements Hop {
	public void printDetails(){
		System.out.println(Hop.getJumpHeight());
	}
	
	public static void main(String[] args){
		new Bunny().printDetails();
	}
}