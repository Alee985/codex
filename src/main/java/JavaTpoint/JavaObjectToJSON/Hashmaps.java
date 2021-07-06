package JavaTpoint.JavaObjectToJSON;
import java.util.*;
public class Hashmaps {
    Map<String,Integer> maps;
    Hashmaps(){
        maps=new HashMap<>();
    }
    public void addKeyValue(String Key,int val){ maps.put(Key,val); }
    public int getValue(String Key){
        return maps.get(Key);
    }
    public void removePair(String Key){
        maps.remove(Key);
    }
    public void deleteAllRecord(){
        maps.clear();
    }
    public void showRecord(){
        System.out.println(maps);
    }
    public Map<String,Integer> getMaps(){
        return maps;
    }

    public static void main(String[] args) {
        Hashmaps data=new Hashmaps();
        data.addKeyValue("Ahmed",30);
        data.addKeyValue("Asif",50);
        data.addKeyValue("Ali",20);
        data.addKeyValue("Ahmed",50);
        data.showRecord();
        System.out.println("The age of Ali is : " + data.getValue("Ali"));
        data.removePair("Asif");
        data.showRecord();
        data.deleteAllRecord();
        data.showRecord();
    }
}