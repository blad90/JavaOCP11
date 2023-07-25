import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS) public @interface Flier {}
@Retention(RetentionPolicy.RUNTIME) @interface Swimmer {}