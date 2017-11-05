public class Elf extends Character {
    Elf() {
        this.power = 10;
        this.hp = 10;
    }

    void kick(Character enemy) {
        if (this.showMyPower() > enemy.showMyPower()) {
            enemy.beatMe(10050);
        } else {
            enemy.beatMe(1);
        }
    }
}
