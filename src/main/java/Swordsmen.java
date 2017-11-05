import java.util.concurrent.ThreadLocalRandom;

public abstract class Swordsmen extends Character {
    protected int MIN_HP;
    protected int MAX_HP;
    protected int MIN_POWER;
    protected int MAX_POWER;

    Swordsmen() {
        this.hp = ThreadLocalRandom.current().nextInt(MIN_HP, MAX_HP + 1);
    }

    public void kick(Character enemy) {
        enemy.beatMe(ThreadLocalRandom.current().nextInt(MIN_POWER, MAX_POWER + 1));
    }
}
