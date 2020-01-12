package jonatas.estudos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyApplication {
	
	
	
	
	public static void main(String[] args) {
		
		menorInteiroPositivoArray a = new menorInteiroPositivoArray();
		int[] A = new int[]{-1,-2,3,4};
		int result = a.teste(A);
		System.out.println(result);
		//SpringApplication.run(StudyApplication.class, args);
		
	}
	
	
}
