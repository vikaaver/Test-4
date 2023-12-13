public class Main {
    public static void main(String[] args) {
        Person person= new Person ("Vika", "Aver");
        Employee employee = new Employee("Vika", "Aver", 2300);

        System.out.println(employee.info());
    }
}
