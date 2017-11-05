import java.util.concurrent.ThreadLocalRandom;

public class CharacterFactory {
    public Character createCharacter() {
        int characterNumber = ThreadLocalRandom.current().nextInt(1, 4 + 1);
        switch (characterNumber) {
            case 1:
                return new Hobbit();
            case 2:
                return new Elf();
            case 3:
                return new Knight();
            case 4:
                return new King();
            default:
                return new Elf();
        }
    }
}
