package Day12.Task5;

import Day12.Task4.MusicBand;

public class MusicArtist {
    private final String name;
    private final int age;
    public MusicArtist(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return this.name + "  " + Integer.valueOf(age);
    }
}
