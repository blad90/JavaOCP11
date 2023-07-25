public @interface Injured {
	String veterinarian() default "unassigned";
	String value() default "foot";
	int age() default 1;
}

abstract class Elephant {
	@Injured("value") public void fallDown() {}
	@Injured(value="Legs") public abstract int trip();
	@Injured String injuries[];
}