public class FightTest {
    public static void main(String args[]) {
        Character king = new King();
        king.fight();
        king.fightWithWeapon();
        System.out.println("====================");
        Character queen = new Queen();
        queen.fight();
        queen.fightWithWeapon();
        System.out.println("====================");
        Character knight = new Knight();
        knight.fight();
        knight.fightWithWeapon();
        System.out.println("====================");
        Character troll = new Troll();
        troll.fight();
        troll.fightWithWeapon();
        System.out.println("====================");
        System.out.println("====================");
        System.out.println("+++upgrade+++");
        knight.setWeaponBehavior(new SwordBehavior());
        knight.fight();
        knight.fightWithWeapon();
    }
}
