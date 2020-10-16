abstract class Duck {
    public void swim() {
        System.out.println("Duck's swim...");
    }

    public void quack() {
        System.out.println("Duck's quack...");
    }

    public void fly() {
        System.out.println("Duck's fly...");
    }

    public abstract void display();
}

class RedHeadDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Read Head duck's display");
    }
}

class MellardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Mellard duck's display");
    }
}

class SomeUnknownDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Some unknown duck's display");
    }

    public void quack() {
        System.out.println("Some unknown duck's quack...");
    }

    public void fly() {
        System.out.println("Some unknown duck's fly...");
    }
}

public class Client {
    public static void main(String args[]) {
        Duck rhd = new RedHeadDuck();
        rhd.swim();
        rhd.quack();
        rhd.fly();
        rhd.display();
        System.out.println("===========================");
        Duck md = new MellardDuck();
        md.swim();
        md.quack();
        md.fly();
        md.display();
        System.out.println("===========================");
        Duck sud = new SomeUnknownDuck();
        sud.swim();
        sud.quack();
        sud.fly();
        sud.display();
    }
}
