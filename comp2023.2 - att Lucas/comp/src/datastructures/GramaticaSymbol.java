package comp.src.datastructures;


public abstract class GramaticaSymbol {

    protected String name;

    public abstract String generateJavaCode();

    public GramaticaSymbol(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GramaticaSymbol [name=" + name + "]";
    }


}