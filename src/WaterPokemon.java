import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private final String type = "Water";
    private final List<String> attacks = Arrays.asList("Surf", "Hydro Pump", "Hydro Cannon", "Rain Dance");;

    public WaterPokemon(String name, int level, int hp, String food, String sound){
        super(name, level, hp, food, sound);
    }

    void surf(Pokemon name, Pokemon enemy);

    void hydroPump(Pokemon name, Pokemon enemy);

    void hydroCanon(Pokemon name, Pokemon enemy);

    void rainDance(Pokemon name, Pokemon enemy);

    public List<String> getAttacks() {
        return attacks;
    }
}
