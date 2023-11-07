package Day12;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args){
        ArrayList<String> autos = new ArrayList<>(Arrays.asList("Lada", "KIA", "Tesla", "Dodge", "Chrysler"));
        System.out.println(autos.toString());
        autos.add(autos.size()/2,"Mercedes");
        autos.remove(0);
        System.out.println(autos.toString());
    }
}
