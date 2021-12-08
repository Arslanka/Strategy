package Story;

import Other.*;

public class Story {
    public static void main(String[] args) {
       Alcove alcove = new Alcove("Беседка");
       alcove.SetFloor(2, alcove.getName());
       alcove.environment();
       for (Harp harp: Harp.values()) {
           System.out.println(harp);
       }
       Orechestra orechestra = new Orechestra(10, new Baby("Малышка"),"Арфа");
       orechestra.announce();
       Nailick nailick = new Nailick("Гвоздик ", "чистенький, умытый, причесанный");
       nailick.Appeared();
       nailick.getAppearance();
    }
}
