public abstract class Character {
    protected int power;
    protected int hp;

    abstract void kick(Character enemy);

    public boolean isAlive() {
        return power <= 0;
    }

    public int showMyPower() {
        return this.power;
    }

    public void beatMe(int units) {
        this.hp = this.hp - units;
    }
}
