package n2exercici2;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {

        List<Person> list1 = new ArrayList<Person>();
        List<Integer> list2 = new ArrayList<Integer>();
        List<String> list3 = new ArrayList<String>();

        list1.add(new Person());
        list1.add(new Person());
        list1.add(new Person());

        list2.add(1);
        list2.add(2);
        list2.add(3);

        list3.add("hello");
        list3.add("world");
        list3.add("!");

        GenericMethods gm = new GenericMethods();

        gm.method(list1, list2, list3);

    }
}
