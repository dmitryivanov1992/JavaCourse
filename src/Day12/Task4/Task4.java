package Day12.Task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args){
        MusicBand RHCP = new MusicBand("Red Hot Chili Peppers", 1983, new ArrayList<>(Arrays.asList("Peter Malkov", "John Various", "Bob Handowski")));
        MusicBand abba = new MusicBand("ABBA", 1972, new ArrayList<>(Arrays.asList("Justin Timberlake", "Jake Hemphir", "John Bon Jovi")));
        MusicBand.transferMembers(RHCP,abba);
        RHCP.printMembers();
        abba.printMembers();
    }

}
