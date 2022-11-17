public abstract class Pet extends Mammal {
    //String name;
    Pet(String name){
        super(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
