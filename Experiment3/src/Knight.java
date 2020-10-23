public class Knight extends Character{
    public Knight(){
        setWeaponBehavior(new KnifeBehavior());
    }

    @Override
    public void fight() {
        System.out.println("Knight is fighting...");
    }
}
