package n2exercici2;

import java.util.List;

public class GenericMethods {

    public GenericMethods()
        {

        }
    public <T, U, V> void method(List<T> list1, List<U> list2, List<V> list3)
        {
            System.out.println(list1 + "\n" + list2 + "\n" + list3);

        }
}


