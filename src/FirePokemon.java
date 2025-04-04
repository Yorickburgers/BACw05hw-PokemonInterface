import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private final String type = "Fire";
    private final List<String> attacks = Arrays.asList("Fire Lash", "Flamethrower", "Pyro Ball", "Inferno");;

    public FirePokemon(String name, int level, int hp, String food, String sound){
        super(name, level, hp, food, sound);
    }

    void fireLash(Pokemon name, Pokemon enemy) {
        int damage = 20;
        float modifier;
        System.out.println(name + " uses Fire Lash on " + enemy + "!");

        switch (enemy.getType()) {
            case "Fire":
                modifier = 0.25f;
                break;
            case "Electric":
                modifier = 0.5f;
                break;
            case "Grass":
                modifier = 2.0f;
                break;
            default:
                modifier = 1.0f;
        }

        System.out.println(enemy + " loses " + (damage * modifier) + " hp!");
        enemy.setHp(enemy.getHp() - (int) (damage * modifier));
        System.out.println(enemy + " has " + enemy.getHp() + " hp left!");
    }

    void flameThrower(Pokemon name, Pokemon enemy) {
        int damage = 32;
        float modifier;
        System.out.println(name + " uses Flamethrower on " + enemy + "!");

        switch (enemy.getType()) {
            case "Fire":
                modifier = 0.25f;
                break;
            case "Electric":
                modifier = 0.5f;
                break;
            case "Grass":
                modifier = 2.0f;
                break;
            default:
                modifier = 1.0f;
        }

        System.out.println(enemy + " loses " + (damage * modifier) + " hp!");
        enemy.setHp(enemy.getHp() - (int) (damage * modifier));
        System.out.println(enemy + " has " + enemy.getHp() + " hp left!");
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        int damage = 44;
        float modifier;
        System.out.println(name + " uses Pyro Ball on " + enemy + "!");

        switch (enemy.getType()) {
            case "Fire":
                modifier = 0.25f;
                break;
            case "Electric":
                modifier = 0.5f;
                break;
            case "Grass":
                modifier = 2.0f;
                break;
            default:
                modifier = 1.0f;
        }

        System.out.println(enemy + " loses " + (damage * modifier) + " hp!");
        enemy.setHp(enemy.getHp() - (int) (damage * modifier));
        System.out.println(enemy + " has " + enemy.getHp() + " hp left!");
    }

    void inferno(Pokemon name, Pokemon enemy) {
        int damage = 60;
        float modifier;
        System.out.println(name + " uses Inferno on " + enemy + "!");

        switch (enemy.getType()) {
            case "Fire":
                modifier = 0.25f;
                break;
            case "Electric":
                modifier = 0.5f;
                break;
            case "Grass":
                modifier = 2.0f;
                break;
            default:
                modifier = 1.0f;
        }

        System.out.println(enemy + " loses " + (damage * modifier) + " hp!");
        enemy.setHp(enemy.getHp() - (int) (damage * modifier));
        System.out.println(enemy + " has " + enemy.getHp() + " hp left!");
    }


    public List<String> getAttacks() {
        return attacks;
    }
}
