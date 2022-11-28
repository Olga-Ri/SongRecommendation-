import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class songMatch {

    public static void main(String[] args) {
        
        
        String[][] songs = new String[3][3];

        System.out.println("From the list below, type out your favorite song. ");

        songs[0][0] = "You belong with me by Taylor Swift";

        songs[0][1] = "Yellow by Coldplay";
        songs[0][2] = "Running up that hill by Kate Bush";
        songs[1][0] = "Yo Perreo Sola by Bad Bunny";
        songs[1][1] = "Brutal by Olivia Rodrigo";
        songs[1][2] = "Starman by David Bowie";
        songs[2][0] = "Moon Song by Pheobe Bridgers";
        songs[2][1] = "Yellow Submarine by The Beetles";
        songs[2][2] = "Complicated by Avril Lavigne";

        //for loop to print rows and columns

        for (int i = 0; i<songs.length; i++) {
            System.out.println();
            for(int j = 0; j<songs.length; j++) {
                System.out.println(songs[i][j] + " ");

            }

        }   

         HashMap<String, String> zodiSong = new HashMap<>();   //creating a hashmap 
        
         zodiSong.put("Yellow by Coldplay", " Songs by Radiohead");
         zodiSong.put("Traitor by Olivia Rodrigo", " Songs by Taylor Swift");
         zodiSong.put("You belong with me by Taylor Swift", " Songs by Pheobe Bridgers");
         zodiSong.put("Running up that hill by Kate Bush", " Songs by New Order");
         zodiSong.put("Moon Song by Pheobe Bridgers", " Songs by Faye Webster");
         zodiSong.put("Yellow Submarine by The Beatles ", " Songs by ABBA");
         zodiSong.put("Complicated by Avril Lavigne", " Songs by Paramore ");
         zodiSong.put("Starman by David Bowie", " Songs by Pink Floyd");
         zodiSong.put("Yo Perreo Sola by Bad Bunny", " Songs by Daddy Yankee");


         Scanner song = new Scanner(System.in);  // Create a Scanner object
         String songChoice = song.nextLine();  // Read user input

         System.out.println("Username favorite song is : " + songChoice);

         
    for(Entry<String, String> entry: zodiSong.entrySet()) {        //to run through the hashmap 

        String key = entry.getKey();
        Object valueSong = entry.getValue();


         String value = "Yellow by Coldplay"; //so the for loop knows what values to look for 
         String value1 = "Traitor by Olivia Rodrigo";
         String value2 = "You belong with me by Taylor Swift";
         String value3 = "Running up that hill by Kate Bush";
         String value4 = "Moon Song by Pheobe Bridgers";
         String value5 = "Yellow Submarine by The Beatles ";
         String value6 = "Complicated by Avril Lavigne";
         String value7 = "Moon Song by Pheobe Bridgers";
         String value8 = "Yo Perreo Sola by Bad Bunny";

        if (entry.getKey().equals("Yellow by Coldplay")) { 
            System.out.println("If you like that song, you might enjoy" + entry.getValue());
        } else if (entry.getKey().equals("Traitor by Olivia Rodrigo")) {
            System.out.println("If you like that song, you might enjoy" + entry.getValue());
        } else if(entry.getKey().equals("You belong with me by Taylor Swift")) {
            System.out.println("If you like that song, you might enjoy" + entry.getValue());
        } else if (entry.getKey().equals("Running up that hill by Kate Bush")) {
            System.out.println("If you like that song, you might enjoy" + entry.getValue());
        } else if (entry.getKey().equals("Moon Song by Pheobe Bridgers")) {
            System.out.println("If you like that song, you might enjoy" + entry.getValue());
        } else if (entry.getKey().equals("Yellow Submarine by The Beatles")) {
            System.out.println("If you like that song, you might enjoy" + entry.getValue());
        } else if (entry.getKey().equals("Complicated by Avril Lavigne")) {
            System.out.println("If you like that song, you might enjoy" + entry.getValue());
        } else if (entry.getKey().equals("Starman by David Bowie")) {
            System.out.println("If you like that song, you might enjoy" + entry.getValue());
        } else if (entry.getKey().equals("Yo Perreo Sola by Bad Bunny")) {
            System.out.println("If you like that song, you might enjoy" + entry.getValue());
        } else {
            break;
        }



//this is for entry          
    }
           
                
  //these belong to the class and static        
    }

    
}






