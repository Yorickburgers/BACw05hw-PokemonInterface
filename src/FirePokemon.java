import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private final String type = "Fire";
    private final List<String> attacks = Arrays.asList("Fire Lash", "Flamethrower", "Pyro Ball", "Inferno");;

    public FirePokemon(String name, int level, int hp, String food, String sound){
        super(name, level, hp, food, sound);
    }

    void fireLash(Pokemon name, Pokemon enemy);

    void flameThrower(Pokemon name, Pokemon enemy);

    void pyroBall(Pokemon name, Pokemon enemy);

    void inferno(Pokemon name, Pokemon enemy);

    public List<String> getAttacks() {
        return attacks;
    }
}
