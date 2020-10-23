public abstract class Character {
    private WeaponBehavior weapon;

    public void setWeaponBehavior(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public abstract void fight();
    public void fightWithWeapon(){
        weapon.useWeapon();
    }
}
