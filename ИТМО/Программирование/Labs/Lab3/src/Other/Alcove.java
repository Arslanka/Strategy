package Other;

public class Alcove extends Building {
    public Alcove(String name) {
        super(name);
    }
    @Override
    public void environment() {
        System.out.println(getName() + " украшена цветами.");
    }
    @Override
    public void SetFloor(int floor, String place) {
        super.SetFloor(floor, place);
    }
}
