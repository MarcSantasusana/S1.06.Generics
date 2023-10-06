package n2exercici1;

import java.util.List;

public class GenericMethods {

    public GenericMethods()
        {

        }
    public <T> void method(T obj1, T obj2, String obj3)
        {
            System.out.println(obj1);
            System.out.println(obj2);
            System.out.println(obj3);

        }

}
