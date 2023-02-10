import java.util.HashMap;
import java.util.Set;

public class SongList {

  public static void main(String[] args) {

    // ====== Create a trackList of type HashMap =========
    HashMap<String, String> songList = new HashMap<String, String>();

    // Add in at least 4 songs that are stored by title
    songList.put("Be My Maybe", "I don't know about you so I'm not sure ...");
    songList.put("You Drive Me Cuckoo", "Like a cuckatoo from Manitou I wanted to ...");
    songList.put("Uh-mazing", "Wow, I am too creative hehehe I could be a poet and didn't even know it ...");
    songList.put("Coding Along In My Automobile", "Don't take it seriously I focus when I drive ...");

    // ===== Pull out one of the songs by its track title =====
    System.out.println(songList.get("Uh-mazing"));

    // ====== Get the keys by using the keySet method ======== //
    Set<String> titles = songList.keySet();
    // enhanced for loop vvv //
    for (String title : titles) {

      /*
       * == Print out all the track names and lyrics in the format Track: Lyrics ===
       */
      System.out.println(title + ": " + songList.get(title));
    }
  }
}
