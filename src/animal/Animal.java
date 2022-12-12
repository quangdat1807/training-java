package animal;

import java.util.List;

public class Animal {
    private String name;
    private int age;
    private boolean sex;


    public Animal(int age, boolean sex, String name) {
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    public Animal() {

    }
    public static void average(List<Animal> animalList) {
        int sum = 0;
        float average;
        for(Animal a : animalList) {
            sum += a.getAge();
        }
        average = sum / animalList.size();
        System.out.println("Average "+ animalList + ":" + average);
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String sexName = "male";
        if(!sex){
            sexName = "female";
        }
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sexName +
                '}';
    }
}