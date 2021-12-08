package Other;

abstract class Character implements Appearance {
    private String appearance;
    private final String name;

    public Character(String name, String appearance) {
        this.appearance = appearance;
        this.name = name;
    }

    public Character(String name) {
        this.name = name;
    }

    public void getAppearance() {
        System.out.println(name + " - " + appearance);
    }

    public void Appeared() {
        System.out.println(name + "пришел на объект");
    }
}
