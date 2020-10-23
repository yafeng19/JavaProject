public class Queen extends Character {
    public Queen() {
        setWeaponBehavior(new BowAndArrowBehavior());
    }

    @Override
    public void fight() {
        System.out.println("Queen is fighting...");
    }
}
