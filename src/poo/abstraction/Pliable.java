package poo.abstraction;

public interface Pliable {

	void plier();

	void deplier();

	default void imprimer() {
		System.out.println("impression");
	}

}
