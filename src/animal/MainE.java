package animal;

import java.util.ArrayList;
import java.util.List;

public class MainE {

    public static void average(List<Animal> animals) {

        int sum = 0;
        float average;
        for(Animal a : animals) {
            sum += a.getAge();

        }
        average = sum / animals.size();
        System.out.println("Average: "+ average);

    }
    public static void main(String[] args) {
        Kitten s1 = new Kitten(5,false, "meo1");
        Kitten s2 = new Kitten(9,false, "meo2");
        Kitten s3 = new Kitten(1,false, "meo5");


        List<Animal> ListKitten = new ArrayList<>(5);
        ListKitten.add(s1);
        ListKitten.add(s2);
        ListKitten.add(s3);
        System.out.println("Kitten: ");
        System.out.println(ListKitten);
        average(ListKitten);

        Tomcat t1 = new Tomcat(3,true, "meo1");
        Tomcat t2 = new Tomcat(5,true, "meo2");
        Tomcat t3 = new Tomcat(5,true, "meo5");

        List<Animal> ListTomcat = new ArrayList<>(3);
        ListTomcat.add(t1);
        ListTomcat.add(t2);
        ListTomcat.add(t3);
        System.out.println("Tomcat: ");
        System.out.println(ListTomcat);
        average(ListTomcat);

    }
}
