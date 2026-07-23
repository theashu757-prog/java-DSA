import java.util.ArrayList;
import java.util.collections;
class MyArrayList{
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList <Integer>();
        // add
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // get
        int elemeent = list.get(0);
        system.out.println(element);

        //add element at index
        list.add(1,5);
        system.out.println(list);

        //set element at index
        // means replace the element at index 1 with 10
        list.set(1, 10);
        system.out.println(list);

        //remove element at  index
        list.remove(3);
        system.out.println(list);

        //size
        int size = list.size();
        system.out.println(size);

        //loop
        for(int i = 0; i<list.size(); i++){
            system.out.println(list.get(i));

            //sorting
            //for sorting we need to import collections class
            collections.sort(list);
        }
    }
}

