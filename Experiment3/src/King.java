public class King extends Character {

    public King() {
        setWeapon(new SwordBehavior());
    }

    @Override
    public void fight() {
        System.out.println("King is fighting...");
        getWeapon().useWeapon();    //getWeapon()返回weapon对象
    }
}
