package Other;

abstract class Place {
    private final String name;
    Place(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void environment() {
        System.out.println("Поблизости ничего нет.");
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Place){
            return name.equals(((Place)obj).getName());
        }
        return false;
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 123 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = (123 * hash) % (int) 1e9 + 7;
        return hash;
    }
}
