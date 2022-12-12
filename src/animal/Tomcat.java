package animal;

public class Tomcat extends Animal implements ISound {
    public Tomcat(int age, boolean sex, String name) {
        super(age, sex, name);
    }

    public Tomcat() {
    }

    @Override
    public String iSound() {
        String soundC = "Tomcat mew";
        return soundC;
    }
}
