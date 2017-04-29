package genericite;

import java.util.List;

public interface Dao<T> {
	
	List<T> lister();
	void inserer(T elt);
}
