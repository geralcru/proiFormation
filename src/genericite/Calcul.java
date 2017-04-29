package genericite;

/*
 * Classe générique = classe typée
 * qui nous permettra de réutiliser le traitement
 * avec différents types
 */
public class Calcul<T> {

	public T a;
	public T b;
	public int coeff;
	
	public void permuter(){
		T c = a;
		a = b;
		b = c;
	}
}
