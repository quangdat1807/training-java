package managerEl;

public class Human implements Comparable<Human> {
    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Human() {
        super();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Human o) {
        // TODO Auto-generated method stub
        if (this.getFirstName() != null && o.getFirstName() != null) {
            if (this.getFirstName().equals(o.getFirstName())) {
                if (this.getLastName() != null && o.getFirstName() != null) {
                    return this.getLastName().compareTo(o.getLastName());
                } else if (this.getLastName() != null) {
                    return -1;
                }
                return 1;
            } else
                return this.getFirstName().compareTo(o.getFirstName());
        } else if (this.getFirstName() != null) {
            return -1;
        }
        return 1;
    }

    public static String fullName(String firstName, String lastName){
        String fullName = firstName +" "+ lastName;
        return fullName;
    }

    @Override
    public String toString() {
        return "Excercise1.Human [firstName=" + firstName + ", lastName=" + lastName + "]";
    }

    public void demo(){
       String abc = Worker.abc;
    }

}
