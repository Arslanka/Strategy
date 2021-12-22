package Story;

import Characters.*;
import Enums.*;
import Environment.Alcove;
import Music.*;
import Stuff.*;

public class Main {
    private final static int NUMBER_OF_FLOORS = 4;
    private final static int NUMBER_OF_BABIES = 10;
    private final static int FLOOR = 2;
    private final static boolean MAIN_VISITOR_INVITATION = true;

    public static void main(String[] args) {
        MusicalInstrument smallHarp = new MusicalInstrument("Маленькая арфа", "~/~/~~~", InstrumentSize.SMALL);
        MusicalInstrument middleHarp = new MusicalInstrument("Средняя арфа", "~~~//~~~", InstrumentSize.MIDDLE);
        MusicalInstrument bigHarp = new MusicalInstrument("Большая арфа", "///~~~////", InstrumentSize.BIG);
        MusicalInstrument hugeHarp = new MusicalInstrument("Огромная арфа", "~~~", InstrumentSize.HUGE);

        MusicalInstrument[] harps = {smallHarp, middleHarp, bigHarp, hugeHarp};

        MusicalInstrument harpForBaby = new MusicalInstrument("Небольшая арфа", "/~/", InstrumentSize.SMALL);
        Baby[] babies = new Baby[NUMBER_OF_BABIES];
        for (int i = 0; i < babies.length; i++) {
            babies[i] = new Baby("Малышка", 100, harpForBaby);
        }
        Orchestra orchestra = new Orchestra(babies);

        Floor floor = new Floor(FLOOR, orchestra);
        Alcove alcove = new Alcove(NUMBER_OF_FLOORS, Decoration.FLOWER, floor);
        alcove.join();

        System.out.println("Здесь были: ");
        for (MusicalInstrument harp : harps) harp.join();
        System.out.println();

        orchestra.join();

        Citizen citizen = new Citizen("Жители");
        citizen.comeAndWaitFor(new Visitor("Гости", Location.ZMEEVKA));

        Visitor firstVisitor = new Visitor("Гвоздик", Location.ZMEEVKA, MAIN_VISITOR_INVITATION);
        firstVisitor.setAppearance(new Shirt(true), Appearance.WASHED, Appearance.COMBED);

        Visitor[] visitors = {firstVisitor};
        for (Visitor visitor : visitors) {
            visitor.appear();
            visitor.analyzeAppearance();
        }
    }
}