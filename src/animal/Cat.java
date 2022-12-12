package animal;

public class Cat extends Animal implements ISound{

    public Cat(int age, boolean sex, String name) {
        super(age, sex, name);
    }

    @Override
    public String iSound() {
        String soundCat = "Cat meow";
        return soundCat;
    }
}
