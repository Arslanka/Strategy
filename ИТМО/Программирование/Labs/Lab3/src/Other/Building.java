package Other;

public class Building extends Place{
    public Building(String name) {
        super(name);
    }
    public void SetFloor(int floor, String place){
        System.out.println("События развиваются на " + floor +  " этаже объекта " + place + '.');
    }
}
