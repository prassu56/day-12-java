import java.util.*;
public class Linkedlist{
    public static void main(String[]args){
        LinkedList<String> a=new LinkedList<>();
        a.add("hello");
        a.add("i am");
        a.add("student");
        System.out.println(a);
        a.remove(0);
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}