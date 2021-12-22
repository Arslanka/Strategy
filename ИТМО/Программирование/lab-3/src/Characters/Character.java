package Characters;

import Enums.Appearance;
import Stuff.Shirt;
import Stuff.ThingInterface;

public abstract class Character implements ThingInterface {
    private final String abstractName;

    protected Character(String name) {
        this.abstractName = name;
    }

    @Override
    public String getName() {
        return abstractName;
    }

}