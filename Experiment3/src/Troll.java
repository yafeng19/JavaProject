public class Troll extends Character {
    public Troll() {
        setWeaponBehavior(new AxeBehavior());
    }

    @Override
    public void fight() {
        System.out.println("Troll is fighting...");
    }
}
