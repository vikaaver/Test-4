public class Person {
    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String info (){
        return String.format("%s %s", firstName, lastName);
    }



}
