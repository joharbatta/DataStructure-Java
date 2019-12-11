import java.util.*;
import java.util.HashMap;

public class mapimp
{
    public static void main(String[] args) {

        HashMap<Integer,String> map=new HashMap<>();
        map.put(0,"jatt");
        map.put(1,"jatti");
        map.put(2,"ustaad");
        map.put(3,"sidhu");
        System.out.println(map.get(0));
        System.out.println(map.containsKey(4));
        
    }
}