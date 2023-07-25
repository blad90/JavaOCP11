import java.lang.annotation.Repeatable;

public class Zoo {
	public static class Monkey {}
	
	@Risk(danger="Silly")
	@Risk(danger="Aggressive",level=5)
	@Risk(danger="Violent",level=10)
	private Monkey monkey;
}

@Repeatable(Risks.class)
@interface Risk{
	String danger();
	int level() default 1;
}

@interface Risks {
	Risk[] value();
}