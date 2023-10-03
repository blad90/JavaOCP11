public class InOutdoorLoops {
	public static void main(String[] args){
		var swing = 1.04f;
		OUTDOOR: while(swing < 5){
			var slide = 0;
			INDOOR: do {
				slide++;
				if(slide == 1){
					break OUTDOOR;
				}
				else if(swing < 5)
					continue;
				swing++;
			} while(slide < 5);
		}
	}
}