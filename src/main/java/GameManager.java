public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println("Character 1 kicks Character 2");
        c1.kick(c2);
        if (c2.isAlive()) {
            System.out.println("He is still alive");
        } else {
            System.out.println("He is dead");
        }
        System.out.println("Character 2 kicks Character 1");
        c2.kick(c1);
        if (c1.isAlive()) {
            System.out.println("He is still alive");
        } else {
            System.out.println("He is dead");
        }
        System.out.println("");
    }
}
