package Day12.Task3;

import java.util.ArrayList;

public class MusicBand {
    private String name;
    private int year;
    public MusicBand(String name, int year, ArrayList<String> strings){
        this.name = name;
        this.year = year;
    }
    public int getYear(){
        return this.year;
    }
    @Override
    public String toString(){
        return this.name + " "+ Integer.valueOf(this.year);
    }
}
