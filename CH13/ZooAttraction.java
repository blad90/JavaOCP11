import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface ZooAttraction {}

@ZooAttraction class RollerCoaster{} //ERROR
class Events {
	@ZooAttraction String rideTrain() { //COMPILES
		return (@ZooAttraction String) "fun!"; //ERROR
	}
	@ZooAttraction Events(@ZooAttraction String description){//COMPILES-ERROR
		super();
	}
	@ZooAttraction int numPassengers; //ERROR
}