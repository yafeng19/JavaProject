public class King extends Character {

    public King() {
        setWeaponBehavior(new SwordBehavior());
    }

    @Override
    public void fight() {
        System.out.println("King is fighting...");
    }
}
