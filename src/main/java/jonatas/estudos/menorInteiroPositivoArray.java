package jonatas.estudos;

import java.util.HashSet;
import java.util.Set;

public class menorInteiroPositivoArray {
	
	public int teste(int[] A) {
		int N = A.length;
		Set<Integer> set = new HashSet<>();
		for (int a : A) {
		    if (a > 0) {
		        set.add(a);
		    }
		}
		for (int i = 1; i <= N + 1; i++) {
		    if (!set.contains(i)) {
		        return i;
		    }
		}
		return 0;
	}

}
