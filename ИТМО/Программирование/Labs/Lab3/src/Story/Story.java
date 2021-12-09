package Story;

import Other.*;

import java.util.ArrayList;
import java.util.List;

public class Story {

    List<Integer> list = new ArrayList<Integer>() {{
        add(1); add(2); add(3);
    }};

    public static void main(String[] args) {
        Alcove alcove = new Alcove("Беседка");
        alcove.SetFloor(2, alcove.getName());
        alcove.printEnvironment();
        for (Harp harp : Harp.values()) {
            System.out.println(harp);
        }
        Orechestra orechestra = new Orechestra(10, new Baby("Малышка"), "Арфа");

        orechestra.announce();
        Nailick nailick = new Nailick("Гвоздик ", "чистенький, умытый, причесанный");
        nailick.Appeared();
        nailick.getAppearance();
    }
}
