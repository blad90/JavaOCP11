import java.util.concurrent.Future;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class AddData {
	public static void main(String[] args) throws Exception{
		ExecutorService service = null;
		try{
			service = Executors.newSingleThreadExecutor();
			Future<Integer> result = service.submit(() -> 30 + 11);
			System.out.println(result.get());
		} finally {
			if(service != null) service.shutdown();
		}
		
		if(service != null) {
			service.awaitTermination(1, TimeUnit.MINUTES);
			
			// Check whether all tasks are finished
			if(service.isTerminated()) System.out.println("Finished!");
			else System.out.println("At least one task is still running");
		}
	}
}