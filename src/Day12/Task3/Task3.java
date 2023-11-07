package Day12.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<MusicBand>();
        bands.add(new MusicBand("Red Hot Chili Peppers", 1983, new ArrayList<String>()));
        bands.add(new MusicBand("ABBA", 1972, new ArrayList<String>()));
        bands.add(new MusicBand("КИНО", 1981, new ArrayList<String>()));
        bands.add(new MusicBand("Nirvana", 1987, new ArrayList<String>()));
        bands.add(new MusicBand("Boney M", 1975, new ArrayList<String>()));
        bands.add(new MusicBand("Led Zeppelin", 1968, new ArrayList<String>()));
        bands.add(new MusicBand("БИ-2", 1988, new ArrayList<String>()));
        bands.add(new MusicBand("Queen", 1973, new ArrayList<String>()));
        bands.add(new MusicBand("The Rolling Stones", 1962, new ArrayList<String>()));
        bands.add(new MusicBand("Beatles", 1960, new ArrayList<String>()));
        bands.add(new MusicBand("Aerosmith", 1970, new ArrayList<String>()));
        bands.add(new MusicBand("OneRepublic", 2002, new ArrayList<String>()));
        bands.add(new MusicBand("Panic!At the disco", 2004, new ArrayList<String>()));
        bands.add(new MusicBand("OneDirection", 2010, new ArrayList<String>()));
        Collections.shuffle(bands);
        List<MusicBand> bandsAfter2000 = groupsAfter2000(bands);
        System.out.println("Все группы: " + bands.toString());
        System.out.println("Группы после 2000го года: " + bandsAfter2000.toString());

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> bandsAfter2000 = new ArrayList<MusicBand>();
        for (int i = 0; i < bands.size(); i++) {
            if(bands.get(i).getYear()>2000) bandsAfter2000.add(bands.get(i));
        }
        return bandsAfter2000;
    }
}
