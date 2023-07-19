public class SwimTester implements Swim{
	public static void main(String[] args){
		new SwimTester().backstroke();
	}
}

interface Swim {
	private static void breathe(String type){
		System.out.println("Inhale");
		System.out.println("Performing stroke: " + type);
		System.out.println("Exhale");
	}
	
	static void butterfly() { breathe("butterfly"); }
	public static void freestyle() { breathe("freestyle"); }
	default void backstroke() { breathe("backstroke"); }
	private void breaststroke() { breathe("breaststroke"); }
}