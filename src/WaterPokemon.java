import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private final String type = "Water";
    private final List<String> attacks = Arrays.asList("Surf", "Hydro Pump", "Hydro Cannon", "Rain Dance");;

    public WaterPokemon(String name, int level, int hp, String food, String sound){
        super(name, level, hp, food, sound);
    }

    void surf(Pokemon name, Pokemon enemy) {
        int damage = 32;
        float modifier;
        System.out.println(name + " uses Surf on " + enemy + "!");

        switch (enemy.getType()) {
            case "Water":
                modifier = 0.25f;
                break;
            case "Grass":
                modifier = 0.5f;
                break;
            case "Fire":
                modifier = 2.0f;
                break;
            default:
                modifier = 1.0f;
        }

        System.out.println(enemy + " loses " + (damage * modifier) + " hp!");
        enemy.setHp(enemy.getHp() - (int) (damage * modifier));
        System.out.println(enemy + " has " + enemy.getHp() + " hp left!");
    }

    void hydroPump(Pokemon name, Pokemon enemy) {
        int damage = 40;
        float modifier;
        System.out.println(name + " uses Hydro Pump on " + enemy + "!");

        switch (enemy.getType()) {
            case "Water":
                modifier = 0.25f;
                break;
            case "Grass":
                modifier = 0.5f;
                break;
            case "Fire":
                modifier = 2.0f;
                break;
            default:
                modifier = 1.0f;
        }

        System.out.println(enemy + " loses " + (damage * modifier) + " hp!");
        enemy.setHp(enemy.getHp() - (int) (damage * modifier));
        System.out.println(enemy + " has " + enemy.getHp() + " hp left!");
    }

    void hydroCanon(Pokemon name, Pokemon enemy) {
        int damage = 60;
        float modifier;
        System.out.println(name + " uses Hydro Cannon on " + enemy + "!");

        switch (enemy.getType()) {
            case "Water":
                modifier = 0.25f;
                break;
            case "Grass":
                modifier = 0.5f;
                break;
            case "Fire":
                modifier = 2.0f;
                break;
            default:
                modifier = 1.0f;
        }

        System.out.println(enemy + " loses " + (damage * modifier) + " hp!");
        enemy.setHp(enemy.getHp() - (int) (damage * modifier));
        System.out.println(enemy + " has " + enemy.getHp() + " hp left!");
    }

    void rainDance(Pokemon name, Pokemon enemy) {
        int damage = 20;
        float modifier;
        String enemyType = enemy.getType();
        System.out.println(name + " uses Rain Dance on " + enemy + "!");

        switch (enemy.getType()) {
            case "Water":
                modifier = 0.25f;
                break;
            case "Grass":
                modifier = -0.5f;
                break;
            case "Fire":
                modifier = 2.0f;
                break;
            case "Electric":
                modifier = 0.0f;
                break;
            default:
                modifier = 1.0f;
        }

        if (enemyType == "Electric") {
            System.out.println("Rain Dance has no effect on " + enemy);
        } else if (enemyType == "Grass") {
            System.out.println(enemy + " heals for " + (damage * modifier) + " hp!");
        } else {
            System.out.println(enemy + " loses " + (damage * modifier) + " hp!");
        }
        enemy.setHp(enemy.getHp() - (int) (damage * modifier));
        System.out.println(enemy + " has " + enemy.getHp() + " hp left!");
    }

    public List<String> getAttacks() {
        return attacks;
    }
}
