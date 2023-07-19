public enum OnlyOne {
	ONCE(true);
	private OnlyOne(boolean b){
		System.out.print("constructing,");
	}
}

class PrintTheOne {
	public static void main(String[] args){
		System.out.print("begin,");
		OnlyOne firstCall = OnlyOne.ONCE;
		OnlyOne secondCall = OnlyOne.ONCE;
		System.out.print("end");
	}
}