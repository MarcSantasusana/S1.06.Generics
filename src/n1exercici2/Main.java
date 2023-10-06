package n1exercici2;

public class Main {

    public static void main(String[] args)
    {

        Person person = new Person();
        int number = 3;
        String text = "hello";

        GenericMethods gm = new GenericMethods();

        gm.method(person, number, text);


    }
}
