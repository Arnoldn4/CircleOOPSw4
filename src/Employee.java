public class Employee {
    private String name;
    private int age;
    private String title;
    private double salary;

    public Employee(String name, int age, String title, double salary){
        setName(name);
        setAge(age);
        setTitle(title);
        setSalary(salary);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    // behavioural method
    public void growOlder(){
        setName(getName());
        setAge(getAge() + 5);
        setTitle(getTitle());
        setSalary(getSalary() + 12500 );
    }
}
