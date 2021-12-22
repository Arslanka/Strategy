package Characters;

import Enums.Appearance;
import Enums.Location;
import Stuff.Shirt;
import com.sun.org.apache.bcel.internal.generic.RETURN;

public class Citizen extends Character {
    public Citizen(String name) {
        super(name);
    }
    public String getLocation() {
        return Location.ZMEEVKA.toString();
    }

    public void comeAndWaitFor(Character human) {
        String additional = "";
        if (human instanceof Visitor) additional = " из города " + ((Visitor) human).getLocation();
        System.out.println("Вечер ещё не наступил, но все Персонажи " + getName() + "ждали Персонажей" + human.getName() + additional + ".");
    }

    @Override
    public String toString() {
        return "Персонаж " + getName();
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Citizen)) return false;

        Citizen citizen = (Citizen) object;
        return getName().equals(citizen.getName());
    }
}
