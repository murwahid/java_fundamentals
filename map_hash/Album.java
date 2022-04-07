import java.util.HashMap; 
import java.util.Set;

public class Album { 
    public static void main(String[] args){
        HashMap <String,String> album = new HashMap<String,String>(); 
        album.put("Marvins Garage", "Cups of that whiskey"); 
        album.put("Drown the Tequila", "I wouldn't mind checking my phone"); 
        album.put("14 Karat Magic", "Hustler, Gangsters, and Random Friends");
        album.put("Speechfull", "That shirt leads me to having a ton questions");
        //Get Keys
        Set<String> songs = album.keySet(); 
        for(String song:songs) {
            System.out.println(song);
            System.out.println(album.get(song));
        };
        System.out.printf("This is the song I wanted: %s: %s", "14 Karat Magic", album.get("14 Karat Magic"));
    }
}