package n3exercici1;

public class Generic {

    public <T extends Telephone> void firstMethod(T arg)
    {
            arg.call();
           //El mètode limitat per la interfície telèfon no pot cridar al mètode takePhotos()
    }


    public <T extends Smartphone> void secondMethod(T arg)
    {
            arg.call();
            arg.takePhotos();

    }
}
