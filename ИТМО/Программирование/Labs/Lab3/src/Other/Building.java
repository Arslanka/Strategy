package Other;

public class Building extends Place{
    public Building(String name) {
        super(name);
    }
    @Override
    public void printEnvironment() {
        System.out.println("Вокруг ничего нет");
    }
    public void Floor(int floor, String place){
        System.out.println("События развиваются на " + floor +  " этаже объекта " + place + '.');
    }
}
