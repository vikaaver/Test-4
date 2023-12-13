public class Employee extends Person {
    public double salary;

    public Employee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    @Override
    public String info() {

        return String.format("%s %s (%f)", firstName, lastName, salary);
    }
}