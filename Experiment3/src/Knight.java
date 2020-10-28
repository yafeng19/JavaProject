public class Knight extends Character{
    public Knight(){
        setWeapon(new KnifeBehavior());
    }

    @Override
    public void fight() {
        System.out.println("Knight is fighting...");
        getWeapon().useWeapon();    //getWeapon()返回weapon对象
    }
}
