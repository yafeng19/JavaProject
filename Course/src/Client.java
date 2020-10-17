abstract class Duck {
    public void swim() {
        System.out.println("Duck's swim...");
    }

    public abstract void display();
}

interface Quackable {
    public void quack();
}

interface Flyable {
    public void fly();
}

class RedHeadDuck extends Duck implements Quackable, Flyable {
    @Override
    public void quack() {
        System.out.println("Read Head duck's quack!");
    }

    @Override
    public void fly() {
        System.out.println("Read Head duck's fly!");
    }

    @Override
    public void display() {
        System.out.println("Read Head duck's display!");
    }
}

class MellardDuck extends Duck implements Quackable, Flyable {
    @Override
    public void quack() {
        System.out.println("Mellard duck's quack!");
    }

    @Override
    public void fly() {
        System.out.println("Mellard duck's fly!");
    }

    @Override
    public void display() {
        System.out.println("Mellard duck's display!");
    }
}

class RubberDuck extends Duck implements Quackable {
    public void quack() {
        System.out.println("Rubber duck's quack!");
    }

    @Override
    public void display() {
        System.out.println("Rubber duck's display!");
    }
}

class DecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Decoy duck's display");
    }

}

public class Client {
    public static void main(String args[]) {
        RedHeadDuck rhd = new RedHeadDuck();
        rhd.swim();
        rhd.quack();
        rhd.fly();
        rhd.display();
        System.out.println("===========================");
       MellardDuck md = new MellardDuck();
        md.swim();
        md.quack();
        md.fly();
        md.display();
        System.out.println("===========================");
        RubberDuck rd = new RubberDuck();
        rd.swim();
        rd.quack();
        rd.display();
        DecoyDuck deDuck = new DecoyDuck();
        deDuck.swim();
        deDuck.display();

    }
}
