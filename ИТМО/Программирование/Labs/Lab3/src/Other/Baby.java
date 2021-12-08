package Other;

public class Baby extends Character implements Musician {
    private final String name;
    public Baby(String name){
        super(name);
        this.name = name;
    }
    public void instrument(String instrument) {
        System.out.println(name + " играет на музыкальном инструменте " + instrument + '.');
    }
    @Override
    public void sound(String sound) {
        System.out.println(name + ", играя, издает звук " + sound + '.');
    }
    @Override
    public void getName() {
        System.out.println(name + " здоровается с тобой.");
    }

}
