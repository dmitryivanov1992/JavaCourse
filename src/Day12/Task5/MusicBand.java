package Day12.Task5;

import java.util.List;

public class MusicBand {
    private final String name;
    private final int year;
    private final List<MusicArtist> members;
    public MusicBand(String name, int year, List<MusicArtist> members)  {
        this.name = name;
        this.year = year;
        this.members = members;
    }
    public int getYear(){
        return this.year;
    }
    @Override
    public String toString(){
        return this.name + " "+ Integer.valueOf(this.year)+" "+ this.members.toString();
    }

    public List<MusicArtist> getMembers(){
        return this.members;
    }


    public static void transferMembers(MusicBand bandFrom, MusicBand bandTo){
        bandTo.getMembers().addAll(bandFrom.getMembers());
        bandFrom.getMembers().clear();
    }
    public void printMembers(){
        if (this.getMembers().isEmpty()) {
            System.out.println("В группе " + this.name + " нет ни одного участника!");
            return;
        }
        System.out.println("В группе "+this.name + " участвуют: ");
        for (MusicArtist m: this.getMembers()
             ) {
            System.out.println(m);
        }
    }
}
