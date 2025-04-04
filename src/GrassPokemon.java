import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    private final String type = "Grass";
    private final List<String> attacks = Arrays.asList("Leaf Storm", "Solar Beam", "Leech Seed", "Leaf Blade");;

    public GrassPokemon(String name, int level, int hp, String food, String sound){
        super(name, level, hp, food, sound);
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        int damage = 44;
        float modifier;
        System.out.println(name + " uses Leaf Storm on " + enemy + "!");

        switch (enemy.getType()) {
            case "Grass":
                modifier = 0.25f;
                break;
            case "Water":
                modifier = 0.5f;
                break;
            case "Electric":
                modifier = 2.0f;
                break;
            default:
                modifier = 1.0f;
        }

        System.out.println(enemy + " loses " + (damage * modifier) + " hp!");
        enemy.setHp(enemy.getHp() - (int) (damage * modifier));
        System.out.println(enemy + " has " + enemy.getHp() + " hp left!");
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        int damage = 40;
        float modifier;
        System.out.println(name + " uses Solar Beam on " + enemy + "!");

        switch (enemy.getType()) {
            case "Grass":
                modifier = 0.25f;
                break;
            case "Water":
                modifier = 0.5f;
                break;
            case "Electric":
                modifier = 2.0f;
                break;
            default:
                modifier = 1.0f;
        }

        System.out.println(enemy + " loses " + (damage * modifier) + " hp!");
        enemy.setHp(enemy.getHp() - (int) (damage * modifier));
        System.out.println(enemy + " has " + enemy.getHp() + " hp left!");
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        int damage = 24;
        float modifier;
        System.out.println(name + " uses Leech Seed on " + enemy + "!");

        switch (enemy.getType()) {
            case "Grass":
                modifier = 0.25f;
                break;
            case "Water":
                modifier = 0.5f;
                break;
            case "Electric":
                modifier = 2.0f;
                break;
            default:
                modifier = 1.0f;
        }

        System.out.println(enemy + " loses " + (damage * modifier) + " hp!");
        enemy.setHp(enemy.getHp() - (int) (damage * modifier));
        System.out.println(enemy + " has " + enemy.getHp() + " hp left!");
        System.out.println(name + " heals for " + (damage * modifier) + " hp!");
        name.setHp(name.getHp() + (int) (damage * modifier));
        System.out.println(name + " has " + enemy.getHp() + " hp left!");
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        int damage = 32;
        float modifier;
        System.out.println(name + " uses Leaf Blade on " + enemy + "!");

        switch (enemy.getType()) {
            case "Grass":
                modifier = 0.25f;
                break;
            case "Water":
                modifier = 0.5f;
                break;
            case "Electric":
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
