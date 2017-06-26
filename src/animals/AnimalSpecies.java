package animals;

/**
 * Created by Crown on 6/24/2017.
 */
public class AnimalSpecies {

    private AnimalNames name;
    private int lifeSpan;
    private int type;

    static enum AnimalNames
    {
        LION,//
        LAMB,
        CHICKEN,
        BEAR,
        WOLVE,//
        MONKEY,
        ELEPHANT,
        VIPER, //Include
        COBRA //Include

    }

    private AnimalSpecies(AnimalNames name) throws SpeciesDoesNotExistException {
        this.name = name;
        populate(name);
    }

    public AnimalSpecies populate(AnimalNames species) throws SpeciesDoesNotExistException
    {
        if(!contains(species))
        {
            throw new SpeciesDoesNotExistException();
        }

        switch(species)
        {
            case VIPER:
            case COBRA:
                this.lifeSpan = 15;
                break;
            case LION:
            case WOLVE:
                this.lifeSpan = 15;
        }
    }

    public static boolean contains(AnimalNames test) {

        for (AnimalNames a : AnimalNames.values()) {
            if (a.name().equals(test)) {
                return true;
            }
        }

        return false;
    }
}