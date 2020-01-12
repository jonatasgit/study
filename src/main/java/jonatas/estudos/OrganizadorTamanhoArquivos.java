package jonatas.estudos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class OrganizadorTamanhoArquivos {
	
	 
	 
	 public void organizar(String S) {
		 String[] arrayStr = S.split("\n", 0); 
		 
		int music = 0;
		int image = 0;
		int movie = 0;
		int other = 0;
		
		  
	        for (String a : arrayStr) { 
	        	//MUSICS
	            if(a.contains(".mp3") || a.contains(".flac") || a.contains(".aac")) {
	            	String musicSize = a.substring(a.lastIndexOf(" ")+1);
	            	musicSize = musicSize.substring(0, musicSize.length() - 1);
	            	music += Integer.parseInt(musicSize);
	            //IMAGES
	            } else if(a.contains(".jpg") || a.contains(".bmp") || a.contains(".gif")) {
	            	String imageSize = a.substring(a.lastIndexOf(" ")+1);
	            	imageSize = imageSize.substring(0, imageSize.length() - 1);
	            	image += Integer.parseInt(imageSize);
		          //MOVIES
	            } else if(a.contains(".mp4") || a.contains(".avi") || a.contains(".mkv")) {
	            	String movieSize = a.substring(a.lastIndexOf(" ")+1);
	            	movieSize = movieSize.substring(0, movieSize.length() - 1);
	            	movie += Integer.parseInt(movieSize);
		          //OTHER
	            } else {
	            	String otherSize = a.substring(a.lastIndexOf(" ")+1);
	            	otherSize = otherSize.substring(0, otherSize.length() - 1);
	            	other += Integer.parseInt(otherSize);
	            }
	            
	            
	        }
	        
            String result = "music "+ music+"b\r\n" + "images "+ image+"b\r\n" + "movies "+ movie+"b\r\n" + "other "+ other+"b\r\n";
            				
	        System.out.println(result);
	 }
}
