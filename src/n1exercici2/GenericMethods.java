package n1exercici2;

public class GenericMethods {

    public GenericMethods()
        {

        }
    public <T> void method(T obj1, T obj2, T obj3)
        {
            System.out.println(obj1);
            System.out.println(obj2);
            System.out.println(obj3);

        }
}
