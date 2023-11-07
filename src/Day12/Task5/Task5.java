package Day12.Task5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<MusicArtist> artistsRHCP = new ArrayList<>();
        artistsRHCP.add(new MusicArtist("Peter Malkov",33));
        artistsRHCP.add(new MusicArtist("John Various",38));
        artistsRHCP.add(new MusicArtist("Bob Handowski",37));
        MusicBand RHCP = new MusicBand("Red Hot Chili Peppers",1983,artistsRHCP);
        ArrayList<MusicArtist> artistsABBA = new ArrayList<>();
        artistsABBA.add(new MusicArtist("Justin Timberlake",23));
        artistsABBA.add(new MusicArtist("Jake Hemphir",44));
        artistsABBA.add(new MusicArtist("John Bon Jovi",29));
        MusicBand abba = new MusicBand("ABBA", 1972, artistsABBA);
        MusicBand.transferMembers(RHCP, abba);
        RHCP.printMembers();
        abba.printMembers();

    }
}
