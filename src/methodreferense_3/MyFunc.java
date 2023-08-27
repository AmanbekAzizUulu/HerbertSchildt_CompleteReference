package methodreferense_3;
/**
 * Functional interface with a method that takes two reference arguments and returns a boolean result.
 * 
 * @author Amanbek
 *
 */
@ FunctionalInterface
public interface MyFunc <T> {
	boolean func(T v1, T v2);
}
