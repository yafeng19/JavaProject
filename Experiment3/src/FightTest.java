public class FightTest {
    public static void main(String args[]) {
        Character king = new King();
        king.fight();
        System.out.println("====================");
        Character queen = new Queen();
        queen.fight();
        System.out.println("====================");
        Character knight = new Knight();
        knight.fight();
        System.out.println("====================");
        Character troll = new Troll();
        troll.fight();
        System.out.println("====================");
        System.out.println("====================");
        System.out.println("+++upgrade+++");
        knight.setWeapon(new SwordBehavior());
        knight.fight();
    }
}
