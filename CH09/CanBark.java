interface Dog extends CanBark, HasVocalCords {
	abstract int chew();
}
public interface CanBark extends HasVocalCords {
	public void bark();
}
interface HasVocalCords {
	public abstract void makeSound();
}
