package animals.LandAnimals;

import animals.Animal;

/**
 * Created by Crown on 6/24/2017.
 */

public class LandAnimals implements Animal {
    private String name;
    private AnimalSpecies species;
    private int type;
    private int lifeSpan; //Should be defines by species
    private String[] canEat;


    public LandAnimals(String name, AnimalSpecies species, int type)
    {
        this.name = name;

    }
    @Override
    public String getName() {
        return null;
    }

    @Override
    public AnimalSpecies getSpecies() {
        return null;
    }

    @Override
    public int getLifeSpan() {
        return 0;
    }

    @Override
    public String[] getCanEat() {
        return new String[0];
    }

    @Override
    public int getType() {
        return 0;
    }

    public int
}
