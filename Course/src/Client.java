interface Flyable {
    public void fly();
}

interface Quackable {
    public void quack();
}

abstract class Duck {
    Flyable flyBehavior;    //用接口声明实例变量
    Quackable quackBehavior;

    public void swim() {
        System.out.println("Duck's swim...");
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();  //由子类决定哪个对象调用方法
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}

/*Flyable 接口的两个子类*/
class FlyWithWings implements Flyable {
    public void fly() {
        System.out.println("I'm flying!");
    }
}

class FlyNoWay implements Flyable {
    public void fly() {
        System.out.println("I can not fly!");
    }
}


/*Quackable 接口的两个子类*/
class Quack implements Quackable {
    public void quack() {
        System.out.println("Quack...");
    }
}

class Squeak implements Quackable {
    public void quack() {
        System.out.println("Squeak...");
    }
}

/*RedHeadDuck 可以实现FlyWithWings()和Quack()*/
class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Read Head duck's display!");
    }
}

/*MellardDuck 可以实现FlyWithWings()和Squeak()*/
class MellardDuck extends Duck {
    public MellardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Mellard duck's display!");
    }
}

/*RubberDuck 可以实现FlyNoWay()和Quack()*/
class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Rubber duck's display!");
    }
}

public class Client {
    public static void main(String args[]) {
        RedHeadDuck rhd = new RedHeadDuck();
        rhd.swim();
        rhd.performFly();
        rhd.performQuack();
        rhd.display();
        System.out.println("===========================");
        MellardDuck md = new MellardDuck();
        md.swim();
        md.performFly();
        md.performQuack();
        md.display();
        System.out.println("===========================");
        Duck rd = new RubberDuck();
        rd.swim();
        rd.performFly();
        rd.performQuack();
        rd.display();
    }
}
