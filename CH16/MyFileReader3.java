public class MyFileReader3 implements AutoCloseable {
	private String tag;
	
	public MyFileReader3(String tag){
		this.tag = tag;
	}
	
	@Override
	public void close(){
		System.out.println("Closed: " + tag);
	}
	
	public static void main(String[] args){
		final var bookReader = new MyFileReader3("4");
		MyFileReader3 movieReader = new MyFileReader3("5");
		
		try(bookReader;
			var tvReader = new MyFileReader3("6");
			movieReader){
			System.out.println("Try Block");
		} finally {
			System.out.println("Finally Block");
		}
	}
}