import java.util.List;

public class PokemonTrainer {
    private String name;
    private List pokemons;

    public PokemonTrainer(String name, List pokemons) {
        this.name = name;
        this.pokemons = pokemons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getPokemons() {
        return pokemons;
    }

    public void setPokemons(List pokemons) {
        this.pokemons = pokemons;
    }
}
