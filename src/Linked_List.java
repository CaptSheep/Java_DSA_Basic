import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {

    public static void main(String[] args) {
        LinkedList<Integer> list = new  LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(7);
        list.add(9);
        list.addFirst(10);
        list.remove(3);
        for( int element : list){
            System.out.println(element);
        }

    }
}
