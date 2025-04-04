import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private final String type = "Electric";
    private final List<String> attacks = Arrays.asList("Thunder Punch", "Electro Ball", "Thunder", "Volt Tackle");;

    public ElectricPokemon(String name, int level, int hp, String food, String sound){
        super(name, level, hp, food, sound);
    }

    void thunderPunch(Pokemon name, Pokemon enemy){
        int damage = 20;
        float modifier;
        System.out.println(name + " uses Thunder Punch on " + enemy + "!");

        switch (enemy.getType()) {
            case "Electric":
                modifier = 0.25f;
                break;
            case "Fire":
                modifier = 0.5f;
                break;
            case "Water":
                modifier = 2.0f;
                break;
            default:
                modifier = 1.0f;
        }

        System.out.println(enemy + " loses " + (damage * modifier) + " hp!");
        enemy.setHp(enemy.getHp() - (int) (damage * modifier));
        System.out.println(enemy + " has " + enemy.getHp() + " hp left!");
    }

    void electroBall(Pokemon name, Pokemon enemy){
        int damage = 16;
        float modifier;
        System.out.println(name + " uses Electro Ball on " + enemy + "!");

        switch (enemy.getType()) {
            case "Electric":
                modifier = 0.25f;
                break;
            case "Fire":
                modifier = 0.5f;
                break;
            case "Water":
                modifier = 2.0f;
                break;
            default:
                modifier = 1.0f;
        }

        System.out.println(enemy + " loses " + (damage * modifier) + " hp!");
        enemy.setHp(enemy.getHp() - (int) (damage * modifier));
        System.out.println(enemy + " has " + enemy.getHp() + " hp left!");
    };

    void thunder(Pokemon name, Pokemon enemy) {
        int damage = 40;
        float modifier;
        String enemyType = enemy.getType();
        System.out.println(name + " uses Thunder on " + enemy + "!");

        switch (enemyType) {
            case "Electric":
                modifier = -0.25f;
                break;
            case "Fire":
                modifier = 0.5f;
                break;
            case "Water":
                modifier = 2.0f;
                break;
            default:
                modifier = 1.0f;
        }

        if (enemyType == "Electric") {
            System.out.println(enemy + " heals for " + (damage * modifier) + " hp!");
        }
        System.out.println(enemy + " loses " + (damage * modifier) + " hp!");
        enemy.setHp(enemy.getHp() - (int) (damage * modifier));
        System.out.println(enemy + " has " + enemy.getHp() + " hp left!");
    };

    void voltTackle(Pokemon name, Pokemon enemy) {
        int damage = 36;
        float modifier;
        System.out.println(name + " uses Volt Tackle on " + enemy + "!");

        switch (enemy.getType()) {
            case "Electric":
                modifier = 0.25f;
                break;
            case "Fire":
                modifier = 0.5f;
                break;
            case "Water":
                modifier = 2.0f;
                break;
            default:
                modifier = 1.0f;
        }

        System.out.println(enemy + " loses " + (damage * modifier) + " hp!");
        enemy.setHp(enemy.getHp() - (int) (damage * modifier));
        System.out.println(enemy + " has " + enemy.getHp() + " hp left!");
    };

    public List<String> getAttacks() {
        return attacks;
    }
}
