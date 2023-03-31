public class EmployeeStatus {
    public static void main(String[] args) {
        Employee employee01 = new Employee("Joe Bloggs", 42, "Software Engineer", 52000);

        System.out.println("Name : " + employee01.getName());
        System.out.println("Age :" + employee01.getAge() + "yrs");
        System.out.println("Title : " + employee01.getTitle());
        System.out.println("Salary : " + "£" + employee01.getSalary());
        System.out.println();
        // call growOlder on employee01
        employee01.growOlder();
        System.out.println("Employee status after 5 years...");
        System.out.println("Name : " + employee01.getName());
        System.out.println("Age :" + employee01.getAge() + "yrs");
        System.out.println("Title : " + employee01.getTitle());
        System.out.println("Salary : " + "£" + employee01.getSalary());
    }
}
