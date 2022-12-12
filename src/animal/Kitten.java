package animal;

public class Kitten extends Animal implements ISound{

    public Kitten(int age, boolean sex, String name) {
        super(age, sex, name);
    }

    public Kitten() {
        super();
    }

    @Override
    public String iSound() {
        String iSound = "Kitten meow";
        return iSound;
    }
}
