public class Troll extends Character {
    public Troll() {
        setWeapon(new AxeBehavior());
    }

    @Override
    public void fight() {
        System.out.println("Troll is fighting...");
        getWeapon().useWeapon();    //getWeapon()返回weapon对象
    }
}
