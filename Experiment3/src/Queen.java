public class Queen extends Character {
    public Queen() {
        setWeapon(new BowAndArrowBehavior());
    }

    @Override
    public void fight() {
        System.out.println("Queen is fighting...");
        getWeapon().useWeapon();    //getWeapon()返回weapon对象
    }
}
