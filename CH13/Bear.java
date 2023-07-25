public class Bear {}

enum Size {SMALL, MEDIUM, LARGE}

@interface Panda {
	int height();
	String[] generalInfo();
	Size size() default Size.SMALL;
	Class friendlyBear();
	Exercise exercise() default @Exercise(hoursPerDay=2);
}