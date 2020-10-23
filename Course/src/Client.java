interface Flyable {
    public void fly();
}

interface Quackable {
    public void quack();
}

abstract class Duck {
    private Flyable flyBehavior;    //用接口声明实例变量

    public Quackable getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(Quackable quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    private Quackable quackBehavior;

    public Flyable getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(Flyable flyBehavior) {
        this.flyBehavior = flyBehavior;
    }


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
        System.out.println("I'm flying with wings!");
    }
}

class FlyNoWay implements Flyable {
    public void fly() {
        System.out.println("I can not fly!");
    }
}

class FlyWithRocket implements Flyable {
    public void fly() {
        System.out.println("I'm flying with rocket!");
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

class MuteQuack implements Quackable {
    public void quack() {
        System.out.println("I can not quack!");
    }
}

/*RedHeadDuck 可以实现FlyWithWings()和Quack()*/
class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("Read Head duck's display!");
    }
}

/*MellardDuck 可以实现FlyWithWings()和Squeak()*/
class MellardDuck extends Duck {
    public MellardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new Squeak());
    }

    @Override
    public void display() {
        System.out.println("Mellard duck's display!");
    }
}

/*RubberDuck 可以实现FlyNoWay()和Quack()*/
class RubberDuck extends Duck {
    public RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Quack());
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
        rd.setFlyBehavior(new FlyWithRocket());
        rd.performFly();
        rd.setQuackBehavior(new MuteQuack());
        rd.performQuack();
        rd.display();
    }
}
