package jonatas.estudos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyApplication {
	
	
	
	
	public static void main(String[] args) {
		
//		menorInteiroPositivoArray a = new menorInteiroPositivoArray();
//		int[] A = new int[]{-1,-2,3,4};
//		int result = a.teste(A);
//		System.out.println(result);
		
		
		OrganizadorTamanhoArquivos b = new OrganizadorTamanhoArquivos();
		
		 String S = "my.song.mp3 11b\n" + 
		 		"greatSong.flac 1000b\n" + 
		 		"not3.txt 5b\n" + 
		 		"video.mp4 200b\n" + 
		 		"game.exe 100b\n" + 
		 		"mov!e.mkv 10000b";
		b.organizar(S);
		//SpringApplication.run(StudyApplication.class, args);
		
	}
	
	
}
