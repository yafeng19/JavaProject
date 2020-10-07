/**
 * 单例
 */

public class Singleton {
    private static Singleton single = new Singleton();
    private Singleton(){

    }
    public static Singleton getInstance(){
        return single;
    }
}

class SingletonTest{
    public static void main(String args[])
    {
        Singleton sing1 = Singleton.getInstance();
        Singleton sing2 = Singleton.getInstance();
        System.out.println(sing1);
        System.out.println(sing2);
    }
}