import java.util.*;
class Linkedhashsetusingforeach{
    public static void main(String args[]){
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("Hello");
        a.add("Hello");
        a.add("Students");
        a.add("Ram");
        a.add("Students");
        for(String s:a)
        {
            System.out.print(s+" ");
        }    
        }
}